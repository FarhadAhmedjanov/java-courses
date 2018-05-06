package ru.afm.store;

import ru.afm.models.User;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * В зависимости от реализации Storage хранит данные в памяти, бд и т.д.
 */
public class UserCache implements Storage {
    private static final UserCache INSTANCE = new UserCache();

    private final Storage storage;

    private UserCache(){
        storage = new HibernateStorage();
    }

    public static UserCache getInstance(){
        return INSTANCE;
    }

    @Override
    public Collection<User> values() {
        return this.storage.values();
    }

    @Override
    public int add(User user) {
        return this.storage.add(user);
    }

    @Override
    public void edit(User user) {
        this.storage.edit(user);
    }

    @Override
    public void delete(int id) {
        this.storage.delete(id);
    }

    @Override
    public User get(int id) {
        return this.storage.get(id);
    }

    @Override
    public User findByLogin(String Login) {
        return this.storage.findByLogin(Login);
    }

    @Override
    public int generateId() {
        return this.storage.generateId();
    }

    @Override
    public void close() {
        this.storage.close();
    }
}
