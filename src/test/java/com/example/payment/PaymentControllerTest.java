package com.example.payment;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class PaymentControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void testPaymentEndpoint() {
        ResponseEntity<String> response = restTemplate.getForEntity("/payments/12345", String.class);
        // Agregar asserts para verificar la respuesta
    }
}