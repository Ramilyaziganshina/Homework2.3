package homework23;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(int a, int b) {
        return a + " + " + b + " = " + (a + b);
    }

    public String minus(int a, int b) {
        return a + " - " + b + " = " + (a - b);
    }

    public String multiply(int a, int b) {
        return a + " * " + b + " = " + (a * b);
    }

    public String divide(int a, int b) {
        if (b == 0) {
            return "на ноль делить нельзя";
        } else {
            return a + " / " + b + " = " + (a / b);
        }
    }
}
