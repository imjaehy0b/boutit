package com.jscd.boutit.domain;

import java.util.Date;
import java.util.Objects;

public class UserDto {
    private int id;
    private String email;
    private String pwd;
    private String name;
    private String nickname;
    private String birth;
    private String phone;
    private Date signup_date;
    private Date login_date;
    private Date pwd_chg_date;
    private int state;
    private Date in_date;
    private String in_user;
    private Date up_date;
    private String up_user;


    public UserDto() {}

    public UserDto(int id, String email, String pwd, String name, String nickname, String birth, String phone, Date signup_date, Date login_date, Date pwd_chg_date, int state, Date in_date, String in_user, Date up_date, String up_user) {

        this.id = id;
        this.email = email;
        this.pwd = pwd;
        this.name = name;
        this.nickname = nickname;
        this.birth = birth;
        this.phone = phone;
        this.signup_date = signup_date;
        this.login_date = login_date;
        this.pwd_chg_date = pwd_chg_date;
        this.state = state;
        this.in_date = in_date;
        this.in_user = in_user;
        this.up_date = up_date;
        this.up_user = up_user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getSignup_date() {
        return signup_date;
    }

    public void setSignup_date(Date signup_date) {
        this.signup_date = signup_date;
    }

    public Date getLogin_date() {
        return login_date;
    }

    public void setLogin_date(Date login_date) {
        this.login_date = login_date;
    }

    public Date getPwd_chg_date() {
        return pwd_chg_date;
    }

    public void setPwd_chg_date(Date pwd_chg_date) {
        this.pwd_chg_date = pwd_chg_date;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Date getIn_date() {
        return in_date;
    }

    public void setIn_date(Date in_date) {
        this.in_date = in_date;
    }

    public String getIn_user() {
        return in_user;
    }

    public void setIn_user(String in_user) {
        this.in_user = in_user;
    }

    public Date getUp_date() {
        return up_date;
    }

    public void setUp_date(Date up_date) {
        this.up_date = up_date;
    }

    public String getUp_user() {
        return up_user;
    }

    public void setUp_user(String up_user) {
        this.up_user = up_user;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", birth='" + birth + '\'' +
                ", phone='" + phone + '\'' +
                ", signup_date=" + signup_date +
                ", login_date=" + login_date +
                ", pwd_chg_date=" + pwd_chg_date +
                ", state=" + state +
                ", in_date=" + in_date +
                ", in_user='" + in_user + '\'' +
                ", up_date=" + up_date +
                ", up_user='" + up_user + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDto userDto = (UserDto) o;
        return id == userDto.id && Objects.equals(email, userDto.email) && Objects.equals(pwd, userDto.pwd) && Objects.equals(name, userDto.name) && Objects.equals(nickname, userDto.nickname) && Objects.equals(birth, userDto.birth) && Objects.equals(phone, userDto.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, pwd, name, nickname, birth, phone);
    }
}
