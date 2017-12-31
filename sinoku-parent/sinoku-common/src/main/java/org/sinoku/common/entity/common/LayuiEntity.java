package org.sinoku.common.entity.common;

import java.util.List;

/**
 * Layui 实体类
 * Created by ao.shen on 2017/12/19.
 */
public class LayuiEntity {

    private Integer code;

    private String msg;

    private List data;

    private Long count;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List getData() {
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
