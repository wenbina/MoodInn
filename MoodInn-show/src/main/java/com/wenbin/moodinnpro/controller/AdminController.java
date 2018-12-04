package com.wenbin.moodinnpro.controller;

import com.wenbin.moodinnpro.common.utils.R;
import com.wenbin.moodinnpro.entity.Admins;
import com.wenbin.moodinnpro.entity.layuicode;
import com.wenbin.moodinnpro.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/AdminApi")
public class AdminController {
    @Autowired
    AdminService service;
    //查询全部
    @RequestMapping("getAdminAll")
    @ResponseBody
    public layuicode getAll(String adminno,String adminemail, String adminname,int page,int limit){
        layuicode code=new layuicode();
        code.setCode(0);
        code.setCount(service.getAdminCount(adminno,adminemail,adminname));
        code.setMsg("查询成功！");
        code.setData(service.getAdminAll(adminno,adminemail,adminname,((page-1)*limit),limit));
        return code;
    }
    //查询登陆
    @RequestMapping("login")
    @ResponseBody
    public R login(Admins admins, HttpServletRequest request){
        int row=service.loginAdmin(admins);
        if(row>0){
            HttpSession session=request.getSession();
            session.setAttribute("AdminName",admins.getAdminname());
            return R.ok("登陆成功！");
        }
        else {
            return R.error("登陆失败！");
        }
    }
    //获取管理员名称
    @RequestMapping(value = "/getAdminName",method = RequestMethod.POST)
    @ResponseBody
    public String getAdminrName(HttpServletRequest request){
        HttpSession session=request.getSession();
        Object AdminName=session.getAttribute("AdminName");
        String AdminNames=(String)AdminName;
        System.out.println(AdminNames);
        return AdminNames;
    }
    @RequestMapping("/jsonp")

    public String Jsonp(){
        return "jsonp跨域请求";
    }

}
