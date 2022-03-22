package com.aca.exam.exam2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Repository
public class FileSourceOrderRepository implements CrudRepository<Order, Integer> {

    private CrudRepository<User, String> crudRepository;

    public FileSourceOrderRepository(CrudRepository<User, String> crudRepository) {
        this.crudRepository = crudRepository;
    }

    public FileSourceOrderRepository() {
    }

    public User fetchUser(String username) {
        return crudRepository.findById(username);
    }

    @Override
    public Order findById(Integer id) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("D:/ACA/Java_LVL_1/aca-project/src/com/aca/exam/exam2/orders.txt"));
            scanner.nextLine();
            while (scanner.hasNextLine()) {

                String[] words = scanner.nextLine().split(",");
                if (words.length != 4) {
                    continue;
                }
                String name = words[1];
                int price = Integer.parseInt(words[2]);
                User purchasedUsername = fetchUser(words[3]);

                if (id == Integer.parseInt(words[0])) {
                    return new Order(id, name, price, purchasedUsername);
                }
            }

        } catch (Exception e) {
            e.getMessage();
        } finally {
            scanner.close();
        }
        return null;
    }

    @Override
    public List<Order> findAll() {
        List<Order> orders = new ArrayList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("D:/ACA/Java_LVL_1/aca-project/src/com/aca/exam/exam2/orders.txt"));
            scanner.nextLine();
            while (scanner.hasNextLine()) {

                String[] data = scanner.nextLine().split(",");
                if (data.length != 4) {
                    continue;
                }
                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int price = Integer.parseInt(data[2]);
                User purchasedUsername = fetchUser(data[3]);

                orders.add(new Order(id, name, price, purchasedUsername));
            }
            return orders;
        } catch (Exception e) {
            e.getMessage();
        } finally {
            scanner.close();
        }

        return null;
    }

    public List<Order> findAllByUserId(String userId) {
        List<Order> orders = new ArrayList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("D:/ACA/Java_LVL_1/aca-project/src/com/aca/exam/exam2/orders.txt"));
            scanner.nextLine();
            while (scanner.hasNextLine()) {

                String[] data = scanner.nextLine().split(",");
                if (data.length != 4) {
                    continue;
                }

                if (data[3].equals(userId)) {
                    int id = Integer.parseInt(data[0]);
                    String name = data[1];
                    int price = Integer.parseInt(data[2]);
                    User purchasedUsername = fetchUser(data[3]);

                    orders.add(new Order(id, name, price, purchasedUsername));
                }
            }
            return orders;
        } catch (Exception e) {
            e.getMessage();
        } finally {
            scanner.close();
        }

        return null;
    }

    public static void main(String[] args) {

        FileSourceUserRepository userRepository = new FileSourceUserRepository();

        FileSourceOrderRepository orderRepository = new FileSourceOrderRepository(userRepository);
        System.out.println(orderRepository.findAllByUserId("shawlinspire").size());
    }
}
