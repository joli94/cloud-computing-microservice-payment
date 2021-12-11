package ro.unibuc.fmi.dietapp.microservice.payment.service;

import org.springframework.stereotype.Service;
import ro.unibuc.fmi.dietapp.microservice.payment.exception.EntityNotFoundException;
import ro.unibuc.fmi.dietapp.microservice.payment.model.Payment;
import ro.unibuc.fmi.dietapp.microservice.payment.repository.PaymentRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PaymentService {
    private final PaymentRepository repository;

    public PaymentService(PaymentRepository repository) {
        this.repository = repository;
    }

    public List<Payment> findAll(){
        return repository.findAll();
    }

    public List<Payment> findByDiet(Long id){
        return repository.findByDietId(id);
    }

    public List<Payment> findByUser(Long id){
        return repository.findByUserId(id);
    }

    public Payment findById(Long id){
        return repository.findById(id).orElseThrow(
                ()-> new EntityNotFoundException("The payment  with this id doesn't exist in the database!")
        );
    }

    public Payment create(Payment payment) {
        payment.setTime(LocalDateTime.now());
        return repository.save(payment);
    }
}
