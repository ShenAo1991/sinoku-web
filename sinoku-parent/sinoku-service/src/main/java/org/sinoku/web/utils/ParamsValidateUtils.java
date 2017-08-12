package org.sinoku.web.utils;

import org.apache.commons.lang3.StringUtils;
import org.sinoku.common.ManagementNoticeEnums;
import org.sinoku.common.entity.common.ResultEntity;
import org.sinoku.common.entity.management.ManagementUserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 参数校验,用于校验项目中的参数
 * Created by ao.shen on 2017/8/12.
 */
public class ParamsValidateUtils {

    private static Logger logger = LoggerFactory.getLogger(ParamsValidateUtils.class);

    public static ResultEntity ifLoginParamsNull(ManagementUserEntity params){
        ResultEntity entity = new ResultEntity();
        logger.debug("开始校验登录参数");
        if(StringUtils.isEmpty(params.getUserName())){
            entity.setReturnCode(ManagementNoticeEnums.USERNAME_NULL.getValue());
            entity.setMessage(ManagementNoticeEnums.USERNAME_NULL.getName());
        }
        return entity;
    }
}
