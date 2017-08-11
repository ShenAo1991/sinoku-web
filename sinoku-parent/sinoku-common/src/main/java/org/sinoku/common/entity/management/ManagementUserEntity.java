package org.sinoku.common.entity.management;

import org.sinoku.common.entity.common.CommonEntity;

import java.io.Serializable;
import java.util.Date;

/**
 * 运营用户Bean
 * Created by ao.shen on 2017/6/29.
 */
public class ManagementUserEntity extends CommonEntity implements Serializable{

    /**主键id*/
    private Integer id;

    /**用户名*/
    private String userName;

    /**密码*/
    private String userPassword;

    /**创建时间*/
    private Date createTime;

    /**更新时间*/
    private Date updateTime;

    /**手机号码*/
    private String userTel;

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

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }
}
