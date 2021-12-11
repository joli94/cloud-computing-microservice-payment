package ro.unibuc.fmi.dietapp.microservice.payment.mapper;

import org.mapstruct.Mapper;
import ro.unibuc.fmi.dietapp.microservice.payment.dto.PaymentDto;
import ro.unibuc.fmi.dietapp.microservice.payment.model.Payment;

@Mapper
public interface PaymentMapper extends EntityMapper<PaymentDto, Payment>{
}
