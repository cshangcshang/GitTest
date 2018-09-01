package cn.zhr.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.zhr.pojo.User;
import cn.zhr.service.UserService;

public class ConsumerTest {
	@Test
	public void testA() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:dubbo-consumer.xml");
		UserService userService = context.getBean("userService", UserService.class);
		List<User> list = userService.getAll();
		for (User user : list) {
			System.out.print("id："+user.getId());
			System.out.print("名字："+user.getUsername());
			System.out.println("密码："+user.getPassword());
		}
	}
}
