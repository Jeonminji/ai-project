package com.min.aiproject.service;

import com.min.aiproject.entity.TestEntity;
import com.min.aiproject.repository.TestRepository;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    private final TestRepository testRepository;


    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    public TestEntity create(TestEntity testEntity) {
        return testRepository.save(testEntity);
    }
}
