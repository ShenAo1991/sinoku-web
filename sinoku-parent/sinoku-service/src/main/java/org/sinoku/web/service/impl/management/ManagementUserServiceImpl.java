package org.sinoku.web.service.impl.management;

import org.sinoku.common.entity.common.ResultEntity;
import org.sinoku.common.entity.management.ManagementUserEntity;
import org.sinoku.common.utils.rsa.MD5;
import org.sinoku.web.dao.management.ManagementUserDao;
import org.sinoku.web.service.management.ManagementUserService;
import org.sinoku.web.utils.ParamsValidateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户管理实现类
 * Created by ao.shen on 2017/8/24.
 */
@Service
public class ManagementUserServiceImpl implements ManagementUserService{


    @Autowired
    private ManagementUserDao managementUserDao;

    @Override
    public ResultEntity login(ManagementUserEntity entity) {

        //1.校验参数
        ResultEntity result = ParamsValidateUtils.ifLoginParamsNull(entity);
        if(result.getReturncode()!=0){
            return result;
        }
        //2.密码加密
        entity.setUserPassword(MD5.getMD5Str(entity.getUserPassword()));
        //3.获取用户
        ManagementUserEntity managementUser = managementUserDao.getLoginManagement(entity);
        //4.判断角色权限
        //5.
        return null;
    }

}
