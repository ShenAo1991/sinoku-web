package org.sinoku.web.dao.management;

import org.sinoku.common.entity.management.ManagementUserEntity;

import java.util.List;

/**
 * 运营用户Dao
 * Created by ao.shen on 2017/6/29.
 */
public interface ManagementUserDao {

    /**
     * 获取用户
     * */
    public List<ManagementUserEntity> getManagementUser(ManagementUserEntity userEntity);

    /**
     * 添加运营用户
     * @param userEntity
     * @return
     */
    public Integer addManagementUser(ManagementUserEntity userEntity);

    /**
     * 获取登录用户
     * @param entity
     * @return
     */
    public ManagementUserEntity getLoginManagement(ManagementUserEntity entity);
}
