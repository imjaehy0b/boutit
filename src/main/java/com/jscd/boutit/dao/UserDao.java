package com.jscd.boutit.dao;

import com.jscd.boutit.domain.UserDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {

    //회원가입
    public void join(UserDto userDto) throws Exception;

    //email중복체크
    public int emailCheck(String email) throws Exception;

    //닉네임 중복체크
    public int nickCheck(String nickname) throws Exception;
}
