package com.aca.exam.exam2;

import java.util.ArrayList;
import java.util.List;

public class OrderPrinterRunnable implements Runnable {

    private CrudRepository<Order, Integer> repository;
    private int orderId;

    public OrderPrinterRunnable(CrudRepository<Order, Integer> repository) {
        this.repository = repository;
    }

    public List<Order> orders() {
        List<Order> orderList = new ArrayList<>();
        for (Order order : repository.findAll()) {
            orderList.add(new Order(order.getId(), order.getName(), order.getPrice(), order.getPurchasedUser()));
        }
        return orderList;
    }

    @Override
    public void run() {
        for (int i = 0; i < orders().size(); i++) {
            System.out.println(orders().get(i).getId() + " " + orders().get(i).getName() + " " +
                    orders().get(i).getPrice() + " " + orders().get(i).getPurchasedUser().getId());
        }
    }

    public static void main(String[] args) {

        CrudRepository<User, String> userRepository = new FileSourceUserRepository();
        CrudRepository<Order, Integer> repository = new FileSourceOrderRepository(userRepository);

        OrderPrinterRunnable runnable = new OrderPrinterRunnable(repository);
        runnable.run();
    }
}
