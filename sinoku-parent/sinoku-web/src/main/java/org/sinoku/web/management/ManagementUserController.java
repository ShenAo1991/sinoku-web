package org.sinoku.web.management;

import org.sinoku.common.entity.common.ResultEntity;
import org.sinoku.common.entity.management.ManagementUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *  运营用户controller
 *  Created by ao.shen on 2017/6/28.
 */
@Controller
@RequestMapping(value = "/management/user")
public class ManagementUserController {


    @ResponseBody
    @RequestMapping(value = "/adduser")
    public ResultEntity addManagementUser(ManagementUser user){
        return null;
    }

}
