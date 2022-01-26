package com.project.math.project.dto;

import java.util.Date;
import java.util.List;

public class ExceptionResponseDTO {

    private final Date timestamp;
    private final String message;
    private final List<ErrorResponseDTO> errors;
    private final String path;

    public ExceptionResponseDTO(Date timestamp,  String path, String message, List<ErrorResponseDTO> errors) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.errors = errors;
        this.path = path;
    }


    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public List<ErrorResponseDTO> getErrors() {
        return errors;
    }

    public String getPath() {
        return path;
    }

}
