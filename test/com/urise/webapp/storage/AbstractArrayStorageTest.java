package com.urise.webapp.storage;

import com.urise.webapp.exception.ExistStorageException;
import com.urise.webapp.exception.NotExistStorageException;
import com.urise.webapp.exception.StorageException;
import com.urise.webapp.model.Resume;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public abstract class AbstractArrayStorageTest {

    //    private Storage storage = new ArrayStorage();
    private Storage storage;
    private static final String UUID_1 = "uuid1";
    private static final String UUID_2 = "uuid2";
    private static final String UUID_3 = "uuid3";
    private static final String UUID_4 = "uuid4";
    private final static Resume resume1 = new Resume("uuid1");

    public AbstractArrayStorageTest(Storage storage) {
        this.storage = storage;
    }

    @Before
    public void setUp() throws Exception {
        storage.clear();
        storage.save(new Resume(UUID_1));
        storage.save(new Resume(UUID_2));
        storage.save(new Resume(UUID_3));
    }

    @Test
    public void size() {
        Assert.assertEquals(3, storage.size());
    }

    @Test
    public void getAll() {
        Resume[] allResume = new Resume[3];
        Assert.assertEquals(allResume.length, storage.size());
    }

    @Test
    public void clear() {
        storage.clear();
        Assert.assertEquals(0, storage.size());
    }

    @Test
    public void update() {
        storage.update(new Resume(UUID_1));
        Assert.assertEquals(storage.get(UUID_1), new Resume(UUID_1));
    }

//    @Test(expected = NotExistStorageException.class)
//    public void save() {
//        if (new Resume(UUID_1).equals(storage.get(UUID_1))) {
//            throw ExistStorageException;
//        }
//    }

    @Test(expected = ExistStorageException.class)
    public void getExistResume() {
        storage.save(new Resume(UUID_1));
    }

    @Test(expected = StorageException.class)
    public void getStorageOverflow() {
        storage.save(new Resume(UUID_4));
    }

    @Test
    public void delete() {
        storage.delete(UUID_1);
        Assert.assertEquals(2, storage.size());
    }

    @Test(expected = NotExistStorageException.class)
    public void deleteNotExisted() {
        storage.delete(UUID_4);
    }

    @Test
    public void get() {
        Assert.assertEquals(new Resume(UUID_1), storage.get(UUID_1));
        Assert.assertEquals(new Resume(UUID_2), storage.get(UUID_2));
        Assert.assertEquals(new Resume(UUID_3), storage.get(UUID_3));

    }

    @Test(expected = NotExistStorageException.class)
    public void getNotExist() {
        storage.get("dummy");
    }
}