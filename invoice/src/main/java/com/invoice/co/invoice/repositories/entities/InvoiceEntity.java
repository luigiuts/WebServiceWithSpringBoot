package com.invoice.co.invoice.repositories.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="facturas")
@Data
public class InvoiceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = true)
    private Date date;
    private String description;
    private Double total;
    @OneToMany()
    @JoinColumn(name = "factura_id")
    private List<ItemEntity> items;
    @ManyToOne()
    @JoinColumn(name = "cliente_id")
    private ClientEntity client;
}
