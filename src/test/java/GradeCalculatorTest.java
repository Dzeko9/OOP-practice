import org.example.grade.domain.Course;
import org.example.grade.domain.Courses;
import org.example.grade.domain.GradeCalculator;
import org.example.grade.domain.GradeResult;
import org.example.grade.ui.ConsoleOutputUI;
import org.junit.jupiter.api.Test;

import java.util.List;

public class GradeCalculatorTest {

    // 학점계산기, 코스
    // 평균학점 계산 요청 --> '학점계산기' --> (학점수×교과목 평점)의 합계 --> '코스'
    //                               --> 수강신청 총학점 수

    /**
     * 테스트 코드를 작성하는 이유?
     * 1. 문서화 역할
     * 2. 코드에 결함을 발견하기 위함
     * 3. 리팩토링 시 안정성 확보
     * 4. 테스트 하기 쉬운 코드를 작성하다 보면 더 낮은 결합도를 가진 설계를 얻을 수 있음
     *
     * TDD
     * • Test Driven Development (테스트 주도 개발)
     * • 프로덕션 코드보다 테스트 코드를 먼저 작성하는 개발 방법
     * • 기능 동작을 검증 (메서드 단위)
     *
     * BDD
     * • Behavior Driven Development (행위 주도 개발)
     * • 행위에 대한 테스트 코드를 작성하는 개발 방법
     * • 유저 시나리오 동작을 검증 (시나리오 단위)
     * • 하나의 시나리오는 Given, When, Then 구조를 가짐
     */

    @Test
    void calculateGradeTest() {
        // given
        List<Course> courses = List.of(new Course("OOP", Course.MAJOR_CREDIT, "A+"),
                new Course("자료구조", Course.MAJOR_CREDIT, "A+"),
                new Course("중국어회화", Course.GENERAL_CREDIT, "C"));

        // when
        GradeCalculator gradeCalculator = new GradeCalculator(new Courses(courses));
        GradeResult gradeResult = gradeCalculator.calculateGrade();

        // then
        ConsoleOutputUI.printGrade(gradeResult);
    }
}
