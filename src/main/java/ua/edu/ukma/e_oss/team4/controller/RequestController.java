package ua.edu.ukma.e_oss.team4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ua.edu.ukma.e_oss.team4.entity.Request;
import ua.edu.ukma.e_oss.team4.service.RequestService;

@Controller
@RequestMapping("/request")
public class RequestController {

//    @Autowired
//    private RequestService requestService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public  ModelAndView createRequest(@RequestParam String title, @RequestParam String text) {
        ModelAndView mv = new ModelAndView();



        return mv;
    }

    @RequestMapping(value = "/getByUser", method = RequestMethod.GET)
    public  ModelAndView getReqByUser(@RequestParam String username) {
        ModelAndView mv = new ModelAndView();



        return mv;
    }

    @RequestMapping(value = "/getById", method = RequestMethod.GET)
    public  ModelAndView getReqById(@RequestParam int id) {
        ModelAndView mv = new ModelAndView();
//        Request r = requestService.get(id);
//        mv.addObject("request", r.toString());
        return mv;
    }

    @RequestMapping(value = "/getRequests", method = RequestMethod.GET)
    public  ModelAndView getRequests() {
        ModelAndView mv = new ModelAndView();



        return mv;
    }



}
