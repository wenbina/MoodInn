package com.wenbin.moodinnpro.service.impl;

import com.wenbin.moodinnpro.dao.AdminDao;
import com.wenbin.moodinnpro.entity.Admins;
import com.wenbin.moodinnpro.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceimpl implements AdminService {
    @Autowired
    AdminDao adminDao;

    @Override
    public List<Admins> getAdminAll(String adminno,String adminemail,String adminname,int page,int limit) {
        return adminDao.getAdminAll(adminno,adminemail,adminname,page,limit);
    }

    @Override
    public int getAdminCount(String adminno, String adminemail, String adminname) {
        return adminDao.getAdminCount(adminno,adminemail,adminname);
    }

    @Override
    public int loginAdmin(Admins admins) {
        return adminDao.loginAdmin(admins);
    }
}
