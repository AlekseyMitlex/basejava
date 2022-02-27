package com.urise.webapp.storage;

import com.urise.webapp.model.Resume;

import java.util.HashMap;
import java.util.Map;

public class MapStorage extends AbstractStorage {

    private Map<String, Resume> storage = new HashMap<>();

    @Override
    public void clear() {
        storage.clear();
    }

    @Override
    protected void dotUpdate(Resume resume, Object index) {
        storage.replace(resume.getUuid(), resume);
    }

    @Override
    protected void doSave(Resume resume, Object index) {
        storage.put(resume.getUuid(), resume);
    }

    @Override
    protected Resume doGet(Object index) {
        return null;
    }

    @Override
    protected void doDelete(String uuid, Object index) {

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
    protected int getSearchKey(String uuid) {
        return storage.get(uuid);
    }
}
