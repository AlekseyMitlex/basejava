package com.urise.webapp.storage;

import com.urise.webapp.exception.StorageException;
import com.urise.webapp.model.Resume;

import java.util.Arrays;
import java.util.List;

/**
 * Array based storage for Resumes
 */
public abstract class AbstractArrayStorage extends AbstractStorage<Integer> {

    protected static final int STORAGE_LIMIT = 5;
    protected Resume[] storage = new Resume[STORAGE_LIMIT];
    protected int size;

    protected abstract Integer getSearchKey(String uuid);

    protected abstract void insertElement(Resume resume, int index);

    protected abstract void fillDeletedElement(int index);

    public void clear() {
        Arrays.fill(storage, 0, size, null);
        size = 0;
    }

    @Override
    protected void doUpdate(Resume resume, Integer index) {
        storage[index] = resume;
    }

    @Override
    public void doSave(Resume resume, Integer index) {
        if (size == STORAGE_LIMIT) {
            throw new StorageException("Storage overflow", resume.getUuid());
        }
        insertElement(resume, index);
        size++;
    }

    @Override
    public Resume doGet(Integer index) {
        return storage[index];
    }

    @Override
    public void doDelete(Integer index) {
        fillDeletedElement(index);
        storage[size - 1] = null;
        size--;
    }

    @Override
    protected List<Resume> doCopyAll() {
        return Arrays.asList(Arrays.copyOf(storage, size));
    }

    public int size() {
        return size;
    }

    @Override
    protected boolean isExist(Integer index) {
        return index >= 0;
    }
}