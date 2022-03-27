package com.aca.homework.week11.repository.invoice;

import java.util.Objects;

public class Invoice {
    private final String id;
    private final double amountToPay;
    private final InvoiceStatus status;

    public Invoice(String id, double amountToPay, InvoiceStatus status) {
        if (id == null) {
            throw new NullPointerException("Cannot create this invoice");
        }
        this.id = id;
        this.amountToPay = amountToPay;
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Invoice invoice = (Invoice) o;

        if (Double.compare(invoice.amountToPay, amountToPay) != 0) return false;
        if (!Objects.equals(id, invoice.id)) return false;
        return status == invoice.status;
    }

    public String getId() {
        return id;
    }

    public double getAmountToPay() {
        return amountToPay;
    }

    public InvoiceStatus getStatus() {
        return status;
    }
}
