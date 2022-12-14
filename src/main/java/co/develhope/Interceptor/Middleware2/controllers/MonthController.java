package co.develhope.Interceptor.Middleware2.controllers;

import co.develhope.Interceptor.Middleware2.entities.Month;
import co.develhope.Interceptor.Middleware2.interceptors.MonthInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Component
@RestController
@RequestMapping("/months")
public class MonthController {
    @Autowired
    private MonthInterceptor monthInterceptor;

    @GetMapping("/{id}")
    public Month getMesi(@PathVariable int id) {
        List<Month> mesi = monthInterceptor.getRightMonths();
        for (Month m : mesi) {
            if (m.getId() == id) {
                return m;
            }
            }
            return new Month(0, "nope", "nope", "nope");


        }
    }