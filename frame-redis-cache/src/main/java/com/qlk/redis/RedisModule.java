package com.qlk.redis;

import java.io.IOException;
import java.util.Properties;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * redisģ�� redis ���ӳ� redis ����
 * 
 * @author shuyun
 *
 */
public class RedisModule {
	private static RedisModule redisModule;
	private JedisPool jedisPool;

	public static void main(String[] args) {
		RedisModule instance = getInstance();
		Jedis resource = instance.jedisPool.getResource();
		String lpop = resource.lpop("a");
		System.out.println(lpop);

	}

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

		// ����jedis������ʵ��

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
	/**
	 * ����ֵ
	 * 
	 * @param key
	 * @param value
	 */
	public void set(String key, String value) {
		Jedis jedis = jedisPool.getResource();
		jedis.set(key, value);
		jedis.close();
	}

	/**
	 * ��ȡֵ
	 * 
	 * @param key
	 * @return
	 */
	public String get(String key) {
		Jedis jedis = jedisPool.getResource();
		String value = jedis.get(key);
		jedis.close();
		return value;
	}

}
