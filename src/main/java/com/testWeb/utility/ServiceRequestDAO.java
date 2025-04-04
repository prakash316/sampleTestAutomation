package com.testWeb.utility;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class ServiceRequestDAO {

    private Connection connection;

    public ServiceRequestDAO(Connection connection) {
        this.connection = connection;
    }

    public List<ServiceRequest> getServiceRequests(String phoneNumber) throws SQLException {
        QueryRunner runner = new QueryRunner();
        String query = "select * from service_request sr where sr.phone ='" + phoneNumber + "'";

        // Use BeanListHandler to map ResultSet to a list of ServiceRequest objects
        return runner.query(connection, query, new BeanListHandler<>(ServiceRequest.class));
    }

    public static Connection getConnection() throws SQLException {

        String jdbcUrl = "jdbc:postgresql://postgres-uat.bricknbolt.com:5432/bnbdb";
        String username = "postgres";
        String password = "postgresql-uat";

        // Create the connection
        return DriverManager.getConnection(jdbcUrl, username, password);
    }

    public static void main(String[] args) {
        try {
            // Create the connection
            Connection connection = getConnection();

            // Create the DAO object and pass the connection
            ServiceRequestDAO dao = new ServiceRequestDAO(connection);

            // Fetch and print the service requests
            List<ServiceRequest> serviceRequests = dao.getServiceRequests("9452346234");

            if (serviceRequests.size() > 0){
                for (ServiceRequest request : serviceRequests) {
                    System.out.println(request);
                }
            }else {
                System.out.println("No match found");
            }


            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
