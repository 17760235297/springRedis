package csii.xiao.springRedis.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import csii.xiao.springRedis.Bean.Person;


@RestController
public class HelloController {
	@Autowired
	private Person person;

	@Value("${self.message.data}")
	private String value;
	@RequestMapping(value = "hello")
	public String hello()
	{
		System.out.println(person.toString());
		return value;
	}
}
