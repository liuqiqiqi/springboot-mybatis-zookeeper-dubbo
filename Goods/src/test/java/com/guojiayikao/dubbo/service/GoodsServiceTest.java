package com.guojiayikao.dubbo.service;

import com.guojiayikao.dubbo.GoodsApplication;
import com.guojiayikao.dubbo.entity.Goods;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
//加载主启动类
@SpringBootTest(classes = GoodsApplication.class)
class GoodsServiceTest {

    @Autowired
    private GoodsService goodsService;

    @org.junit.jupiter.api.Test
    void selectByPrimaryKey() {
        Goods u = goodsService.selectByPrimaryKey(1);
        System.out.println(u.toString());
    }

    @org.junit.jupiter.api.Test
    void selectAll() {
        List<Goods> u = goodsService.selectAll();
        System.out.println(u);
    }
}