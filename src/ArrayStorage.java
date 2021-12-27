import java.util.Arrays;
/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];
    int size;

    void clear() {
        Arrays.fill(storage, 0, size(), 0);
    }

    void save(Resume r) {
        for (int i = 0; i < storage.length - 1; i++) {
            if (storage[i] == null) {
                storage[i] = r;
                size++;
            } else if (storage[i].uuid.equals(r.uuid)) {
                System.out.println("Такое резюме уже есть");
            }
        }
    }

    Resume get(String uuid) {

//        for (int i = 0; i < storage.length; i++) {
//            while (storage[i] != null) {
//                if (storage[i].uuid.equals(uuid)) {
//                    return storage[i];
//                }
//            }
//        }
//        return null;
//    }
        int i = 0;
        while (storage[i] != null) {
            if (storage[i].uuid.equals(uuid))
                return storage[i];
            i++;
        }
        return null;
    }

    void delete(String uuid) {

    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        return Arrays.copyOf(storage, size());
    }

    int size() {
        return 0;
    }
}
