package com.member.controller;


import com.feign.MemberApiFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private MemberApiFeign memberApiFeign;

    @RequestMapping("/getOrder")
    public String getOrder(){
        String result=restTemplate.getForObject("http://service-member:8081/getUserList",String.class);
        return result;
    }

    @RequestMapping("/getFeignOrder")
    public String getFeignOrder(){
        return memberApiFeign.getUserList();
    }
}
