package com.urise.webapp.storage;

import com.urise.webapp.exception.StorageException;
import com.urise.webapp.model.Resume;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Array based storage for Resumes
 */
public abstract class AbstractArrayStorage extends AbstractStorage {

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
    protected void doUpdate(Resume resume, Object index) {
        storage[(int) index] = resume;
    }

    @Override
    public void doSave(Resume resume, Object index) {
        if (size == STORAGE_LIMIT) {
            throw new StorageException("Storage overflow", resume.getUuid());
        }
        insertElement(resume, (Integer) index);
        size++;
    }

    @Override
    public Resume doGet(Object index) {
        return storage[(int) index];
    }

    @Override
    public void doDelete(Object index) {
        fillDeletedElement((Integer) index);
        storage[size - 1] = null;
        size--;
    }

    public Resume[] getAll() {
        return Arrays.copyOf(storage, size);
    }

//    public Resume[] getAll() {
//        return Arrays.copyOf(storage, size);
//    }

    @Override
    public List<Resume> getAllSorted() {
        List<Resume> list = Arrays.asList(Arrays.copyOf(storage, size));
        list.sort(Comparator.comparing(Resume::getFullName).thenComparing(Resume::getUuid));
        return list;
    }

    public int size() {
        return size;
    }

    @Override
    protected boolean isExist(Object index) {
        return (Integer) index >= 0;
    }
}