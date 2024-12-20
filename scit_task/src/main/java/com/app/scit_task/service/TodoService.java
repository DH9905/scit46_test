package com.app.scit_task.service;

import com.app.scit_task.DTO.TodoDTO;
import com.app.scit_task.Entity.TodoEntity;
import com.app.scit_task.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public void saveTodo(TodoDTO todoDTO){
        TodoEntity todoEntity = new TodoEntity();
        todoEntity.setStatus(todoDTO.getStatus());
        todoEntity.setImportance(todoDTO.getImportance());
        todoEntity.setCategories(todoDTO.getCategories());
        todoEntity.setTodo(todoDTO.getTodo());
        todoEntity.setRegdate(todoDTO.getRegdate());
        todoRepository.save(todoEntity);
    }

    public List<TodoDTO> selectTodo(){
        List<TodoEntity> todolist = todoRepository.findAll();
        return todolist.stream().map(TodoDTO::todoEntity).collect(Collectors.toList());

    }

    public void tododelete(Long id){
        todoRepository.deleteById(id);
    }



}
