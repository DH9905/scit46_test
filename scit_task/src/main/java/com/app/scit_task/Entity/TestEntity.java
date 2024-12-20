package com.app.scit_task.Entity;

import com.app.scit_task.DTO.TestDTO;
import com.app.scit_task.DTO.TodoDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="tbl_test")
public class TestEntity {

    @Id                     // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public static TestEntity testEntity(TestDTO TestDTO) {
        return TestEntity.builder()
                .id(TestDTO.getId())
                .build();
    }
}
