package com.jscd.boutit.dao;

import com.jscd.boutit.domain.UserDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class UserDaoImpl implements UserDao {

    //마이바티스
    @Autowired
    private UserDao userDao;

    //매퍼
//    private static String namespace = "com.jscd.boutit.mappers.userMapper.";

    //회원가입 쿼리
    @Override
    public void join(UserDto userDto) throws Exception {
        userDao.join(userDto);
    }

    //이메일 중복 체크 쿼리
    @Override
    public int emailCheck(String email) throws Exception {
        return userDao.emailCheck(email);
    }

    //닉네임 중복 체크
    @Override
    public int nickCheck(String nickname) throws Exception {

        return userDao.nickCheck(nickname);
    }
}
