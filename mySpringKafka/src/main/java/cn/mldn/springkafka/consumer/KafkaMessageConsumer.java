package cn.mldn.springkafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.listener.MessageListener;

public class KafkaMessageConsumer implements MessageListener<String, Integer> {
	@Override
	public void onMessage(ConsumerRecord<String, Integer> record) {
		System.out.println("【Kafka-Consumer】key = " + record.key() + "、value = " + record.value());
	}
}