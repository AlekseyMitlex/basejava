package com.urise.webapp.storage;

import com.urise.webapp.exception.ExistStorageException;
import com.urise.webapp.exception.NotExistStorageException;
import com.urise.webapp.model.Resume;

public abstract class AbstractStorage implements Storage {

    protected abstract void getUpdate(Resume resume, int index);

    protected abstract void getSave(Resume resume, int index);

    protected abstract Resume getResume(int index);

    protected abstract void getDelete(String uuid, int index);

    protected abstract int getIndex(String uuid);

    @Override
    public void update(Resume resume) {
        checkNotExist(resume.getUuid());
        getUpdate(resume, getIndex(resume.getUuid()));
    }

    @Override
    public void save(Resume resume) {
        int index = getIndex(resume.getUuid());
        if (index >= 0) {
            throw new ExistStorageException(resume.getUuid());
        }
        getSave(resume, index);
    }

    @Override
    public Resume get(String uuid) {
        checkNotExist(uuid);
        return getResume(getIndex(uuid));
    }

    @Override
    public void delete(String uuid) {
        checkNotExist(uuid);
        getDelete(uuid, getIndex(uuid));
    }

    public void checkNotExist(String uuid) {
        int index = getIndex(uuid);
        if (index < 0) {
            throw new NotExistStorageException(uuid);
        }
    }

}
