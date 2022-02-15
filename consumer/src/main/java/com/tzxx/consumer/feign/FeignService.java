package com.tzxx.consumer.feign;

import com.tzxx.consumer.feign.sentinel.SentinelFeignFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "provider",fallback = SentinelFeignFallback.class)
public interface FeignService {

    /**
     * 调用服务提供方的输出接口.
     * @param str 用户输入
     * @return echo result
     */
    @GetMapping("/reply/{str}")
    String echo(@PathVariable("str") String str);
}
