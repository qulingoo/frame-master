package test;

import com.qlk.redis.mq.Consumer;
import com.qlk.redis.mq.ConsumerCallback;
import com.qlk.redis.mq.RedisMessageQueue;

public class TestConsumer {
	public static void main(String[] args) {
		Consumer consumer = RedisMessageQueue.getConsumer("a", new ConsumerCallback() {
			public void execute(String message) {
				System.out.println(message);
			}
		});
		consumer.consume();
	}
}
