package com.jscd.boutit.dao;

import com.jscd.boutit.domain.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private UserDao userDao;

    @Override
    public UserDto selectUser(UserDto userDto) throws Exception {

        return userDao.selectUser(userDto);
    }

    @Override
    public UserDto selectUserByEmail(String userEmail) throws Exception {

        return userDao.selectUserByEmail(userEmail);
    }

    @Override
    public int deleteUser(String email) throws Exception {
        return userDao.deleteUser(email);
    }

    @Override
    public int deleteAll() throws Exception {
        return userDao.deleteAll();
    }

    @Override
    public void insertUser(UserDto userDto) throws Exception {
        userDao.insertUser(userDto);
    }

    @Override
    public int userCount() throws Exception {
        return userDao.userCount();
    }
}
