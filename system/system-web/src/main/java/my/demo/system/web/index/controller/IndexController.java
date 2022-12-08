package my.demo.system.web.index.controller;

import lombok.RequiredArgsConstructor;
import my.demo.common.util.result.Result;
import my.demo.common.util.result.ResultUtil;
import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class IndexController {

    final RedissonClient redissonClient;

    @GetMapping(value = "/redis/status")
    public Result<String> index() {
        RBucket<String> stringRBucket = redissonClient.getBucket("status");
        return ResultUtil.success(stringRBucket.get());
    }
}
