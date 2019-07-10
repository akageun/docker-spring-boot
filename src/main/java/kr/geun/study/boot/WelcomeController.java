package kr.geun.study.boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * WelcomeController
 *
 * @author akageun
 * @since 2019-07-10
 */
@RestController
public class WelcomeController {

    @GetMapping("/")
    public String getWelcome() {
        return "OK";
    }
}
