package ru.itgirl.firstspringproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.itgirl.firstspringproject.service.TranslateService;

@RestController
public class FirstController {

    private TranslateService translateService;

    @Autowired
    public FirstController(TranslateService translateService) {
        this.translateService = translateService;
    }

    @GetMapping("/dayOfWeek")
    public String dayOfWeek(@RequestParam(value = "name", defaultValue = "Хороший день") String name) {
        return String.format("Сегодня %s!", translateService.translateDayOfWeek(name));
    }

}
