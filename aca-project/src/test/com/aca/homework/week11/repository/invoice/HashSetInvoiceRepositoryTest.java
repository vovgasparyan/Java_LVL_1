package com.aca.homework.week11.repository.invoice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HashSetInvoiceRepositoryTest {

    private HashSetInvoiceRepository invoiceRepository;

    @BeforeEach
    public void setUp() {
        invoiceRepository = new HashSetInvoiceRepository();
    }

    @Test
    public void testSaveWhenSetIsEmpty() {
        Assertions.assertEquals(0, invoiceRepository.getSetSize());
    }

    @Test
    public void testSaveWhenExistsWithSameIdButNewFieldsAreDifferent() {
        Invoice invoice1 = new Invoice("home", 400, InvoiceStatus.PAID);
        Invoice invoice2 = new Invoice("home", 800, InvoiceStatus.UNPAID);
        Assertions.assertEquals(invoice1.getId(), invoice2.getId());
        Assertions.assertNotEquals(invoice1.getAmountToPay(), invoice2.getAmountToPay());
        Assertions.assertNotEquals(invoice1.getStatus(), invoice2.getStatus());
    }

    @Test
    public void testSave2Times() {
        Invoice invoice1 = new Invoice("home", 400, InvoiceStatus.PAID);
        invoiceRepository.save(invoice1);
        Assertions.assertEquals(invoice1, new Invoice("home", 400, InvoiceStatus.PAID));
    }

    @Test
    public void testFindByIdNotFound() {
        Assertions.assertNull(invoiceRepository.findById("home"));
    }

    @Test
    public void testFindByIdWhenFound() {
        Invoice invoice1 = new Invoice("home", 400, InvoiceStatus.PAID);
        invoiceRepository.save(invoice1);
        Assertions.assertNotNull(invoiceRepository.findById("home").getId());
    }

    @Test
    public void testFindAllWhenEmpty() {
        Assertions.assertEquals(0, invoiceRepository.getSetSize());
    }

    @Test
    public void testFindAllWhenIsExists() {
        Invoice invoice1 = new Invoice("home", 400, InvoiceStatus.PAID);
        invoiceRepository.save(invoice1);
        Assertions.assertTrue(invoiceRepository.getSetSize() >= 1);
    }

    @Test
    public void testDeleteWhenEmpty() {
        Invoice invoice1 = new Invoice("home", 400, InvoiceStatus.PAID);
        invoiceRepository.save(invoice1);
        invoiceRepository.delete(invoice1);
        Assertions.assertEquals(0, invoiceRepository.getSetSize());
    }

    @Test
    public void testDeleteWhenExists() {
        Invoice invoice1 = new Invoice("home", 400, InvoiceStatus.PAID);
        invoiceRepository.save(invoice1);
        invoiceRepository.delete(invoice1);
        Assertions.assertNull(invoiceRepository.findById("home"));
    }


}