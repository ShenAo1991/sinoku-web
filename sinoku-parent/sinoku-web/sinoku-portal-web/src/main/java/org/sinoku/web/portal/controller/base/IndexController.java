package org.sinoku.web.portal.controller.base;

import org.sinoku.common.entity.common.ResultEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ao.shen on 2017/7/6.
 */
@Controller
@RequestMapping(value = "/index")
public class IndexController {

    @ResponseBody
    @RequestMapping(value = "/get1")
    public ResultEntity get1(){
        ResultEntity entity = new ResultEntity();
        return entity;
    }
}
