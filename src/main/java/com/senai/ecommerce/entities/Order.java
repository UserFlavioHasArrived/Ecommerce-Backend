package com.senai.ecommerce.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.Instant;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "tb_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime moment;
    @Enumerated(EnumType.ORDINAL) // Salva o enum como um número (0,1,2...)
    private OrderStatus status;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    //cascade serve to delete the order when the user is deleted
    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
    private Payment payment;


}
