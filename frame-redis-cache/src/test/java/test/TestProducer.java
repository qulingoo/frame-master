package test;

import com.qlk.redis.mq.Producer;
import com.qlk.redis.mq.RedisMessageQueue;

public class TestProducer {
	public static void main(String[] args) {
		Producer producer = RedisMessageQueue.getProducer("a");
		producer.sendMessage("1");
		
	}
}
