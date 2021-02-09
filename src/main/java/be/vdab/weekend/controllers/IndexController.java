package be.vdab.weekend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Controller
@RequestMapping("/")
class IndexController {
    @GetMapping
    public ModelAndView index() {
        var modelAndView = new ModelAndView("index");
        var dagVanWeek = LocalDate.now().getDayOfWeek();
        var weekend = dagVanWeek == DayOfWeek.SATURDAY || dagVanWeek == DayOfWeek.SUNDAY;
        modelAndView.addObject("weekend", weekend);
        return modelAndView;
    }
}