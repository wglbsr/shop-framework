package com.member.service;

import com.member.entity.SystemUser;

public interface  UserService {


    public String getUserInfoById(String id);

    public void insert(SystemUser user);

    public void insertSelective(SystemUser user);

    public void delete(String id);

    public void update(SystemUser user);

    public SystemUser select(String id);


}
