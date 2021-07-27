package com.beanDemo.bean;

import java.time.LocalDate;

public class Person {
    private LocalDate birthDay;

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "Person{" +
                "birthDay=" + birthDay +
                '}';
    }

    public void init() {
        System.out.println("================init======================");
    }

    public void destroy() {
        System.out.println("================destroy======================");
    }
}
