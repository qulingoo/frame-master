package com.qlk.redis.mq;
/**
 * 消费者回调函数
 * @author shuyun
 *
 */
public interface ConsumerCallback {
	public void execute(String message);
}
