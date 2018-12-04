package com.wenbin.moodinnpro.service.impl;

import com.wenbin.moodinnpro.dao.ColumnDao;
import com.wenbin.moodinnpro.entity.Columns;
import com.wenbin.moodinnpro.service.ColumnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ColumnServiceimpl implements ColumnService {
    @Autowired
    ColumnDao dao;

    @Override
    public List<Columns> getColumnAll() {
        return dao.getColumnAll();
    }
}
