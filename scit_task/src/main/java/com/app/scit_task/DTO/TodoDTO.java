package com.app.scit_task.DTO;


import com.app.scit_task.Entity.TodoEntity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="tbl_todolist")
public class TodoDTO {

    private Long cash_seq;
    private String status;
    private String importance;
    private String categories;
    private String todo;
    private LocalDate regdate;

    public static TodoDTO todoEntity(TodoEntity todoEntity) {
        return TodoDTO.builder()
                .cash_seq(todoEntity.getCash_seq())
                .status(todoEntity.getStatus())
                .importance(todoEntity.getImportance())
                .categories(todoEntity.getCategories())
                .todo(todoEntity.getTodo())
                .regdate(todoEntity.getRegdate()) // regdate가 null이면 현재 시간 사용
                .build();
    }

}
