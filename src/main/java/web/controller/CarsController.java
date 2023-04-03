package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServise;

@Controller
public class CarsController {
    private final CarServise carServise;

    public CarsController(CarServise carServise) {
        this.carServise = carServise;
    }

    @GetMapping(value = "/cars")
    public String getCar(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        model.addAttribute("cars", carServise.getCountOfCars(count));
        return "cars";
    }
}
