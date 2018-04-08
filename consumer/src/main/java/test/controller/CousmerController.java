package test.controller;/**
 * Created by 70992 on 2018/4/2.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.remote.HelloRemote;


/**
 * 消费者controller
 *
 * @author  huangl
 * @create 2018-04-02 13:46
 **/
@RestController
public class CousmerController {

    @Autowired
    HelloRemote helloRemote;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {

        return helloRemote.hello(name);
    }

}
