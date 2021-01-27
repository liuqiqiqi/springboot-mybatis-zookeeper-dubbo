package com.guojiayikao.dubbo.service;

import com.guojiayikao.dubbo.dao.GoodsMapper;
import com.guojiayikao.dubbo.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodsService implements GoodsMapper {


    @Autowired
    GoodsMapper goodsMapper;

    @Override
    public Goods selectByPrimaryKey(Integer id) {
        return goodsMapper.selectByPrimaryKey(id);
    }


    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Goods record) {
        return 0;
    }

    @Override
    public List<Goods> selectAll() {

        return goodsMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Goods record) {
        return 0;
    }
}
