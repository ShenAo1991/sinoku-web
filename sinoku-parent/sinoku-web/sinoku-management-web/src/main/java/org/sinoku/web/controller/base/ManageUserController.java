package org.sinoku.web.controller.base;

import org.sinoku.common.entity.common.ResultEntity;
import org.sinoku.common.entity.manage.ManageUserEntity;
import org.sinoku.web.dao.management.ManagementUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 *
 *  系统运维用户controller
 *  Created by ao.shen on 2017/6/29.
 */
@Controller
@RequestMapping(value = "/management/user")
public class ManageUserController {

    @Autowired
    private ManagementUserDao dao;


    @ResponseBody
    @RequestMapping(value = "/adduser")
    public ResultEntity addManagementUser(ManageUserEntity user){


        List<ManageUserEntity> userList = dao.getManagementUser(new ManageUserEntity());
        System.out.println("111");
        return null;

    }

    @ResponseBody
    @RequestMapping(value = "/get1")
    public String get1(HttpServletRequest request){
        String header = request.getHeader("User-Agent");
        return header;
    }

}
