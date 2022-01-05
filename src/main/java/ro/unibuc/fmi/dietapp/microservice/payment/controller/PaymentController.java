package ro.unibuc.fmi.dietapp.microservice.payment.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.unibuc.fmi.dietapp.microservice.payment.dto.PaymentDto;
import ro.unibuc.fmi.dietapp.microservice.payment.mapper.PaymentMapper;
import ro.unibuc.fmi.dietapp.microservice.payment.model.Payment;
import ro.unibuc.fmi.dietapp.microservice.payment.service.PaymentService;

import java.util.List;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    private final PaymentService service;
    private final PaymentMapper mapper;

    public PaymentController(PaymentService service, PaymentMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping
    public ResponseEntity<List<PaymentDto>> findAll(){
        List<Payment> response = service.findAll();
        return new ResponseEntity<>(mapper.toDto(response), HttpStatus.OK);
    }

    @GetMapping("/diet")
    public ResponseEntity<List<PaymentDto>> findByDiet(@RequestParam Long id){
        List<Payment> response = service.findByDiet(id);
        return new ResponseEntity<>(mapper.toDto(response), HttpStatus.OK);
    }

    @GetMapping("/user")
    public ResponseEntity<List<PaymentDto>> findByUser(@RequestParam Long id){
        List<Payment> response = service.findByUser(id);
        return new ResponseEntity<>(mapper.toDto(response), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PaymentDto> findById(@PathVariable Long id){
        Payment response = service.findById(id);
        return new ResponseEntity<>(mapper.toDto(response), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<PaymentDto> create(@RequestBody PaymentDto request){
        //Payment test=mapper.toEntity(request);
        Payment response = service.create(mapper.toEntity(request));
        return new ResponseEntity<>(mapper.toDto(response), HttpStatus.CREATED);
    }
}
