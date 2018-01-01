package org.sinoku.web.dao.management;

import org.sinoku.common.entity.manage.ManageUserEntity;

import java.util.List;

/**
 * 运营用户Dao
 * Created by ao.shen on 2017/6/29.
 */
public interface ManagementUserDao {

    /**
     * 获取用户
     * */
    public List<ManageUserEntity> getManagementUser(ManageUserEntity userEntity);

    /**
     * 添加运营用户
     * @param userEntity
     * @return
     */
    public Integer addManagementUser(ManageUserEntity userEntity);

    /**
     * 获取登录用户
     * @param entity
     * @return
     */
    public ManageUserEntity getLoginManagement(ManageUserEntity entity);
}
