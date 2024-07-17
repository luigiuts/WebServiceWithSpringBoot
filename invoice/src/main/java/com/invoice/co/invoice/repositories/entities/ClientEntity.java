package com.invoice.co.invoice.repositories.entities;

import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "clientes")
@Data
public class ClientEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = true)
    private String firstNames;
    @Column(nullable = true)
    private String lastNames;
    @Column(nullable = true)
    private String address;
    @Column(nullable = true)
    private String phone;
    @Column(nullable = true, unique = true)
    private String email;
    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)//SIEMPRE VA DEL LADO DEL MUCHO
    private List<InvoiceEntity> invoices;

}
