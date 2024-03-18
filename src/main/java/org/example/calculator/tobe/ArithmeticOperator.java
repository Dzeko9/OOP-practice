package org.example.calculator.tobe;

import org.example.calculator.domain.PositiveNumber;

public interface ArithmeticOperator {

    /**
     * 사칙연산 계산기 구현
     * • 요구사항
     * • 간단한 사칙연산을 할 수 있다.
     * • 양수로만 계산할 수 있다.
     * • 나눗셈에서 0을 나누는 경우 IllegalArgument 예외를 발생시킨다.
     * • MVC패턴(Model-View-Controller) 기반으로 구현한다.
     */

    boolean supports(String operator);
    int calculate(final PositiveNumber operand1, final PositiveNumber operand2);
}
