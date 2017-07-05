package org.sinoku.common.entity.common;

/***
 *
 * Created by ao.shen on 2017/6/29.
 * 通用结果实体类
 */
public class ResultEntity extends CommonEntity{

    /***********当前页码***************/
    public static final String pageindex = "pageindex";

    /***********最大页码***************/
    public static final String pageSize = "pageSize";


    /************总条数**************/
    public static final String total = "total";

    protected Integer returnCode;

    protected String message = "";


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    protected Object result;

    public ResultEntity() {
        super();
    }

    public Integer getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(Integer returnCode) {
        this.returnCode = returnCode;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public static String getPageindex() {
        return pageindex;
    }


    public static ResultEntity getSuccessResult(String message){
        ResultEntity entity = new ResultEntity();
        entity.setMessage(message);
        entity.setReturnCode(0);
        return entity;
    }

    public static ResultEntity getErrorResult(String message){
        ResultEntity entity = new ResultEntity();
        entity.setMessage(message);
        entity.setReturnCode(999);
        return entity;
    }

}
