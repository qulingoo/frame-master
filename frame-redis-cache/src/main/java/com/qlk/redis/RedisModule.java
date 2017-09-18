package com.qlk.redis;

import java.io.IOException;
import java.util.Properties;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * redis模块 redis 连接池 redis 操作
 * 
 * @author shuyun
 *
 */
public class RedisModule {
	private static RedisModule redisModule;
	private JedisPool jedisPool;

	private RedisModule() {
		try {
			jedisPool = jedisPool();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static RedisModule getInstance() {

		synchronized (RedisModule.class) {
			if (redisModule == null) {
				redisModule = new RedisModule();
			}
			return redisModule;
		}

	}

	private JedisPool jedisPool() throws IOException {
		Properties props = new Properties();

		props.load(RedisModule.class.getClassLoader().getResourceAsStream("redis.properties"));

		// 创建jedis池配置实例

		JedisPoolConfig config = new JedisPoolConfig();
		config.setMaxIdle(Integer.valueOf(props.getProperty("jedis.pool.maxActive")));
		config.setMaxIdle(Integer.valueOf(props.getProperty("jedis.pool.maxIdle")));
		config.setMaxWaitMillis(Long.valueOf(props.getProperty("jedis.pool.maxWait")));
		config.setTestOnBorrow(Boolean.valueOf(props.getProperty("jedis.pool.testOnBorrow")));
		config.setTestOnReturn(Boolean.valueOf(props.getProperty("jedis.pool.testOnReturn")));
		JedisPool pool = new JedisPool(config, props.getProperty("redis.ip"),
				Integer.valueOf(props.getProperty("redis.port")), 20000, props.getProperty("redis.password"));
		return pool;
	}

	public Jedis getJdeis() {
		return jedisPool.getResource();
	}

}
