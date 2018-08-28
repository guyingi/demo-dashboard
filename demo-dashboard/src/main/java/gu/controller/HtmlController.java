package gu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author WeiGuangWu
 * @version V1.0
 * @Package gu.controller
 * @Description: ${todo}
 * @date 2018/8/28 12:59
 */
@Controller
@RequestMapping("/html")
public class HtmlController {

    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("name", "world");

        return "thymeleaf/hello";
    }

    @RequestMapping("/bb")
    public String hey() {
        return "thymeleaf/balance";
    }
}