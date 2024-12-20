package com.app.scit_task.service;

import com.app.scit_task.DTO.TestDTO;
import com.app.scit_task.Entity.TestEntity;
import com.app.scit_task.Repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TestService {

    @Autowired
    private TestRepository testRepository;

    public List<TestDTO> selectAll(){
        List<TestEntity> list = testRepository.findAll();
        return list.stream().map(TestDTO::testDTO).collect(Collectors.toList());
    }


}
