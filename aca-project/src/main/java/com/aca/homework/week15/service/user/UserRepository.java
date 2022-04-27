package com.aca.homework.week15.service.user;

import java.sql.Connection;
import java.sql.SQLException;

public class UserRepository {

    private ConnectionFactory connectionFactory;

    public UserRepository(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

    public void save (User user) {
        Connection connection = connectionFactory.getObject();
        try {
            connection.createStatement().execute("insert into users (username, name) values ('" +
                    user.getUsername() + "', '" +
                    user.getName() + "');"
            );
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
