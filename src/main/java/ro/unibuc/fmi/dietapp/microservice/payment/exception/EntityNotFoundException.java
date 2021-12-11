package ro.unibuc.fmi.dietapp.microservice.payment.exception;

public class EntityNotFoundException extends RuntimeException{
    public EntityNotFoundException(String message){
        super(message);
    }
}
