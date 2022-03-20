package com.urise.webapp.storage;

import com.urise.webapp.model.Resume;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapResumeStorage extends AbstractStorage<Resume> {

    private Map<String, Resume> map = new HashMap<>();

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    protected void doUpdate(Resume resume, Resume searchKey) {
        map.replace(resume.getUuid(), resume);
    }

    @Override
    protected void doSave(Resume resume, Resume searchKey) {
        map.put(resume.getUuid(), resume);
    }

    @Override
    protected Resume doGet(Resume searchKey) {
        return searchKey;
    }

    @Override
    protected void doDelete(Resume searchKey) {
        map.remove(searchKey.getUuid());
    }

    @Override
    protected List<Resume> doCopyAll() {
        return new ArrayList<Resume>(map.values());
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    protected Resume getSearchKey(String uuid) {
        return map.get(uuid);
    }

    @Override
    protected boolean isExist(Resume searchKey) {
        return searchKey != null;
    }
}
