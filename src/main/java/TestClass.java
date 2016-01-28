import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Created by WQ on 2016/1/15.
 */
public class TestClass {


    private static Logger logger = Logger.getLogger(TestClass.class);

    public static void main(String[] args) {
        PropertyConfigurator.configure("log4j.properties");

//        SimpleLayout layout=new SimpleLayout();
//
//        ConsoleAppender appender=new ConsoleAppender(layout);
//
//        Logger log=Logger.getLogger(TestClass.class);
//        log.addAppender(appender);
//        log.setLevel(Level.FATAL);
//        log.debug("Here is DEBUG");
//        log.info("Here is INFO");

//        String a = "xxxx";
//        if (a.equals("b")){
//            System.out.println("ssdfjdf");
//        }
//        System.out.println("ssss");
        // 记录debug级别的信息
        logger.debug("This is debug message.");
        // 记录info级别的信息
        logger.info("This is info message.");
        // 记录error级别的信息
        logger.error("This is error message.");


    }


    public int ss(String a ,String b){
        return  1;
    }

}
