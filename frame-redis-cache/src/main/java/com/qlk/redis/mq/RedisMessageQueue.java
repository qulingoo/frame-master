package com.qlk.redis.mq;

/**
 * redis��Ϣ����
 * 
 * @author shuyun
 *
 */
public class RedisMessageQueue {
	/**
	 * ����������
	 * @return
	 */
	public static Producer getProducer(String topic) {
		return new Producer(topic);
	}
	/**
	 * ����������
	 * @param tipoc
	 * @param callback
	 * @return
	 */
	public static Consumer getConsumer(String tipoc, ConsumerCallback callback) {
		return new Consumer(tipoc, callback);
	}

}
