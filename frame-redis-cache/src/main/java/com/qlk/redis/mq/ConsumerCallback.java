package com.qlk.redis.mq;
/**
 * �����߻ص�����
 * @author shuyun
 *
 */
public interface ConsumerCallback {
	public void execute(String message);
}
