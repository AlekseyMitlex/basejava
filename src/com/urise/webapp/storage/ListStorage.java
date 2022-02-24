package com.urise.webapp.storage;

import com.urise.webapp.model.Resume;

import java.util.Iterator;

public class ListStorage extends AbstractStorage {

    @Override
    public void clear() {
        Iterator<Resume> iterator = storage.iterator();
        while (iterator.hasNext()) {
            iterator.remove();
        }
    }

    @Override
    public void update(Resume resume) {

    }

    @Override
    public void save(Resume resume) {

    }

    @Override
    public Object get(String uuid) {
        return null;
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
}
