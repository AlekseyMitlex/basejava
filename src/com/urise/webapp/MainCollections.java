package com.urise.webapp;

import com.urise.webapp.model.Resume;

import java.util.*;

public class MainCollections {

    private static final String UUID_1 = "uuid1";
    private static final Resume RESUME_1;

    private static final String UUID_2 = "uuid2";
    private static final Resume RESUME_2;

    private static final String UUID_3 = "uuid3";
    private static final Resume RESUME_3;

    private static final String UUID_4 = "uuid4";
    private static final Resume RESUME_4;

    // Пример статического поля, для инициализации и обработки,
    // может пригодиться. Обрабатывается в классах сразу после полей
    static {
        RESUME_1 = new Resume(UUID_1);
        RESUME_2 = new Resume(UUID_2);
        RESUME_3 = new Resume(UUID_3);
        RESUME_4 = new Resume(UUID_4);
    }

    public static void main(String[] args) {

        Collection<Resume> collection = new ArrayList();
        collection.add(RESUME_1);
        collection.add(RESUME_2);
        collection.add(RESUME_3);
        collection.add(RESUME_4);

        for (Resume resume : collection) {
            System.out.println("resume = " + resume);
            if (Objects.equals(resume.getUuid(), UUID_1)) {
                // не может удалить в связи с тем, что используется в это время
//                collection.remove(resume);
            }
        }

        Iterator<Resume> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Resume resume = iterator.next();
            if (Objects.equals(resume.getUuid(), UUID_1)) {
                iterator.remove();
            }
        }
        System.out.println(collection.toString());

        Map<String, Resume> map = new HashMap<>();
        map.put(UUID_1, RESUME_1);
        map.put(UUID_2, RESUME_2);
        map.put(UUID_3, RESUME_3);
        // Bad!
        for (String map1 : map.keySet()) {
            System.out.println("map1 = " + map1);
        }

        for (Map.Entry<String, Resume> entry : map.entrySet()) {
            System.out.println("entry = " + entry.getValue());
        }

    }

}