import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @version 1.0
 * @author: fogcoding
 * @date: 2020/11/2 22:02
 * @e-mail: thinfog@126.com
 */
@SpringBootApplication
@ComponentScan
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class,args);

    }

}
