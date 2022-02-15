package com.tzxx.consumer.feign.sentinel;

import com.tzxx.consumer.feign.FeignService;
import org.springframework.stereotype.Component;

@Component
public class SentinelFeignFallback implements FeignService {
    @Override
    public String echo(String str) {
        return "error";
    }
}
