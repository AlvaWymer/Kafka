package cn.mldn.springkafka.test;

import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import cn.mldn.springkafka.producer.service.IMessageService;
/**
 * 生产者的测试类
 * @author paul
 *
 */
@ContextConfiguration(locations = { "classpath:spring/spring-kafka-producer.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class TestSpringKafkaProducer {
	@Resource
	private IMessageService messageService;
	static {
		System.setProperty("java.security.auth.login.config",
				"/Users/paul/git/kafka/mySpringKafka/jaas/kafka_client_jaas.conf"); // 表示系统环境属性

	}

	@Test
	public void testConsumer() throws Exception {
		for (int x = 0; x < 10; x++) {
			this.messageService.sendMessage(x);
		}
	}
}