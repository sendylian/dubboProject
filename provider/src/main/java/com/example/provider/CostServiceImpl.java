package com.example.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.demo.service.CostService;

/**
 * @description:
 * @author: 连新景
 * @time: 2020/4/4 23:36
 */
@Service
public class CostServiceImpl implements CostService {

    /**
     * 假设之前总花费了100
     */
    private final Integer totalCost = 1000;

    /**
     * 之前总和 加上 最近一笔
     * @param cost
     * @return
     */
    @Override
    public Integer add(int cost) {
        return totalCost + cost;
    }

}
