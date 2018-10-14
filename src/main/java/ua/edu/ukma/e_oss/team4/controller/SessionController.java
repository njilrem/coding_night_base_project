package ua.edu.ukma.e_oss.team4.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ua.edu.ukma.e_oss.team4.entity.Request;
import ua.edu.ukma.e_oss.team4.entity.Session;
import ua.edu.ukma.e_oss.team4.service.RequestService;
import ua.edu.ukma.e_oss.team4.service.SessionService;

import java.sql.Date;
import java.sql.Timestamp;

@Controller
@RequestMapping("/session")
public class SessionController {

    //@Autowired
    //private SessionService sessionService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public  ModelAndView createSession(@RequestParam String dateFrom, @RequestParam String dateTo) {
        ModelAndView mv = new ModelAndView();

        System.out.println(dateFrom + " " + dateTo);

        //Session s = sessionService.createSession(new Timestamp(Long.parseLong(dateFrom)), new Timestamp(Long.parseLong(dateTo)));

        //if (s == null) {
         //   mv.addObject("error", true);
        //} else {
          //  mv.addObject("session", s.toString());
        //}

        return mv;
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public ModelAndView createSession() {
        return new ModelAndView("hello");
    }

    @RequestMapping(value = "/getFutureSession", method = RequestMethod.GET)
    public  ModelAndView getFutureSession() {
        ModelAndView mv = new ModelAndView();

        //Session s = sessionService.getFutureSession();

        //if (s == null) {
         //   mv.addObject("error", true);
        //} else {
         //   mv.addObject("session", s.toString());
        //}

        return mv;
    }

}