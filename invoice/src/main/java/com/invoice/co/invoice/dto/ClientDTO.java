package com.invoice.co.invoice.dto;

import lombok.Data;

@Data
public class ClientDTO {
    private Long id;
    private String firstNames;
    private String lastNames;
    private String address;
    private String phone;
    private String email;
}
