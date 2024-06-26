package com.study.spring;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter @Setter
public class DTO {
    private String name;
    private String className;
    private int age;

    @Override
    public String toString() {
        return "DTO{" +
                "name='" + name + '\'' +
                ", className='" + className + '\'' +
                ", age=" + age +
                '}';
    }

    private String location;

}
