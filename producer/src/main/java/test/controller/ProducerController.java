package test.controller;/**
 * Created by 70992 on 2018/4/2.
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 生产者controller
 *
 * @author  huangl
 * @create 2018-04-02 14:35
 **/
@RestController
public class ProducerController {

    @RequestMapping("/hello")
    public String hello(@RequestParam String name) {

        return "hello " + name + ", this is first mge";
    }
}
