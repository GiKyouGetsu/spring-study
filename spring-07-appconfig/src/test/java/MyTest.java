import com.wei.config.WeiConfig;
import com.wei.pojo.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(WeiConfig.class);
        User user = context.getBean("getUser", User.class);
        System.out.println(user.toString());
    }
}
