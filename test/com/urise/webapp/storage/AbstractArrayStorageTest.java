package com.urise.webapp.storage;

import com.urise.webapp.exception.ExistStorageException;
import com.urise.webapp.exception.NotExistStorageException;
import com.urise.webapp.exception.StorageException;
import com.urise.webapp.model.Resume;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public abstract class AbstractArrayStorageTest {

    private Storage storage;
    private static final String UUID_1 = "uuid1";
    private static final String UUID_2 = "uuid2";
    private static final String UUID_3 = "uuid3";
    private static final String UUID_4 = "uuid4";
    private final static Resume r4 = new Resume("uuid4");
    private final static Resume r1 = new Resume("uuid1");

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
    public void clear() {
        storage.clear();
        assertEquals(0, storage.size());
    }

    @Test
    public void update() {
        storage.update(r1);
        assertSame(r1, storage.get(UUID_1));
    }

    @Test(expected = NotExistStorageException.class)
    public void updateNotExisted() {
        storage.update(r4);
    }

    @Test(expected = ExistStorageException.class)
    public void getExistResume() {
        Resume r4 = new Resume(UUID_1);
        storage.save(r4);
    }

    @Test(expected = StorageException.class)
    public void getStorageOverflow() {
        storage.save(new Resume());
    }

    @Test
    public void delete() {
        storage.delete(UUID_1);
        assertEquals(2, storage.size());
    }

    @Test(expected = NotExistStorageException.class)
    public void deleteNotExisted() {
        storage.delete(UUID_4);
    }

    @Test
    public void get() {
        assertEquals(new Resume(UUID_1), storage.get(UUID_1));
        assertEquals(new Resume(UUID_2), storage.get(UUID_2));
        assertEquals(new Resume(UUID_3), storage.get(UUID_3));
    }

    @Test(expected = NotExistStorageException.class)
    public void getNotExist() {
        assertEquals(new Resume(UUID_1), storage.get(UUID_4));
    }

    @Test(expected = NotExistStorageException.class)
    public void getNotExistDummy() {
        storage.get("dummy");
    }

    @Test
    public void getAll() {
        Resume[] allResume = new Resume[3];
        assertEquals(allResume.length, storage.size());
    }

    @Test
    public void size() {
        assertEquals(3, storage.size());
    }
}