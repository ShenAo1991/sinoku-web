package org.sinoku.web.management.controller.base;

import org.sinoku.common.entity.common.ResultEntity;
import org.sinoku.common.entity.management.ManagementUser;
import org.sinoku.web.dao.management.ManagementUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 *
 *  系统运维用户controller
 *  Created by ao.shen on 2017/6/29.
 */
@Controller
@RequestMapping(value = "/management/user")
public class ManagementUserController {

    @Autowired
    private ManagementUserDao dao;


    @ResponseBody
    @RequestMapping(value = "/adduser")
    public ResultEntity addManagementUser(ManagementUser user){

        List<ManagementUser> userList = dao.getManagementUser();
        System.out.println("111");
        return null;

    }

}
