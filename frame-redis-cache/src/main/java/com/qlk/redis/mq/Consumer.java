package com.qlk.redis.mq;

/**
 * 消费者
 * 
 * @author shuyun
 *
 */
public class Consumer {
	private ConsumerWoker worker;//

	/**
	 * 
	 * @param topic
	 *           主题
	 * @param callback
	 *           回调函数
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
	 * 关闭
	 */
	public void close() {
		worker.close();
	}
}
