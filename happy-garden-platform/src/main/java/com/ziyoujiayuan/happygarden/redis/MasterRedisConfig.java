package com.ziyoujiayuan.happygarden.redis;

import com.hbxhx.runtime.redis.template.HbhxhRedisTemplate;
import com.hbxhx.utils.string.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * 主流缓存框架
 *
 * @author wanghjbuf
 * @date 2018/9/13
 */
@Configuration
public class MasterRedisConfig {

    @Bean(name = "master.jedis.pool")
    @Autowired
    public JedisPool masterJedisPool(@Qualifier("master.jedis.pool.config") JedisPoolConfig config,
                                     @Value("${master.jedis.pool.host}") String host,
                                     @Value("${master.jedis.pool.port}") int port,
                                     @Value("${master.jedis.pool.timeout}") int timeout,
                                     @Value("${master.jedis.pool.password}") String password,
                                     @Value("${master.jedis.pool.database}") int database) {
        if (StringUtils.isEmpty(password)){
            password = null;
        }

        return new JedisPool(config, host, port, timeout, password, database);
    }

    @Bean(name = "master.jedis.pool.config")
    public JedisPoolConfig masterJedisPoolConfig(@Value("${master.jedis.pool.config.maxTotal}") int maxTotal,
                                                 @Value("${master.jedis.pool.config.maxIdle}") int maxIdle,
                                                 @Value("${master.jedis.pool.config.minIdle}") int minIdle,
                                                 @Value("${master.jedis.pool.config.maxWaitMillis}") int maxWaitMillis) {
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(maxTotal);
        config.setMaxIdle(maxIdle);
        config.setMinIdle(minIdle);
        config.setMaxWaitMillis(maxWaitMillis);
        return config;
    }

    @Bean(name = "master.jedis.template")
    public HbhxhRedisTemplate hbhxhRedisTemplate(@Qualifier("master.jedis.pool") JedisPool jedisPool) {
        return new HbhxhRedisTemplate(jedisPool);
    }
}
