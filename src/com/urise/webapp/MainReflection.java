package com.urise.webapp;

import com.urise.webapp.model.Resume;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainReflection {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Resume resume = new Resume();
        System.out.println("resume = " + resume);
        Field field = resume.getClass().getDeclaredFields()[0];
        System.out.println("field.getName() = " + field.getName());
        field.setAccessible(true);
        System.out.println("field.getName() = " + field.getName());
        field.get(resume);
        System.out.println("resume = " + resume);
        field.set(resume, "new_uuid");
        System.out.println("resume = " + resume);

        // TODO : invoke resume.toString via reflection
        Method method = resume.getClass().getDeclaredMethod("toString", null);
        method.invoke(resume, null);
        System.out.println(resume.toString());
        System.out.println("method = " + method);
        System.out.println("resume = " + resume);
    }
}
