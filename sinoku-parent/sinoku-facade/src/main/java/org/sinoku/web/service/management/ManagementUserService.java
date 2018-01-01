package org.sinoku.web.service.management;

import org.sinoku.common.entity.common.LayuiEntity;
import org.sinoku.common.entity.manage.ManageUserEntity;

/**
 * Created by ao.shen on 2017/8/11.
 */
public interface ManagementUserService {

    /**
     * 登录方法
     * @param entity
     * @return
     */
    public LayuiEntity login(ManageUserEntity entity);
}
