package com.example.demo;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.demo.service.CostService;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: 连新景
 * @time: 2020/4/4 23:28
 */

@Service
public class ProductServiceImpl implements ProductService {

    /**
     * 使用dubbo的注解 com.alibaba.dubbo.config.annotation.Reference。进行远程调用service
     */
    @Reference
    private CostService costService;

    @Override
    public Integer getCost(int a) {
        return costService.add(a);
    }

}
