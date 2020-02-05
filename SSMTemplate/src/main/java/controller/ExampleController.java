package controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created By Andrew Duan
 * Date:2020/2/5
 * e-mail:thinfog@126.com
 */
public class ExampleController {

    @RequestMapping("/index")
    public String index() {
        return "hello";
    }


}
