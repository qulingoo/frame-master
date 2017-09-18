package com.qlk.redis;

/**
 * redis模块 redis 连接池 redis 操作
 * 
 * @author shuyun
 *
 */
public class RedisModule {
	private static RedisModule redisModule;

	private RedisModule() {

	}
	
	public static RedisModule getInstance() {

		synchronized (RedisModule.class) {
			if (redisModule == null) {
				redisModule = new RedisModule();
			}
			return redisModule;
		}

	}
}
