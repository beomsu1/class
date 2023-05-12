package com.hi.app.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// Java Beans
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ModifyTodoRequest {
    private int tno;
    private String todo;
    private String duedate;
    private String finished;
}
