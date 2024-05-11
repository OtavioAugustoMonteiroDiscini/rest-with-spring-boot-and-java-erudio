package br.com.erudio.exception;

import java.io.Serializable;
import java.util.Date;
public class ExceptionResponse implements Serializable {

    private static final long SerialVersionUID = 1L;
    private Date timestamp;
    private String message;
    private String details;




    public ExceptionResponse(Date timestamp, String message , String details) {
        this.details = details;
        this.timestamp = timestamp;
        this.message = message;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}


