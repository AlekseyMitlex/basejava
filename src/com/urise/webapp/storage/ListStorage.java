package com.urise.webapp.storage;

import com.urise.webapp.model.Resume;

import java.util.ArrayList;
import java.util.List;

public class ListStorage extends AbstractStorage {

    private List<Resume> storage = new ArrayList<>();

    @Override
    protected void insertElement(Resume resume, int index) {
    }

    @Override
    protected void fillDeletedElement(int index) {
    }

    @Override
    public void clear() {
    }

    @Override
    public void update(Resume resume) {
        storage.set(resume, get(resume.getUuid()));
    }

    @Override
    public void save(Resume resume) {
        storage.add(resume);
    }

    @Override
    public Resume get(String uuid) {
        return storage.get(getIndex(uuid));
    }

    @Override
    public void delete(String uuid) {

    }

    @Override
    public Resume[] getAll() {
        return new Resume[0];
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    protected int getIndex(String uuid) {
        for (int i = 0; i < storage.size(); i++) {
            if (uuid.equals(storage.get(i).getUuid())) {
                return i;
            }
        }
        return -1;
    }
}
