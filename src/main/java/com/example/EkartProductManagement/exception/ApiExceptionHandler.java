package com.example.EkartProductManagement.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZonedDateTime;

@ControllerAdvice
public class ApiExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(ApiExceptionHandler.class);

    @ExceptionHandler(value = {ApiRequestException.class})
    public ResponseEntity handleRequestException(ApiRequestException ex) {

        /* 1. Log the error details */
        logger.error("error occurred while fetching details", ex);

        /* 2.Create payload containing exception details */
        ApiException apiException = new ApiException(
                ex.getMessage(),
                ex,
                HttpStatus.BAD_REQUEST,
                ZonedDateTime.now()
        );

        /* 3.return response entity */
        return new ResponseEntity(apiException, HttpStatus.BAD_REQUEST);
    }
}
