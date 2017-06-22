package cn.mldn.springkafka.producer.service;
/**
 * 消费者所使用的接口
 * @author paul
 *
 */
public interface IMessageService {
	/** * 进行消息的发送，发送消息的key统一设置为“mldn-key” 
	 * * @param value 由用户设置要发送消息的具体内容 */
	public void sendMessage(Integer value);
}