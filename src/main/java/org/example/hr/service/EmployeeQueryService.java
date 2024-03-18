package org.example.hr.service;

import org.example.hr.domain.EmployRepository;
import org.example.hr.service.dto.EmployeeCreatedResponse;

public class EmployeeQueryService {

    /**
     * 직원 데이터 전달 쿼리
     */

    private final EmployRepository employRepository;

    public EmployeeQueryService(EmployRepository employRepository) {
        this.employRepository = employRepository;
    }

    public EmployeeCreatedResponse findByNo(String no) {
        return EmployeeCreatedResponse.of(employRepository.findByNo(no));
    }
}
