package com.provider.service;

import com.api.service.DemoService;

/**
 * @ClassName DemoServiceImpl
 * @Discription 提供者-实现api接口
 * @Author 子辰
 * @Date 2020/10/31 22:12
 */
public class DemoServiceImpl implements DemoService {

    @Override
    public String hello(String name) {
        return "Hello " + name;
    }
}
