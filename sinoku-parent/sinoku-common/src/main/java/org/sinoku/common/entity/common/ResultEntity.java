package org.sinoku.common.entity.common;

/***
 *
 * Created by ao.shen on 2017/6/29.
 * 通用结果实体类
 */
public class ResultEntity extends CommonEntity{



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

    public static ResultEntity getSuccessResult(String message){
        ResultEntity entity = new ResultEntity();
        entity.setMessage(message);
        entity.setReturnCode(0);
        return entity;
    }

}
