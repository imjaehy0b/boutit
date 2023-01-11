package com.jscd.boutit.dao;

import com.jscd.boutit.domain.UserDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    UserDto selectUser(UserDto userDto) throws Exception;

    UserDto selectUserByEmail(String userEmail) throws Exception;

    void insertUser(UserDto userDto) throws Exception;

    int deleteUser(String email) throws Exception;

    int deleteAll() throws Exception;

    int userCount() throws Exception;
}
