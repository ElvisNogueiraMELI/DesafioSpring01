package br.com.meli.socialmeli.exception;

public class BadRequestException extends  RuntimeException {
    public BadRequestException(String message) {
        super(message);
    }

    public BadRequestException(Exception e) {
        super(e);
    }
}
