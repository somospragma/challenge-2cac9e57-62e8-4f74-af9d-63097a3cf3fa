package com.example.payment;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class PaymentRepositoryTest {

    @MockBean
    private PaymentRepository paymentRepository;

    @Test
    void testFindById() {
        // Configurar el mock y agregar asserts para verificar el comportamiento
    }
}