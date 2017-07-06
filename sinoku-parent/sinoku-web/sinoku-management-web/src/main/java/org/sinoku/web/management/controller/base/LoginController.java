package org.sinoku.web.management.controller.base;

import org.sinoku.common.entity.common.ResultEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

        }catch (Exception e){
            LOGGER.error("用户登录出现异常.异常原因:{}",e.getMessage(),e);
            return null;
        }
        return  null;

    }


}
