package com.urise.webapp;

import com.urise.webapp.model.Resume;
import com.urise.webapp.storage.MapStorage;
import com.urise.webapp.storage.Storage;

/**
 * Test for your com.urise.webapp.storage.ArrayStorage implementation
 */
public class MainTestArrayStorage {
    private final static Storage ARRAY_STORAGE = new MapStorage();

    public static void main(String[] args) {
        final Resume r1 = new Resume("Full Name_11");
        final Resume r2 = new Resume("Full Name_12");
        final Resume r3 = new Resume("Full Name_13");

        ARRAY_STORAGE.save(r1);
        ARRAY_STORAGE.save(r2);
        ARRAY_STORAGE.save(r3);

        System.out.println("Get r1: " + ARRAY_STORAGE.get(r1.getUuid()));
        System.out.println("Size: " + ARRAY_STORAGE.size());

        ARRAY_STORAGE.update(r1);

//        System.out.println("Get dummy: " + ARRAY_STORAGE.get("dummy"));

//        System.out.println("Index of r3: " + Arrays.binarySearch(ARRAY_STORAGE.storage, 0, ARRAY_STORAGE.size(), r3);

        printAll();
        ARRAY_STORAGE.delete(r1.getUuid());
        printAll();
        ARRAY_STORAGE.clear();
        printAll();

        System.out.println("Size: " + ARRAY_STORAGE.size());

    }

    static void printAll() {
        System.out.println("\nGet All");
        for (Resume r : ARRAY_STORAGE.getAllSorted()) {
            System.out.println(r);
        }
    }
}
