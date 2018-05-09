package com.example.demo.service.Impl;

import com.example.demo.dao.GirlDao;
import com.example.demo.entity.Girl;
import com.example.demo.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GirlServiceImpl implements GirlService {
    @Autowired
    private GirlDao girlDao;
    @Override
    public Girl queryOne(Integer id) {
        return girlDao.queryOne(id);
    }
}
