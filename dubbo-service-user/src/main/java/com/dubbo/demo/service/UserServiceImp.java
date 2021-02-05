package com.dubbo.demo.service;


import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.theo.dubbo.demoapi.service.UserService;
@Component
@Service(version = "${user.service.version}")
public class UserServiceImp implements UserService {

    @Override
    public String sayHello() {
        // TODO Auto-generated method stub
        return "HelloWorld!";
    }

}
