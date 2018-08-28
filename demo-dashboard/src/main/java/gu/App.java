package gu;

import gu.pojo.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App
{

    public static void main( String[] args )
    {
        SpringApplication.run(App.class,args);
    }
}
