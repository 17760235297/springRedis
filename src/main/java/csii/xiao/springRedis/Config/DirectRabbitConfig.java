package csii.xiao.springRedis.Config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DirectRabbitConfig {

	/*
	 * 队列名
	 */
	@Bean
	public Queue TestDirectQueue()
	{
		return new Queue("TestDirectQueue",true);
	}
	/*
	 * Direct交换机 起名：TestDirectExchange
	 */
	@Bean
	public DirectExchange TestDirectExchange()
	{
		return new DirectExchange("TestDirectExchange", true, false);
	}
	@Bean
    public DirectExchange lonelyDirectExchange() {
        return new DirectExchange("lonelyDirectExchange");
    }

	/*
	  * 绑定  将队列和交换机绑定, 并设置用于匹配键：TestDirectRouting
	 */
	@Bean
	public Binding bindingDirect()
	{
		return BindingBuilder.bind(TestDirectQueue()).to(TestDirectExchange()).with("TestDirectRouting");
	}
	
}
