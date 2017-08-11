package org.sinoku.common.entity.management;

import com.alibaba.fastjson.annotation.JSONField;
import org.sinoku.common.entity.common.CommonEntity;

import java.io.Serializable;
import java.util.Date;

/**
 *  权限模块entity
 *  Created by ao.shen on 2017/7/2.
 */
public class ManagementModuleEntity extends CommonEntity implements Serializable{

    private static final long serialVersionUID = -4476327219680253466L;

    private String id;
    private String parentId;
    private Integer userId;
    private String userName;
    private Integer groupId;
    private String interfaceId;
    private String title;
    private String name;
    private String code;
    private String url;
    private Byte isDom;
    private String dom;
    private String domType;
    private String domDefault;
    private Byte type;
    private Byte state;
    private Byte visible;
    private Byte isAll;
    private Integer order;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    // 权限（0:无 !=0:有）
    private String auth;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getInterfaceId() {
        return interfaceId;
    }

    public void setInterfaceId(String interfaceId) {
        this.interfaceId = interfaceId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Byte getIsDom() {
        return isDom;
    }

    public void setIsDom(Byte isDom) {
        this.isDom = isDom;
    }

    public String getDom() {
        return dom;
    }

    public void setDom(String dom) {
        this.dom = dom;
    }

    public String getDomType() {
        return domType;
    }

    public void setDomType(String domType) {
        this.domType = domType;
    }

    public String getDomDefault() {
        return domDefault;
    }

    public void setDomDefault(String domDefault) {
        this.domDefault = domDefault;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Byte getVisible() {
        return visible;
    }

    public void setVisible(Byte visible) {
        this.visible = visible;
    }

    public Byte getIsAll() {
        return isAll;
    }

    public void setIsAll(Byte isAll) {
        this.isAll = isAll;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
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

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }
}
