package com.urise.webapp.storage;

import com.urise.webapp.model.Resume;

import java.util.Arrays;

public class SortedArrayStorage extends AbstractArrayStorage{

    @Override
    public void clear() {

    }

    @Override
    public void update(Resume resume) {

    }

    @Override
    public void delete(String uuid) {

    }

    @Override
    public Resume[] getAll() {
        return new Resume[0];
    }

    @Override
    protected void addNewResume(Resume resume) {
        int index = -(getIndex(resume.getUuid()) + 1);
        System.arraycopy(storage, index, storage, index + 1, size - index);
        storage[index] = resume;
    }

    @Override
    protected void deleteResume(String uuid, int index) {

    }

    @Override
    protected int getIndex(String uuid) {
        Resume searchKey = new Resume();
        searchKey.setUuid(uuid);
        return Arrays.binarySearch(storage,0,size,searchKey);
    }
}

