package org.sinoku.web.utils;


import org.sinoku.common.entity.common.ResultEntity;
import org.sinoku.common.utils.common.SpringContextHolder;
import org.sinoku.web.service.management.ManagementUserService;
import org.sinoku.web.service.management.SystemAuthService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *  用于将
 *  Created by ao.shen on 16/5/17.
 */
public class AuthorityUtil {


    public static final Logger LOGGER = LoggerFactory.getLogger(AuthorityUtil.class);

    public static Map<Integer,String> auth = new HashMap<Integer, String>();

    public static Map<Integer,String> userInfo = new HashMap<Integer, String>();


    public static ManagementUserService userService;

    // 系统权限
    public static SystemAuthService systemAuthService;

    public static boolean init(){

        LOGGER.info("在时间节点:{}开始进行权限初始化",String.valueOf(new Date()));

        //对内存中的所有功能缓存进行清空
        auth.clear();

        return  true;
    }

    /**
     * 用户是否含有URL访问权限
     *
     * @param userId 用户ID
     * @param url    地址
     * @return 是/否
     */
    public static boolean hasUserUrlAuth(Integer userId, String url) {
        SystemAuthEntity entity = new SystemAuthEntity();
        entity.setUserId(userId);
        entity.setUrl(url);
        ResultEntity result = getSystemAuthServiceInstance().userAuths(entity);
        if (result.getReturnCode() == 0) {
            List<SystemAuthEntity> list = (List<SystemAuthEntity>) result.getResult();
            return list.size() > 0 && (!"0".equals(list.get(0).getAuth()) || 1 == list.get(0).getIsAll());
        }
        return false;
    }


    /**
     * 系统权限服务
     *
     * @return 系统权限
     */
    public static SystemAuthService getSystemAuthServiceInstance() {
        if (systemAuthService == null) {
            synchronized (AuthorityUtil.class) {
                systemAuthService = systemAuthService == null ? SpringContextHolder.getBean(SystemAuthService.class) : systemAuthService;
            }
        }
        return systemAuthService;
    }

}
