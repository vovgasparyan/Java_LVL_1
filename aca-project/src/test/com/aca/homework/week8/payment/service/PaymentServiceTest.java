package com.aca.homework.week8.payment.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;

class PaymentServiceTest {

    private PaymentService service;
    private PaymentResult result;

    @BeforeEach
    public void setUp() {
        service = new PaymentService();
    }

    @Test
    public void testServiceAnnotation() {
        Annotation[] annotations = service.getClass().getDeclaredAnnotations();
        boolean isServiceAnnotation = false;
        for (int i = 0; i < annotations.length; i++) {
            if (annotations[0].annotationType() == Service.class) {
                isServiceAnnotation = true;
            }
        }
        Assertions.assertTrue(isServiceAnnotation);
    }

    @Test
    public void testPaymentAmount() {
        result = service.pay(550);
        Assertions.assertEquals(550, result.getPaidAmount());
    }

    @Test
    public void testDuration(){
        result = service.pay(550);
        int timeProcessing = result.getTimeProcessing();
        Assertions.assertTrue(timeProcessing >= 200 && timeProcessing <= 800);
    }

}