package com.wenbin.moodinnpro.service.impl;

import com.wenbin.moodinnpro.dao.ArticleDao;
import com.wenbin.moodinnpro.entity.Admins;
import com.wenbin.moodinnpro.entity.Articles;
import com.wenbin.moodinnpro.service.AdminService;
import com.wenbin.moodinnpro.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ArticleServiceimpl implements ArticleService {
    @Autowired
    ArticleDao dao;

    @Override
    public List<Articles> getArticleAll() {
        return dao.getArticleAll();
    }
}
