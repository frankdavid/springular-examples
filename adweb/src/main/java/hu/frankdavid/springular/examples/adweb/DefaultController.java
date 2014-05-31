package hu.frankdavid.springular.examples.adweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class DefaultController {
    @RequestMapping("/*")
    public ModelAndView index() {
        return new ModelAndView("index");
    }
}
