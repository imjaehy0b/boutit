package com.jscd.boutit.dao;

import com.jscd.boutit.domain.UserDto;
import org.assertj.core.util.DateUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class UserDaoImplTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void insertTestData() throws Exception {
//        userDao.deleteAll();
        for (int i = 1; i < 221; i++) {
            UserDto userDto = new UserDto(0, "test"+i+"@test.com","1234","테스트"+i,"test"+i,"20230101","010-1234-1234", DateUtil.now(),DateUtil.now(),DateUtil.now(),1,DateUtil.now(),"admin",DateUtil.now(),"admin");
            userDao.insertUser(userDto);
        }
    }

    @Test
    void selectUser() throws Exception {
        System.out.println(userDao.selectUserByEmail("gosmdochee2@naver.com"));
        assertTrue(userDao.selectUserByEmail("gosmdochee2@naver.com").getEmail().equals("gosmdochee2@naver.com"));
    }

    @Test
    void selectUserByEmail() {
    }

    @Test
    void deleteUser() {
    }

    @Test
    void deleteAll() {
    }

    @Test
    void insertUser() throws Exception {

        int count = userDao.userCount();
        UserDto userDto = new UserDto(0, "test@test.com", "1234", "테스트", "test", "20230101", "010-1234-1234", DateUtil.now(), DateUtil.now(), DateUtil.now(), 1, DateUtil.now(), "admin", DateUtil.now(), "admin");
        userDao.insertUser(userDto);
        assertTrue(userDao.userCount()== count+1);


    }

    @Test
    void userCount1() throws Exception {
        System.out.println(userDao.userCount());

        assertTrue(userDao.userCount()==1);
    }
}