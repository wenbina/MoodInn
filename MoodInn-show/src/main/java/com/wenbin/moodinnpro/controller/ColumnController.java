package com.wenbin.moodinnpro.controller;

import com.wenbin.moodinnpro.entity.layuicode;
import com.wenbin.moodinnpro.service.ColumnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ColumnApi")
public class ColumnController {
    @Autowired
    ColumnService service;

    @RequestMapping("getColumnAll")
    @ResponseBody
    public layuicode getColumnAll(){
        layuicode code=new layuicode();
        code.setCode(0);
        code.setCount(100);
        code.setMsg("查询成功");
        code.setData(service.getColumnAll());
        return code;
    }
}
