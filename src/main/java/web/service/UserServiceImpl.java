package web.service;


import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.model.User;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void deleteUserById(long id) {
        userDao.deleteUserById(id);
    }

    @Override
    public void updateUserById(long id, User user) {
        userDao.updateUserById(id, user);
    }

    @Override
    public User getUserById(long id) {
        return userDao.getUserById(id);
    }

    @Override
    public List<User> getListOfUsers() {
        return userDao.getListOfUsers();
    }
}
