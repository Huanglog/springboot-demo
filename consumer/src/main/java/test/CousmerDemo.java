package test;/**
 * Created by 70992 on 2018/4/2.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 消费者测试
 *
 * @author  huangl
 * @create 2018-04-02 13:35
 **/
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
@EnableFeignClients
public class CousmerDemo {

    public static void main(String[] args) {
        SpringApplication.run(CousmerDemo.class, args);
    }
}
