package org.sinoku.common;

/**
 * Created by ao.shen on 2017/8/12.
 */
public enum ManagementNoticeEnums {

    USERNAME_NULL(101,"您输入的用户名为空"),
    USERPASSWORD_NULL(102,"您输入的密码为空"),
    VERIFICATION_CODE_NULL(103,"您输入的验证码为空"),
    UNKNOWN(-1,"未知");

    private int value;
    private String name;

    private ManagementNoticeEnums(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }
    public String getName() {
        return name;
    }
    public static ManagementNoticeEnums getRecommendType(int value){

        for(ManagementNoticeEnums t : ManagementNoticeEnums.values()){
            if(t.getValue()==value)
                return t;
        }

        return UNKNOWN;
    }
    public static String getRecommendTypeArr(String value){

        for(ManagementNoticeEnums t : ManagementNoticeEnums.values()){
            value = value.replace("["+t.getValue()+"]","["+t.getName()+"]");
        }

        return value;
    }
}
