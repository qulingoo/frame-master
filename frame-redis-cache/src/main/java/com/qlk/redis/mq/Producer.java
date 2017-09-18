package com.qlk.redis.mq;

import com.qlk.redis.RedisModule;

import redis.clients.jedis.Jedis;

/**
 * ЩњВњеп
 * @author shuyun
 *
 */
public class Producer {
	private String topic;
	private Jedis jedis;
	public Producer(String topic) {
		this.topic = topic;
		this.jedis = RedisModule.getInstance().getJdeis();
	}

	public void sendMessage(String message) {
		jedis.lpush(this.topic, message);
	}
	public void close() {
		jedis.close();
	}
}
