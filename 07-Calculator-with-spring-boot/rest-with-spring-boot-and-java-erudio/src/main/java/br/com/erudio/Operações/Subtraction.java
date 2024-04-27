package br.com.erudio.Operações;

import br.com.erudio.exception.UnsuporttedMathOperationExcepetion;
import br.com.erudio.function.convertToDoubleF;
import br.com.erudio.function.isNumericf;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Subtraction {

    private static br.com.erudio.function.convertToDoubleF convertToDoubleF = new convertToDoubleF();
    private static br.com.erudio.function.isNumericf isNumericf = new isNumericf();


    public static double sub(@PathVariable(value = "numberOne")String numberOne, @PathVariable(value = "numberTwo")String numberTwo) {
        if (!isNumericf.isNumeric(numberOne) || !isNumericf.isNumeric(numberTwo))
            throw new UnsuporttedMathOperationExcepetion("Please set Math value");
        return convertToDoubleF.convertToDouble(numberOne) - convertToDoubleF.convertToDouble(numberTwo);
    }
}
