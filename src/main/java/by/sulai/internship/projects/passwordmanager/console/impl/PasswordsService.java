package by.sulai.internship.projects.passwordmanager.console.impl;

import by.sulai.internship.projects.passwordmanager.console.IPassword;
import by.sulai.internship.projects.passwordmanager.console.IPasswordsDao;
import by.sulai.internship.projects.passwordmanager.console.IPasswordsService;

import java.util.Set;

//todo Реализовать методы интерфейса + сингелтон
public class PasswordsService implements IPasswordsService {
    private final IPasswordsDao passwordsDao;

    public static final IPasswordsService getInstance(){
        return new PasswordsService(PasswordsInCollectionsDao.getInstance());
    }

    public PasswordsService(IPasswordsDao passwordsDao) {
        this.passwordsDao = passwordsDao;
    }

    public boolean create(IPassword password) {
        //todo impl
        throw new UnsupportedOperationException();
    }

    public IPassword get(Integer id) {
        //todo impl
        throw new UnsupportedOperationException();
    }

    public Set<IPassword> get() {
        //todo impl
        throw new UnsupportedOperationException();
    }

    public boolean update(Integer id, IPassword password) {
        //todo impl
        throw new UnsupportedOperationException();
    }

    public boolean delete(Integer id) {
        //todo impl
        throw new UnsupportedOperationException();
    }
}
