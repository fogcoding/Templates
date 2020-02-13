import org.apache.log4j.Logger;

/**
 * Created By Andrew Duan
 * Date:2020/2/13
 * e-mail:thinfog@126.com
 */
public class Log4jFirstTest {

    private static Logger logger = Logger.getLogger(Log4jFirstTest.class);

    /**
     * @param args
     */
    public static void main(String[] args) {
        // System.out.println("This is println message.");

        // 记录debug级别的信息
        logger.debug("This is debug message.");
        // 记录info级别的信息
        logger.info("This is info message.");
        // 记录error级别的信息
        logger.error("This is error message.");

    }

}
