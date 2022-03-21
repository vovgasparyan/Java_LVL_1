package com.aca.exam.exam2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileSourceUserRepository implements CrudRepository<User, String> {


    @Override
    public User findById(String id) {
        Scanner scanner = null;

        try {
            scanner = new Scanner(new File("D:/ACA/Java_LVL_1/aca-project/src/com/aca/exam/exam2/users.txt"));

            while (scanner.hasNextLine()) {

                String[] words = scanner.nextLine().split(",");
                if (words.length != 3) {
                    continue;
                }
                String word_id = words[0];
                String firstname = words[1];
                String lastname = words[2];

                if (id.equals(word_id)) {
                    return new User(word_id, firstname, lastname);
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
    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("D:/ACA/Java_LVL_1/aca-project/src/com/aca/exam/exam2/users.txt"));
            scanner.nextLine();
            while (scanner.hasNextLine()) {

                String[] words = scanner.nextLine().split(",");
                if (words.length != 3) {
                    continue;
                }
                String word_id = words[0];
                String firstname = words[1];
                String lastname = words[2];

                User user = new User(word_id, firstname, lastname);
                users.add(user);

            }
            return users;

        } catch (Exception e) {
            e.getMessage();
        } finally {
            scanner.close();
        }
        return null;
    }


}
