package com.qlk.redis;

/**
 * redisģ�� redis ���ӳ� redis ����
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
