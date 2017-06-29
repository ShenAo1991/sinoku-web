package org.sinoku.base.user;

import java.io.Serializable;

/**
 * Created by ao.shen on 2017/6/27.
 */
public class ManagementUser implements Serializable{

    private String name;

    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
