import com.wei.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("userBean.xml");

        User user1 = applicationContext.getBean("user2", User.class);
       User user2 = applicationContext.getBean("user2", User.class);
       user2.setName("this is a new object ");

        System.out.println(user1.toString());
        System.out.println(user2.toString());
    }
}
