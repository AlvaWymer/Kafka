package cn.mldn.springkafka.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = { "classpath:spring/spring-kafka-consumer.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class TestSpringKafkaConsumer {
	static {
		System.setProperty("java.security.auth.login.config", "/Users/paul/git/kafka/mySpringKafka/jaas/kafka_client_jaas.conf"); // 表示系统环境属性
	}

	@Test
	public void testConsumer() throws Exception {
		Thread.sleep(Long.MAX_VALUE);
	}
}
