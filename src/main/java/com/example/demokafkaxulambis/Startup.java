package com.example.demokafkaxulambis;

import org.instancio.Instancio;
import org.instancio.InstancioOfCollectionApi;

import java.security.cert.PKIXCertPathBuilderResult;
import java.util.List;

public class Startup {

    public static void main(String[] args) {
        List<UserDTO> userDTOS = Instancio.ofList(UserDTO.class).size(10).create();

        userDTOS.stream().forEach(item -> {
            System.out.println(item.toString());
        });



    }
}
