package org.sinoku.common.entity.management;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by ao.shen on 2017/6/29.
 */
public class ManagementUser implements Serializable{

    /**主键id*/
    private Integer id;

    /**用户名*/
    private String userName;

    /**密码*/
    private String password;

    /**创建时间*/
    private Date createTime;

    /**更新时间*/
    private Date updateTime;

    /**手机号码*/
    private String mobileNum;

    /**是否删除 0否 1是*/
    private Integer isDelete;


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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }
}
