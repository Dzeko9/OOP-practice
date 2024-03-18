package org.example.hr.service;

import org.example.hr.domain.EmployRepository;
import org.example.hr.service.dto.EmployeeCreateRequest;

public class EmployeeCommandService {

    /**
     * DTO : 프로세스 간에 데이터를 전달하는 객체
     */

    private final EmployRepository employRepository;

    public EmployeeCommandService(EmployRepository employRepository) {
        this.employRepository = employRepository;
    }

    public void add(EmployeeCreateRequest createRequest) {
        employRepository.createEmployee(createRequest.toDomain());
    }
}
