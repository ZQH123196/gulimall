package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author eor
 * @email zqh123196gmail.com
 * @date 2021-02-08 03:27:13
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
