package homework23.CalcController;

import homework23.Service.CalcServiceImpl;
import homework23.exception.DivisionByZeroException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalcController {
    private final CalcServiceImpl calcServiceImp;

    public CalcController(CalcServiceImpl calcServiceImp) {
        this.calcServiceImp = calcServiceImp;
    }

    @ExceptionHandler(DivisionByZeroException.class)
    public ResponseEntity<?> handleDivisionByZero(DivisionByZeroException e) {
        return ResponseEntity.badRequest().body("На ноль делить нельзя");
    }

    @RequestMapping
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @RequestMapping("/plus")
    public String plus(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b) {
        Integer result = calcServiceImp.plus(a, b);
        if (a == null || b == null) {
            return "Недостаточно параметров";
        } else {
            return a + " + " + b + " = " + result;
        }
    }

    @RequestMapping("/minus")
    public String minus(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b) {
        Integer result = calcServiceImp.minus(a, b);
        if (a == null || b == null) {
            return "Недостаточно параметров";
        } else {
            return a + " - " + b + " = " + result;
        }
    }

    @RequestMapping("/multiply")
    public String multiply(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b) {
        Integer result = calcServiceImp.multiply(a, b);
        if (a == null || b == null) {
            return "Недостаточно параметров";
        } else {
            return a + " * " + b + " = " + result;
        }
    }

    @RequestMapping("/divide")
    public String divide(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b) {
        Integer result = calcServiceImp.divide(a, b);
        if (a == null || b == null) {
            return "Недостаточно параметров";
        } else {
            return a + " / " + b + " = " + result;
        }
    }
}