package cn.tyutzgl.kcsj.controller;

import cn.tyutzgl.kcsj.dao.UserinfoMapper;
import cn.tyutzgl.kcsj.pojo.Userinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhangguoliang
 * @created 2017-12-05 10:01
 */
@Controller
public class UserController {

    @Autowired
    UserinfoMapper userinfoMapper;

    @RequestMapping("/getUser")
    @ResponseBody
    public Userinfo getUserById(Integer id){
        return this.userinfoMapper.selectByPrimaryKey(id);
    }
}
