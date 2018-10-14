package ua.edu.ukma.e_oss.team4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ua.edu.ukma.e_oss.team4.entity.SessionDocs;
import ua.edu.ukma.e_oss.team4.service.SessionDocsService;

@Controller
@RequestMapping("/request")
public class SessionDocsController {

    //@Autowired
    //private SessionDocsService sDocsService;

    @RequestMapping(value = "/getSessionDocs", method = RequestMethod.GET)
    public  ModelAndView createRequest(@RequestParam int id) { //session id
        ModelAndView mv = new ModelAndView();

        //sDocsService.

        return mv;
    }

}
