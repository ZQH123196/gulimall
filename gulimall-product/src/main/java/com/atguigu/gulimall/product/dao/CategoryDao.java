package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author eor
 * @email zqh123196gmail.com
 * @date 2021-02-08 02:41:19
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
