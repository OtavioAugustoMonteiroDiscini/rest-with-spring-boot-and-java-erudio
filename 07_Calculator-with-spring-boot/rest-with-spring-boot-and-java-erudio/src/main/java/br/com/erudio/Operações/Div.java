package br.com.erudio.Operações;

import br.com.erudio.exception.UnsuporttedMathOperationExcepetion;
import br.com.erudio.function.convertToDoubleF;
import br.com.erudio.function.isNumericf;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


public class Div {
    private static br.com.erudio.function.convertToDoubleF convertToDoubleF = new convertToDoubleF();
    private static br.com.erudio.function.isNumericf isNumericf = new isNumericf();


    @RequestMapping(value = "/mathController/div/{numberOne}/{numberTwo}", method = RequestMethod.GET)

    public static double div(@PathVariable(value = "numberOne")String numberOne, @PathVariable(value = "numberTwo")String numberTwo) throws Exception{
        if (!isNumericf.isNumeric(numberOne) || !isNumericf.isNumeric(numberTwo))
            throw new UnsuporttedMathOperationExcepetion("Please set Math value");
        return convertToDoubleF.convertToDouble(numberOne) / convertToDoubleF.convertToDouble(numberTwo);
    }

}
