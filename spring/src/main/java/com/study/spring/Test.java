package com.study.spring;

public class Test {
    public static void main(String[] args) {
        DTO dto = new DTO();
        dto.setName("ggg");
        dto.getName();
        System.out.println(dto.getName());


        dto.setClassName("gg");
        System.out.println(dto.getClassName());

        dto.setAge(25);
        System.out.println(dto.getAge());

        dto.setLocation("Seoul");
        System.out.println(dto.getLocation());
    }
}
