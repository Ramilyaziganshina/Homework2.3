package homework23.Service;

import homework23.CalcService;
import homework23.exception.DivisionByZeroException;
import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {

    public Integer plus(Integer a, Integer b) {
        return a + b;
    }

    public Integer minus(Integer a, Integer b) {
        return a - b;
    }

    public Integer multiply(Integer a, Integer b) {
        return a * b;
    }

    public Integer divide(Integer a, Integer b) {
        if (b == 0) {
            throw new DivisionByZeroException();
        }
        return a / b;
    }
}
