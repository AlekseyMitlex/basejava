package com.urise.webapp.storage;

import com.urise.webapp.model.Resume;

import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public abstract class AbstractArrayStorage implements Storage {

    protected static final int STORAGE_LIMIT = 3;
    protected Resume[] storage = new Resume[STORAGE_LIMIT];
    protected int size;

    protected abstract int getIndex(String uuid);

    protected abstract void addNewResume(Resume resume, int index);

    protected abstract void deleteResume(int index);

    public Resume[] getAll() {
        return Arrays.copyOf(storage, size);
    }

    public void clear() {
        Arrays.fill(storage, 0, size, null);
        size = 0;
    }

    public int size() {
        return size;
    }

    public void update(Resume resume) {
        int index = getIndex(resume.getUuid());
        if (index == -1) {
            System.out.println("Resume " + resume.getUuid() + " not exist");
        } else {
            storage[index] = resume;
        }
    }

    public void save(Resume resume) {
        int index = getIndex(resume.getUuid());
        if (size == STORAGE_LIMIT) {
            System.out.println("Storage overflow");
        } else if (index >= 0) {
            System.out.println(" This resume " + index + " already exists");
        } else {
            addNewResume(resume, index);
            size++;
        }
    }


    public void delete(String uuid) {
        int index = getIndex(uuid);
        if (index < 0) {
            System.out.println("Resume " + uuid + " not exist");
        } else {
            deleteResume(index);
            storage[size - 1] = null;
            size--;
        }
    }

    public Resume get(String uuid) {
        int index = getIndex(uuid);
        if (index == -1) {
            System.out.println("Resume " + uuid + " not exist");
            return null;
        }
        return storage[index];
    }
}