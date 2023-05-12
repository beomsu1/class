package com.hi.todo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor // 기본생성자 생성해주는 어노테이션
@Getter
@Setter
@ToString
public class ModifyTodoRequest {
    private int tno;
    private String todo;
    private String duedate;
    private String finished;
}
