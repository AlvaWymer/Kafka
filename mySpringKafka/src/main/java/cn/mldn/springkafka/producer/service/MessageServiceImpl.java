package cn.mldn.springkafka.producer.service;

import javax.annotation.Resource;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
/**
 * 消费者所使用的接口实现类
 * @author paul
 *
 */
@Service
public class MessageServiceImpl implements IMessageService {
	@Resource
	private KafkaTemplate<String, Integer> kafkaTemplate;

	@Override
	public void sendMessage(Integer value) {
		this.kafkaTemplate.sendDefault("mldn-key", value); // 进行消息发送，消息的key是固定内容
	}
}
