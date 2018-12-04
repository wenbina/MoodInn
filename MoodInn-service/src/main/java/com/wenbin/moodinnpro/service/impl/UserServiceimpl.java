package com.wenbin.moodinnpro.service.impl;

import com.wenbin.moodinnpro.dao.UserDao;
import com.wenbin.moodinnpro.entity.Users;
import com.wenbin.moodinnpro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceimpl implements UserService {
    @Autowired
    UserDao dao;

    @Override
    public List<Users> getUserAll() {
        return dao.getUserAll();
    }

    //查询全部用户
    @Override
    public List<Users> getAll(String userno, String useremail, String username, int page, int limit) {
        return dao.getAll(userno,useremail,username,page,limit);
    }
    //查询用户数量
    @Override
    public int getCountAll(String userno, String useremail, String username) {
        return dao.getCountAll(userno,useremail,username);
    }

    @Override
    public int insertUser(Users users) {
        return dao.insertUser(users);
    }

    @Override
    public int updateUser(Users users) {
        return dao.updateUser(users);
    }

    @Override
    public int deleteUser(int userid) {
        return dao.deleteUser(userid);
    }
}
