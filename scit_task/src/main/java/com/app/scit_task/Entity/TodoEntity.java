package com.app.scit_task.Entity;


import com.app.scit_task.DTO.TodoDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="tbl_todolist")
public class TodoEntity {
    @Id                     // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cash_seq;
    private String status;
    private String importance;
    private String categories;
    private String todo;
    private LocalDate regdate;

    public static TodoEntity todoDTO(TodoDTO todoDTO) {
        return TodoEntity.builder()
                .cash_seq(todoDTO.getCash_seq())
                .status(todoDTO.getStatus())
                .importance(todoDTO.getImportance())
                .categories(todoDTO.getCategories())
                .todo(todoDTO.getTodo())
                .regdate(todoDTO.getRegdate()) // regdate가 null이면 현재 시간 사용
                .build();
    }

}
