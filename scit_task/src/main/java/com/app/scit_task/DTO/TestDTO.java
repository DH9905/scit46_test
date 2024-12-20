package com.app.scit_task.DTO;

import com.app.scit_task.Entity.TestEntity;
import com.app.scit_task.Entity.TodoEntity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="tbl_test")
public class TestDTO {

    private Integer id;

    public static TestDTO testDTO(TestEntity TestEntity) {
        return TestDTO.builder()
                .id(TestEntity.getId())
                .build();
    }
}
