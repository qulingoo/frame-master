package com.qlk.redis.mq;

import com.qlk.redis.RedisModule;

import redis.clients.jedis.Jedis;

public class ConsumerWoker extends Thread {
	private String topic;
	private ConsumerCallback callback;
	private boolean isClose = false;
	private Jedis jedis;

	public ConsumerWoker(String topic, ConsumerCallback callback) {
		this.callback = callback;
		this.topic = topic;
		this.jedis = RedisModule.getInstance().getJdeis();
	}

	
	public void run() {
		while (!isClose) {
			if (jedis.isConnected()) {

				String message = jedis.rpop(topic);
				if (message != null) {
					callback.execute(message);
				} else {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	public void close() {
		this.isClose = true;
		this.jedis.close();
	}
}
