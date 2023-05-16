package com.hi.deptspring.deptspring.domain;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@ToString
public class DeptDTO {

    private int deptno; // 컬럼 이름과 일치 시켜야함.
    private String dname;
    private String loc;
}
