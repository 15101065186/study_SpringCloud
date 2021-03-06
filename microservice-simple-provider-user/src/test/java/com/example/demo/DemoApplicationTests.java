package com.example.demo;

import com.example.demo.dao.GirlDao;
import com.example.demo.entity.Girl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    private GirlDao GirlDao;

    @Test
    public void contextLoads() {
        Girl girl = GirlDao.queryOne(1);
        System.out.println("************************************************"+girl.getName());
    }

}
