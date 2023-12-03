package ru.itgirl.firstspringproject.service;

import org.springframework.stereotype.Service;

@Service
public class TranslateService {
    public String translateDayOfWeek(String name) {
        return switch (name) {
            case "MONDAY" -> "Понедельник";
            case "TUESDAY" -> "Вторник";
            case "WEDNESDAY" -> "Среда";
            case "THURSDAY" -> "Четверг";
            case "FRIDAY" -> "Пятница";
            case "SATURDAY" -> "Суббота";
            case "SUNDAY" -> "Воскресенье";
            default -> throw new IllegalStateException("Unexpected value: " + name);
        };
    }
}
