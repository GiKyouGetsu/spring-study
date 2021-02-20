import com.wei.pojo.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        People people1 = context.getBean("people", People.class);
//        People people2 = context.getBean("people2", People.class);
        people1.getCat().shout();
        people1.getDog().shout();
//        people2.getDog().shout();
    }
}
