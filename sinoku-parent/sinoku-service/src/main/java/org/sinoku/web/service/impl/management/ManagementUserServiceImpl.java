package org.sinoku.web.service.impl.management;

import org.sinoku.common.entity.common.LayuiEntity;
import org.sinoku.common.entity.manage.ManageUserEntity;
import org.sinoku.common.utils.rsa.MD5;
import org.sinoku.web.dao.management.ManagementUserDao;
import org.sinoku.web.service.management.ManagementUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户管理实现类
 * Created by ao.shen on 2017/8/24.
 */
@Service
public class ManagementUserServiceImpl implements ManagementUserService{


    @Autowired
    private ManagementUserDao managementUserDao;

    @Override
    public LayuiEntity login(ManageUserEntity entity) {

        //1.校验参数

        //2.密码加密
        entity.setUserPassword(MD5.getMD5Str(entity.getUserPassword()));
        //3.获取用户
        ManageUserEntity managementUser = managementUserDao.getLoginManagement(entity);
        //4.判断角色权限
        //5.
        return null;
    }

}
