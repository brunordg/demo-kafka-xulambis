package com.example.demokafkaxulambis;

import lombok.Data;

import java.util.List;

@Data
public class UserDTO {

    private Long id;

    private String firstName;

    private String lastName;

    private List<AddressDTO> address;


}
