package com.changgou.search.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @author chx
 * @version 1.0
 * @description: TODO
 * @date 2020/11/1 0001 16:23
 */
@FeignClient(name = "search")
@RequestMapping(value = "/search")
public interface SkuFeign {
    /**
     * 搜索
     * @param searchMap
     * @return
     */
    @GetMapping
    Map search(@RequestParam(required = false) Map<String,String> searchMap)throws Exception;
}