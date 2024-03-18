package org.example.calculator.domain;



import org.example.calculator.tobe.AdditionOperator;
import org.example.calculator.tobe.ArithmeticOperator;
import org.example.calculator.tobe.DivisionOperator;

import java.util.List;

public class Calculator {

    /**
     * 객체지향 프로그래밍 특징 4가지
     * 1. 추상화 (Abstraction)
     * 2. 다형성 (Polymorphism)
     * 3. 캡슐화 (Encapsulation)
     * 4. 상속 (Inheritance)
     *
     * 객체지향 설계 원칙 5가지 (SOLID)
     * 1. SRP : Single Responsibility Principle (단일 책임의 원칙)
     * 2. OCP : Open/Closed Principle (개방 폐쇄의 원칙)
     * 3. LSP : Liskov’s Substitution Principle (리스코프 치환의 원칙)
     * 4. ISP : Interface Segregation Principle (인터페이스 분리의 원칙)
     * 5. DIP : Dependency Inversion Principle (의존성 역전의 원칙)
     *
     * 1. 도메인을 구성하는 객체에는 어떤 것들이 있는지 고민
     * 2. 객체들 간의 관계를 고민
     * 3. 동적인 객체를 정적인 타입으로 추상화해서 도메인 모델링 하기
     * 4. 협력을 설계
     * 5. 객체들을 포괄하는 타입에 적절한 책임을 할당
     * 6. 구현하기
     * 참고 : 객체지향 세계에서는 모든 객체가 능동적인 존재
     */
    private static final List<ArithmeticOperator> arithmeticOperators = List.of(new AdditionOperator(), new DivisionOperator());

    public static int calculate(PositiveNumber num1, String operator, PositiveNumber num2) {
        return arithmeticOperators.stream()
                .filter(arithmeticOperator -> arithmeticOperator.supports(operator))
                .map(arithmeticOperator -> arithmeticOperator.calculate(num1, num2))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다."));
    }
}
