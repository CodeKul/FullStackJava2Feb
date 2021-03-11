package jdbc;

import java.sql.*;

public class JdbcDemo {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java2feb?characterEncoding=latin1", "root", "password");
            Statement statement = connection.createStatement();

            String sql = "insert into employee(id,name,address) values(2,'sachin','nashik')";


            int  i = statement.executeUpdate(sql);

            System.out.println(i+"row inserted");
//
//            while (rs.next()) {
//                System.out.println(rs.getInt(1));
//                System.out.println(rs.getString(2));
//                System.out.println(rs.getString(3));
//            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
