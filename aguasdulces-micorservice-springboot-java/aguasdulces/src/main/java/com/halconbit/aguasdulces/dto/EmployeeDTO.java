package com.halconbit.aguasdulces.dto;

public class EmployeeDTO {
    private String identification;
    private String name;
    private int age;
    private String position;

    public EmployeeDTO() {
    }

    public EmployeeDTO(String identification, String name, int age, String position) {
        this.identification = identification;
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
