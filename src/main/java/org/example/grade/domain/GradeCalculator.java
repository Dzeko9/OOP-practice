package org.example.grade.domain;

public class GradeCalculator {

    /**
     * 학점계산기 구현
     * • 요구사항
     * • 평균학점 계산 방법 = (학점수×교과목 평점)의 합계/수강신청 총학점 수
     * • MVC패턴(Model-View-Controller) 기반으로 구현한다.
     * • 일급 컬렉션 사용
     */

    private final Courses courses;

    public GradeCalculator(Courses courses) {
        this.courses = courses;
    }

    public GradeResult calculateGrade() {
        double totalMultipliedCreditAndCourseGrade = courses.multiplyCreditAndCourseGrade();
        int totalCompletedCredit = courses.calculateTotalCompletedCredit();
        double averageGrade = totalMultipliedCreditAndCourseGrade / totalCompletedCredit;

        return new GradeResult(averageGrade, totalCompletedCredit);
    }
}
