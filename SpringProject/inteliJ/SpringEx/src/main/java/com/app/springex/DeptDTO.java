package com.app.springex;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DeptDTO {

    private int deptno;
    private String dname;
    private String loc;

    public static void main(String[] args) {

        DeptDTO dept = new DeptDTO(2,"test","loc");
        System.out.println(dept);
        dept.setDeptno(10);
        dept.setDname("ACCOUNTING");
        dept.setLoc("NEW YORK");
        System.out.println(dept.getLoc());

    }


}
