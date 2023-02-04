package com.example.demokafkaxulambis;

import lombok.Data;

@Data
public class AddressDTO {

    private Long id;
    private String cep;

    private String street;
}
