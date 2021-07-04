package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author eor
 * @email zqh123196gmail.com
 * @date 2021-02-08 02:59:02
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
