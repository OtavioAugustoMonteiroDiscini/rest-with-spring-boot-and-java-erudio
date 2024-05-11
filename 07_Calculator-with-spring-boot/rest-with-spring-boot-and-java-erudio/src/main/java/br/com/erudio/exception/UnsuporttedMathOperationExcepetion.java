package br.com.erudio.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsuporttedMathOperationExcepetion extends RuntimeException{


    public UnsuporttedMathOperationExcepetion(String ex) {
        super(ex);
    }

}
