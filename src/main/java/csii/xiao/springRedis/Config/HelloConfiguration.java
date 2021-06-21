package csii.xiao.springRedis.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import csii.xiao.springRedis.Bean.Person;

@Configuration

public class HelloConfiguration {

	@Bean
	@Scope("prototype")
	public Person getPerson()
	{
		Person person=new Person();
		return person;
	}
}
