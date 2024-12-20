package com.app.scit_task.controller;

import com.app.scit_task.DTO.TestDTO;
import com.app.scit_task.DTO.TodoDTO;
import com.app.scit_task.service.TestService;
import com.app.scit_task.service.TodoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Slf4j
@RequiredArgsConstructor
public class todoController {

    @Autowired
    private TodoService todoService;

    @Autowired
    private TestService testService;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/todolist")
    public String todolist(Model model, TodoDTO todoDTO) {
        List<TodoDTO> todolist = todoService.selectTodo();
        model.addAttribute("todolist", todolist);
        return "todolist";
    }


    @PostMapping("/todolist/add")
    public String todoadd(TodoDTO todoDto){
        todoService.saveTodo(todoDto);
        return "redirect:/todolist";
    }

    @PostMapping("/todolist/delete")
    public String tododelete(@RequestParam("cash_seq") Long cash_seq){
        todoService.tododelete(cash_seq);
        return "redirect:/todolist";
    }

    @PostMapping("test")
    @ResponseBody
    public List<TestDTO> test() {
        // DB에서 데이터를 가져오는 메서드 호출
        return testService.selectAll();
    }



}
