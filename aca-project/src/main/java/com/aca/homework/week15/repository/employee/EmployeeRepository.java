package com.aca.homework.week15.repository.employee;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class EmployeeRepository implements CrudRepository<Employee, String> {

    private ConnectionFactory connectionFactory;

    public EmployeeRepository(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

    @Override
    public void save(Employee employee) {
        Connection connection = connectionFactory.getObject();
        try {
            connection.createStatement().execute("insert into employees (id, firstname, secondname, salary) values ('" +
                    employee.getId() + "', '" +
                    employee.getFirstName() + "', '" +
                    employee.getSecondName() + "', "
                    + employee.getSalary() + ");"
            );
            //System.out.println("The employee's information successfully added into base");
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public List<Employee> findAll() {
        Connection connection = connectionFactory.getObject();
        ResultSet resultSet;
        List<Employee> employees = new LinkedList<>();

        try {
            resultSet = connection.createStatement().executeQuery("select * from employees;");
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException("Cannot select your query\n" + e.getMessage());
        }

        while (true) {
            try {
                if (!resultSet.next()) {
                    break;
                }
            } catch (SQLException e) {
                throw new RuntimeException(e.getMessage());
            }
            employees.add(getEmployeeFromRow(resultSet));
        }

        try {
            resultSet.close();
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }

        return employees;
    }

    @Override
    public Employee findById(String s) {
        Connection connection = connectionFactory.getObject();
        ResultSet resultSet;
        Employee employee;

        if (s == null) {
            throw new IllegalArgumentException("'s' argument cannot be null");
        }

        try {
            resultSet = connection.createStatement().executeQuery("select * from employees where id='" + s + "';");
            connection.close();
            resultSet.next();
        } catch (SQLException e) {
            throw new RuntimeException("Cannot select your query by id\n" + e.getMessage());
        }
        employee = getEmployeeFromRow(resultSet);

        try {
            resultSet.close();
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }

        return employee;
    }

    @Override
    public void deleteAll() {
        Connection connection = connectionFactory.getObject();
        try {
            connection.createStatement().addBatch("delete from employees;");
            connection.createStatement().executeBatch();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    private Employee getEmployeeFromRow(ResultSet resultSet) {
        String id;
        String firstname;
        String secondname;
        long salary;

        try {
            id = resultSet.getString(1);
            firstname = resultSet.getString(2);
            secondname = resultSet.getString(3);
            salary = resultSet.getLong(4);
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
        return new Employee(id, firstname, secondname, salary);
    }

}
