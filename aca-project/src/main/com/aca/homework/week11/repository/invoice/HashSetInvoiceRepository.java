package com.aca.homework.week11.repository.invoice;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetInvoiceRepository implements InvoiceRepository {

    private final Set<Invoice> invoices;

    public HashSetInvoiceRepository() {
        invoices = new HashSet<>();
    }

    @Override
    public Invoice save(Invoice invoice) {
        if (invoice == null) {
            throw new NullPointerException("The invoice is empty");
        }
        for (Invoice invoiceIn : invoices) {
            if (invoice.equals(invoiceIn)) {
                System.out.println("This invoice is already exists");
            }

        }
        invoices.add(invoice);
        return invoice;
    }

    @Override
    public Invoice findById(String id) {
        if (id == null) {
            throw new NullPointerException("The 'id' cannot be null");
        }
        for (Invoice invoice : invoices) {
            if (id.equals(invoice.getId())) {
                return invoice;
            } else {
                throw new NullPointerException(invoice + " is not found");
            }
        }
        return null;
    }

    @Override
    public List<Invoice> findAll() {
        return List.copyOf(invoices);
    }

    @Override
    public void delete(Invoice invoice) {
        if (invoice == null) {
            throw new NullPointerException("The invoice cannot be null");
        }
        invoices.remove(invoice);
        System.out.println("The invoice with '" + invoice.getId() + "' id is successfully deleted.");
    }

    public int getSetSize() {
        return invoices.size();
    }

    public static void main(String[] args) {
        Invoice invoice = new Invoice("home", 400, InvoiceStatus.PAID);
        Invoice invoice2 = new Invoice("home", 800, InvoiceStatus.UNPAID);

        HashSetInvoiceRepository invoiceRepository = new HashSetInvoiceRepository();

        invoiceRepository.save(invoice);
        invoiceRepository.save(invoice);
        invoiceRepository.save(invoice2);

        System.out.println(invoiceRepository.findById("home").getId());
        System.out.println(invoiceRepository.findAll().get(1).getAmountToPay());

        System.out.println(invoiceRepository.getSetSize());

        //invoiceRepository.delete(invoice);
        //System.out.println(invoiceRepository.findById("home").getId());

    }
}
