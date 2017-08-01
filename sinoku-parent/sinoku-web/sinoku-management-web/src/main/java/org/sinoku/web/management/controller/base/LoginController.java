package org.sinoku.web.management.controller.base;

import org.sinoku.common.entity.common.ResultEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by ao.shen on 2017/7/2.
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

    @ResponseBody
    @RequestMapping(value = "/manage/login")
    public ResultEntity login(HttpServletRequest request){

        ResultEntity entity = new ResultEntity();

        try{
            //1.参数校验
            //2.密码加密,根据用户名密码获取用户
            //3.获取权限
            //4.放入session
        }catch (Exception e){
            LOGGER.error("用户登录出现异常.异常原因:{}",e);
            return null;
        }
        return  null;

    }

    @RequestMapping(value = "index")
    public ModelAndView toIndex(){
        return new ModelAndView("/page/index.jsp");
    }


}
