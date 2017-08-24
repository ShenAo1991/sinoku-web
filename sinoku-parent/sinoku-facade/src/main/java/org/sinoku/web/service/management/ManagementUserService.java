package org.sinoku.web.service.management;

import org.sinoku.common.entity.common.ResultEntity;
import org.sinoku.common.entity.management.ManagementUserEntity;

/**
 * Created by ao.shen on 2017/8/11.
 */
public interface ManagementUserService {

    /**
     * 登录方法
     * @param entity
     * @return
     */
    public ResultEntity login(ManagementUserEntity entity);
}
