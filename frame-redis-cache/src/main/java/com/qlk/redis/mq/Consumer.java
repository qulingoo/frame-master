package com.qlk.redis.mq;

/**
 * ������
 * 
 * @author shuyun
 *
 */
public class Consumer {
	private ConsumerWoker worker;// �������߳�

	/**
	 * 
	 * @param topic
	 *            ��Ϣ��������
	 * @param callback
	 *            �ص�����
	 */
	public Consumer(final String topic, final ConsumerCallback callback) {

		this.worker = new ConsumerWoker(topic, callback);
	}

	/**
	 * ����
	 */
	public void consume() {
		worker.start();
	}

	/**
	 * ֹͣ�������߳�
	 */
	public void close() {
		worker.close();
	}
}
