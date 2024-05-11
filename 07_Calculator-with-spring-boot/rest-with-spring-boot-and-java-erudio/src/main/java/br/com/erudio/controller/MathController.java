package br.com.erudio.controller;

import br.com.erudio.Operações.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mathController")
public class MathController {
	
	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public double sum(@PathVariable("numberOne") double numberOne, @PathVariable("numberTwo") double numberTwo) throws Exception {
		Soma soma = new Soma();
		return soma.sum(Double.toString(numberOne), Double.toString(numberTwo));
	}

	@RequestMapping(value = "/sub/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public double sub(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		Subtraction subtraction = new Subtraction();
		return subtraction.sub(numberOne, numberTwo);
	}
	@RequestMapping(value = "/mult/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public double mult(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception{
		Multiplication multiplication = new Multiplication();
		return Multiplication.mult(numberOne, numberTwo);
	}
	@RequestMapping(value = "/med/{numberOne}/{numberTwo}/{numberTree}", method = RequestMethod.GET)
	public  double med(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo, @PathVariable(value = "numberTree") String numberTree)throws Exception{
		Medyan med = new Medyan();
		return Medyan.med(numberOne, numberTwo, numberTree);
	}

	@RequestMapping(value = "/raiz/{numberOne}", method = RequestMethod.GET)
	public double raiz(@PathVariable("numberOne") String numberOne)throws Exception{
		SquaryRoot squaryRoot = new SquaryRoot();
		return SquaryRoot.raiz(numberOne);
	}








}
