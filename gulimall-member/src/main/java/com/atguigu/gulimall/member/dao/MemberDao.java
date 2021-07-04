package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author eor
 * @email zqh123196gmail.com
 * @date 2021-02-08 03:24:02
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
