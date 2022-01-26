package com.project.math.project.controller;

import com.project.math.project.dto.ErrorResponseDTO;
import com.project.math.project.dto.ExceptionResponseDTO;
import com.project.math.project.exception.ExceptionGeneric;
import com.project.math.project.exception.NegativeDeltaException;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Log4j2
@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(ExceptionGeneric.class)
    public ResponseEntity<ExceptionResponseDTO> handleGeneric(ExceptionGeneric exception, HttpServletRequest request) {
        log.error(exception);
        ErrorResponseDTO errorResponseDTO = new ErrorResponseDTO("", exception.getLocalizedMessage());
        ExceptionResponseDTO responseDTO = new ExceptionResponseDTO(new Date(), request.getRequestURI(),
                exception.getMessage(), List.of(errorResponseDTO));
        return new ResponseEntity<>(responseDTO, HttpStatus.BAD_REQUEST);

    }


    @ExceptionHandler(NegativeDeltaException.class)
    public ResponseEntity<ExceptionResponseDTO> handleNegativeDeltaException(
            NegativeDeltaException negativeDeltaException, HttpServletRequest request) {
        log.error(negativeDeltaException);
        ErrorResponseDTO errorResponseDTO = new ErrorResponseDTO("", negativeDeltaException.getLocalizedMessage());
        ExceptionResponseDTO responseDTO = new ExceptionResponseDTO(new Date(), request.getRequestURI(),
                negativeDeltaException.getMessage(), List.of(errorResponseDTO));
        return new ResponseEntity<>(responseDTO, HttpStatus.BAD_REQUEST);
    }


    @ExceptionHandler(Exception.class)
    public ResponseEntity<ExceptionResponseDTO> handleAll(Exception exception, HttpServletRequest request) {
        log.error(exception);
        ErrorResponseDTO errorResponseDTO = new ErrorResponseDTO("", exception.getLocalizedMessage());
        ExceptionResponseDTO responseDTO = new ExceptionResponseDTO(new Date(), request.getRequestURI(),
                exception.getMessage(), List.of(errorResponseDTO));
        return new ResponseEntity<>(responseDTO, HttpStatus.INTERNAL_SERVER_ERROR);

    }
}