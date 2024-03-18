package org.example.hr.domain;

public interface EmployRepository {

    // 직원 도메인

    void createEmployee(Employee employee);

    Employee findByNo(String no);
}
