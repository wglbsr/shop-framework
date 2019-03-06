package com.member.dao;


import com.member.entity.SystemUser;
import com.member.entity.SystemUserExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SystemUserMapper {

//    @Select("select user_real_name from system_user where user_id='1'")
    @Select("select user_real_name from system_user where user_id=#{id}")
    String  getUserInfoById(@Param("id")String id);

    int countByExample(SystemUserExample example);

    int deleteByExample(SystemUserExample example);

    int insert(SystemUser record);

    int insertSelective(SystemUser record);

    List<SystemUser> selectByExample(SystemUserExample example);

    int updateByExampleSelective(@Param("record") SystemUser record, @Param("example") SystemUserExample example);

    int updateByExample(@Param("record") SystemUser record, @Param("example") SystemUserExample example);
}