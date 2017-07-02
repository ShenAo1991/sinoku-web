package org.sinoku.common.entity.management;

import org.sinoku.common.entity.common.CommonEntity;

import java.io.Serializable;

/**
 * 运营角色
 * Created by ao.shen on 2017/6/30.
 */
public class ManagementRoleEntity extends CommonEntity implements Serializable{

    private Integer id;

    private String roleName;

    private String roleCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }
}
