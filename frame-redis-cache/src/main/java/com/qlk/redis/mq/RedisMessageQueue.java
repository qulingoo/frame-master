package com.qlk.redis.mq;

/**
 * redis消息队列
 * 
 * @author shuyun
 *
 */
public class RedisMessageQueue {
	/**
	 * 获取生产者
	 * @return
	 */
	public static Producer getProducer(String topic) {
		return new Producer(topic);
	}
	/**
	 * 获取消费者
	 * @param tipoc
	 * @param callback
	 * @return
	 */
	public static Consumer getConsumer(String tipoc, ConsumerCallback callback) {
		return new Consumer(tipoc, callback);
	}

}
