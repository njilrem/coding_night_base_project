package ua.edu.ukma.e_oss.team4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ua.edu.ukma.e_oss.team4.entity.User;

@RequestMapping("/user")
@Controller
public class UserController {

    @RequestMapping(value = "/getById", method = RequestMethod.GET)
    public ModelAndView getUserById(@RequestParam int id) {
        ModelAndView mv = new ModelAndView();

        User u = new User(); //TODO

        mv.addObject("user", u.toString());
        return mv;
    }

    @RequestMapping(value = "/getByUsername", method = RequestMethod.GET)
    public ModelAndView getUserByUsername(@RequestParam String name) {
        ModelAndView mv = new ModelAndView();

        User u = new User(); //TODO

        mv.addObject("user", u.toString());
        return mv;
    }


}
