package com.member.serviceimp;


import com.member.dao.SystemUserMapper;
import com.member.entity.SystemUser;
import com.member.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

@Autowired
private SystemUserMapper systemUserMapper;

    @Override
    public String getUserInfoById(String id) {
       String userinfo=systemUserMapper.getUserInfoById(id);
       return "userinfo:"+userinfo;
    }

    @Override
    public  void insert(SystemUser user) {

    }

    @Override
    public void insertSelective(SystemUser user) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void update(SystemUser user) {

    }

    @Override
    public SystemUser select(String id) {
        return null;
    }
}
