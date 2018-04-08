package test.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by 70992 on 2018/4/2.
 */
@FeignClient(name= "spring-cloud-producer")
public interface HelloRemote {

    @RequestMapping("/hello")
    public String hello(@RequestParam(value = "name") String name);
}
