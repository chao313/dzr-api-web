package com.dzr.api.vo;


import com.wordnik.swagger.annotations.ApiParam;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;

public class SignIn {

    @ApiParam(value = "用户ID", required = true)
    @NotNull(message = "用户ID未填写")
    @FormParam(value = "user")
    private String user;

    @ApiParam(value = "密码", required = true)
    @NotNull(message = "密码未填写")
    @Size(min = 6, max = 15, message = "密码长度必须为6到15位")
    @FormParam(value = "password")
    private String password;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return user;
    }
}

