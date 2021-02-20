import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wei.pojo.Hello;

public class Test01 {
	 public static void main(String[] args) {
		ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("bean.xml");
		Hello hello = (Hello) applicationContext.getBean("hello");
		
		System.out.println(hello.getStr());
	}
}
