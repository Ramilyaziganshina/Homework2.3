package homework23;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {
    private final CalcService calcService;

    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }
    @RequestMapping("/calculator")
    public String hello(){
        return calcService.hello();
    }

    @RequestMapping("/calculator/plus")
    public String plus(@RequestParam("num1") int a, @RequestParam("num2") int b){
        return calcService.plus(a, b);
    }

    @RequestMapping("/calculator/minus")
    public String minus(@RequestParam("num1") int a, @RequestParam("num2") int b){
        return calcService.minus(a, b);
    }

    @RequestMapping("/calculator/multiply")
    public String multiply(@RequestParam("num1") int a, @RequestParam("num2") int b){
        return calcService.multiply(a, b);
    }

    @RequestMapping("/calculator/divide")
    public String divide(@RequestParam("num1") int a, @RequestParam("num2") int b){
        return calcService.divide(a, b);
    }

}
