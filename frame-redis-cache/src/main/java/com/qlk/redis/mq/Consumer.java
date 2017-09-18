package com.qlk.redis.mq;

/**
 * 消费者
 * 
 * @author shuyun
 *
 */
public class Consumer {
	private ConsumerWoker worker;// 消费者线程

	/**
	 * 
	 * @param topic
	 *            消息队列主题
	 * @param callback
	 *            回调函数
	 */
	public Consumer(final String topic, final ConsumerCallback callback) {

		this.worker = new ConsumerWoker(topic, callback);
	}

	/**
	 * 消费
	 */
	public void consume() {
		worker.start();
	}

	/**
	 * 停止消费者线程
	 */
	public void close() {
		worker.close();
	}
}
