package ro.unibuc.fmi.dietapp.microservice.payment.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "payments")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "payment_id")
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "diet_id")
    private Long dietId;

    @Column(name = "diet_name")
    private String dietName;

    @Column(name = "paymeny_date")
    private LocalDateTime time;

    @Column(name = "payment_amount")
    private Long amount;
}
