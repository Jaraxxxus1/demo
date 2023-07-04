package com.jaraxxxus;

import lombok.*;

import java.util.HashMap;

@Data
@ToString
public class Employee {
/*
    private HashMap<String, String> departments;ihiih;n
    {
        departments = new HashMap<String, String>();
        departments.put("IT", "information tecnology");
        departments.put("HR", "human resources");
        departments.put("SALES", "SALES");
    } */
    private String name;
    private String surname;
    private int salary;
    private String department;
}
