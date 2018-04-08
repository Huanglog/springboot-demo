package test;/**
 * Created by 70992 on 2018/4/2.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka测试
 *
 * @author  huangl
 * @create 2018-04-02 11:57
 **/
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableEurekaServer
public class DemoEureka {

    public static void main(String[] args) {
        SpringApplication.run(DemoEureka.class, args);
    }

}
