package com.urise.webapp;

import com.urise.webapp.model.Resume;

import java.lang.reflect.Field;

public class MainReflection {

    public static void main(String[] args) throws IllegalAccessException {
        Resume resume = new Resume();
        Field field = resume.getClass().getDeclaredFields()[0];
        field.setAccessible(true);
        System.out.println("field.getName() = " + field.getName());
        field.get(resume);
        System.out.println("resume = " + resume);
        field.set(resume, "new_uuid");
        System.out.println("resume = " + resume);
    }
}
