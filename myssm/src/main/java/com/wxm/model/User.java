package com.wxm.model;

import java.io.Serializable;

/**
 * @author 
 */
public class User implements Serializable {
    private Integer id;

    private String userName;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}