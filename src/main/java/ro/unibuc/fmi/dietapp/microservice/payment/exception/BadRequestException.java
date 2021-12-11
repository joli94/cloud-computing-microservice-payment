package ro.unibuc.fmi.dietapp.microservice.payment.exception;

public class BadRequestException extends RuntimeException{
    public BadRequestException(String message){
        super(message);
    }
}
