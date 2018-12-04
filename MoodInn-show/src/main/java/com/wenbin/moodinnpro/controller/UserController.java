package com.wenbin.moodinnpro.controller;

import com.wenbin.moodinnpro.common.utils.R;
import com.wenbin.moodinnpro.entity.Users;
import com.wenbin.moodinnpro.entity.layuicode;
import com.wenbin.moodinnpro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/UserApi")
public class UserController {
    //自动装配
    @Autowired
    UserService service;

    //查询全部用户
    @RequestMapping("getUserAll")
    @ResponseBody
    public layuicode getAll(String userno,String useremail,String username,int page,int limit){
        layuicode code=new layuicode();
        code.setCode(0);
        code.setCount(service.getCountAll(userno,useremail,username));
        code.setMsg("查询成功！");
        code.setData(service.getAll(userno,useremail,username,((page-1)*limit),limit));
        return code;
    }

    @RequestMapping("insertUser")
    @ResponseBody
    public R insertUser(Users users){
        return R.ok(service.insertUser(users));
    }

    @RequestMapping("deleteUser")
    @ResponseBody
    public int deleteUser(int userid){
        return service.deleteUser(userid);
    }

    @RequestMapping("updateUser")
    @ResponseBody
    public R updateUser(Users users){
        return R.ok(service.updateUser(users));
    }

}
