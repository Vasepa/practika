package ru.neoflex.practice.controller;// Базовый пакет, тут не меняла
import org.springframework.web.bind.annotation.RestController;// для аннотации
import org.springframework.web.bind.annotation.GetMapping;//аннотация без этого не work
import org.springframework.web.bind.annotation.PathVariable;// аннотация, которая извлекает значения из шаблонов
@RestController // ан-ия

public class CalsController {// объявление публичного класса

    @GetMapping ("/plus/{a}/{b}")//аннотация
         public Integer plus(// публичный метод с заданным типом (плюс)
            @PathVariable("a") Integer a,
            @PathVariable("b") Integer b) {
        return a + b;} //первый метод коначется тут

    @GetMapping("/minus/{a}/{b}")
    public Integer minus(
            @PathVariable("a") Integer a,
            @PathVariable("b") Integer b) {
        return a - b;//конец второго метода
    }

}
