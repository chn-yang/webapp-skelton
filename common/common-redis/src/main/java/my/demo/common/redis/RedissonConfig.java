package my.demo.common.redis;

import lombok.extern.slf4j.Slf4j;
import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.client.codec.StringCodec;
import org.redisson.config.Config;
import org.redisson.config.SingleServerConfig;
import org.redisson.config.TransportMode;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.nio.charset.StandardCharsets;

@Slf4j
@Configuration
public class RedissonConfig {

    @Value("${spring.data.redis.host}")
    String host;

    @Value("${spring.data.redis.port}")
    String port;

    @Value("${spring.data.redis.database}")
    Integer db;

    @Bean
    public RedissonClient redissonClient() {
        Config config = new Config();
        config.setTransportMode(TransportMode.NIO);
        config.setCodec(new StringCodec(StandardCharsets.UTF_8));

        SingleServerConfig singleServerConfig = config.useSingleServer();
        //可以用"rediss://"来启用SSL连接
        singleServerConfig.setAddress("redis://" + host + ":" + port);
        if (db != null && db >= 0 && db <= 16) {
            singleServerConfig.setDatabase(db);
        }
        RedissonClient redissonClient = Redisson.create(config);
        log.info("redisson client {}",redissonClient);
        return redissonClient;
    }
}