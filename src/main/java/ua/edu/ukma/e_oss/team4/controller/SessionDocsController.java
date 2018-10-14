package ua.edu.ukma.e_oss.team4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/request")
public class SessionDocsController {

    @RequestMapping(value = "/getSessionDocs", method = RequestMethod.GET)
    public  ModelAndView createRequest(@RequestParam int id) { //session id
        ModelAndView mv = new ModelAndView();



        return mv;
    }

}
