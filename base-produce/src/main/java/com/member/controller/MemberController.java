package com.member.controller;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import com.member.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MemberController {

    @Value("${mingcheng:100}")
    private String name;

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserList")
    public List<String> getUserList() {
        List<String> listUser = new ArrayList<String>();
        listUser.add("zhangsan");
        listUser.add("lisi");
        listUser.add("yushengjun");
        return listUser;
    }

    @ApolloConfig
    private Config config;

    @RequestMapping("/getUserInfoMybatis")
    public String getUserInfoMybatis() {
        System.out.println("1123123");
        String mingcheng = config.getProperty("mingcheng", "wwww");
        String result = userService.getUserInfoById("1");
        return result + "apollo:" + mingcheng;
    }
}

