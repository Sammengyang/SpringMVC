package com.zmy.springmvc.pojo;

import org.springframework.jdbc.core.RowCallbackHandler;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-15 9:43
 */
public class User {
    private Integer uid;
    private String uname;
    private String upassword;

    public User() {
    }

    public User(Integer uid, String uname, String upassword) {
        this.uid = uid;
        this.uname = uname;
        this.upassword = upassword;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upassword='" + upassword + '\'' +
                '}';
    }
}
