package br.com.erudio.Operações;


import br.com.erudio.exception.UnsuporttedMathOperationExcepetion;
import br.com.erudio.function.convertToDoubleF;
import br.com.erudio.function.isNumericf;
import org.springframework.web.bind.annotation.PathVariable;


public class Soma {

    private static convertToDoubleF convertToDoubleF = new convertToDoubleF();
    private static isNumericf isNumericf = new isNumericf();


    public static double sum(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) {
        if (!isNumericf.isNumeric(numberOne) || !isNumericf.isNumeric(numberTwo))
            throw new UnsuporttedMathOperationExcepetion("Please set Math value");
        return convertToDoubleF.convertToDouble(numberOne) + convertToDoubleF.convertToDouble(numberTwo);
    }


}
