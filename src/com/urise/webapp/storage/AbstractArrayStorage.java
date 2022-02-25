package com.urise.webapp.storage;

import com.urise.webapp.exception.StorageException;
import com.urise.webapp.model.Resume;

import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public abstract class AbstractArrayStorage extends AbstractStorage {

    protected static final int STORAGE_LIMIT = 5;
    protected Resume[] storage = new Resume[STORAGE_LIMIT];
    protected int size;

    protected abstract int getIndex(String uuid);

    protected abstract void insertElement(Resume resume, int index);

    protected abstract void fillDeletedElement(int index);

    public void clear() {
        Arrays.fill(storage, 0, size, null);
        size = 0;
    }

    public void getUpdate(Resume resume, int index) {
        storage[index] = resume;
    }

    public void getSave(Resume resume, int index) {
        if (size == STORAGE_LIMIT) {
            throw new StorageException("Storage overflow", resume.getUuid());
        }
        insertElement(resume, index);
        size++;
    }

    public Resume getResume(int index) {
        return storage[index];
    }

    public void getDelete(String uuid, int index) {
        fillDeletedElement(index);
        storage[size - 1] = null;
        size--;
    }

    public Resume[] getAll() {
        return Arrays.copyOf(storage, size);
    }

    public int size() {
        return size;
    }
}