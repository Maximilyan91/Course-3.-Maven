package introductionInMaven.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping
    public String appRun() {
        return "Приложение запущено";
    }

    @GetMapping("/info")
    public String info() {
        return """
                Имя ученика: Максим Анатольевич Герасименко\s
                 Название проекта: Введение в Maven\s
                 Дата создания проекта: 17.02.2023
                 Описание проекта:  В рамкад данного курса будет создано WEB приложение для сайта рецептов""";
    }

}
