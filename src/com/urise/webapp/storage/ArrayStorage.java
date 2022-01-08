package com.urise.webapp.storage;

import com.urise.webapp.model.Resume;

import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    private Resume[] storage = new Resume[10000];
    private int size;

    public void clear() {
        Arrays.fill(storage, 0, size, null);
        size = 0;
    }

    public void update(Resume resume) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i].getUuid().equals(resume.getUuid())) {
                storage[i] = resume;
                System.out.println("Резюме : " + resume.getUuid() + " найдено и обновлено");
                break;
            } else {
                System.out.println("ERROR: не найдено - " + resume.getUuid());
            }
        }
    }

    public void save(Resume resume) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == null) {
                storage[size] = resume;
                size++;
                break;
            }
            if (storage[i].getUuid().equals(resume.getUuid())) {
                System.out.println("ERROR: Уже есть резюме - " + storage[i].getUuid());
                break;
            }
            if (size == storage.length) {
                System.out.println("ERROR: Для нового резюме нет места");
                break;
            }
        }
    }

    public Resume get(String uuid) {
        for (int i = 0; i < size; i++) {
            if (storage[i].getUuid().equals(uuid)) {
                return storage[i];
            } else {
                System.out.println("ERROR: Запрашиваемое резюме не найдено");
            }
        }
        return null;
    }

    public void delete(String uuid) {
        for (int i = 0; i < size; i++) {
            if (storage[i].getUuid().equals(uuid)) {
                storage[i] = storage[size - 1];
                storage[size - 1] = null;
                size--;
            } else {
                System.out.println("ERROR: нет резюме " + uuid + " в списке");
            }
        }
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    public Resume[] getAll() {
        return Arrays.copyOfRange(storage, 0, size);
    }

    public int size() {
        return size;
    }
}
