package br.com.erudio.Operações;

import br.com.erudio.exception.UnsuporttedMathOperationExcepetion;
import br.com.erudio.function.convertToDoubleF;
import br.com.erudio.function.isNumericf;
import org.springframework.web.bind.annotation.PathVariable;


public class SquaryRoot {

    private static br.com.erudio.function.isNumericf isNumericf = new isNumericf();
    private static br.com.erudio.function.convertToDoubleF convertToDoubleF = new convertToDoubleF();



    public static double raiz(@PathVariable(value = "numberOne") String numberOne) {
        if (!isNumericf.isNumeric(numberOne)) {
            throw new UnsuporttedMathOperationExcepetion("Please set Math Value");
        }
        return Math.sqrt(convertToDoubleF.convertToDouble(numberOne));
    }
}
