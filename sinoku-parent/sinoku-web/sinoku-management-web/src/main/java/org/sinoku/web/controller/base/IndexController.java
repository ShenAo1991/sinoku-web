package org.sinoku.web.controller.base;

import org.sinoku.common.entity.common.LayuiEntity;
import org.sinoku.common.entity.common.ResultEntity;
import org.sinoku.common.entity.management.ManagementUserEntity;
import org.sinoku.web.service.management.ManagementUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ao.shen on 2017/7/2.
 */
@Controller
@RequestMapping(value = "/index")
public class IndexController {

    private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private ManagementUserService managementUserService;

    String token = "error";

    @ResponseBody
    @RequestMapping(value = "/manage/login")
    public LayuiEntity login(HttpServletRequest request, ManagementUserEntity userParams){

        LayuiEntity entity = new LayuiEntity();

        try{
            //1.参数校验
            entity.setCode(0);
            entity.setMsg("登录成功");
            //2.密码加密,根据用户名密码获取用户
            //3.获取权限
            //4.放入session
        }catch (Exception e){
            LOGGER.error("用户登录出现异常.异常原因:{}",e);
            return null;
        }
        return  entity;

    }

    @RequestMapping(value = "index")
    public ModelAndView toIndex(){
        return new ModelAndView("/index/index");
    }




}
