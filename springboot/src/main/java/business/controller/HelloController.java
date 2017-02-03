package business.controller;

import business.model.BszbBusiness;
import business.service.BszbBusinessService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/hello")
public class HelloController {



    private final static Logger log = LoggerFactory.getLogger(HelloController.class);
    @Autowired
    private BszbBusinessService businessService;

    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView view = new ModelAndView("hello");
        view.addObject("name","jason");
        view.addObject("age","27");
        return view;
    }

    @RequestMapping("select")
    public List<BszbBusiness> selectAllBusiness() {
        List<BszbBusiness> bszbBusinesses = businessService.findAll();
        return businessService.findAll();
    }


    
}
