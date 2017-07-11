package org.sinoku.common.entity.management;

import java.io.Serializable;

/**
 *
 *  Created by ao.shen on 2017/7/2.
 */
public class ManagementModuleEntity implements Serializable{

    private Integer id;

    private String moduleName;

    private String moduleUrl;

    private Integer isDom;

    private Integer isVisble;

    public Integer getIsVisble() {
        return isVisble;
    }

    public void setIsVisble(Integer isVisble) {
        this.isVisble = isVisble;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getModuleUrl() {
        return moduleUrl;
    }

    public void setModuleUrl(String moduleUrl) {
        this.moduleUrl = moduleUrl;
    }

    public Integer getIsDom() {
        return isDom;
    }

    public void setIsDom(Integer isDom) {
        this.isDom = isDom;
    }

}
