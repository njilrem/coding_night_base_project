package ua.edu.ukma.e_oss.team4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ua.edu.ukma.e_oss.team4.entity.User;
import ua.edu.ukma.e_oss.team4.service.UserService;

@RequestMapping("/user")
@Controller
public class UserController {

   // @Autowired
    //private UserService userService;

    @RequestMapping(value = "/getById", method = RequestMethod.GET)
    public ModelAndView getUserById(@RequestParam int id) {
        ModelAndView mv = new ModelAndView();


       // mv.addObject("user", u.toString());
        return null;
    }

    @RequestMapping(value = "/getByUsername", method = RequestMethod.GET)
    public ModelAndView getUserByUsername(@RequestParam String name) {
        ModelAndView mv = new ModelAndView();

        //User u = userService.get(name);

        //mv.addObject("user", u.toString());
        return null;
    }


}
