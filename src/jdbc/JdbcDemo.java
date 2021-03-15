package jdbc;

import java.sql.*;
import java.util.Scanner;

public class JdbcDemo {

    public static void main(String[] args) {

        try {
            int id;
            String name;
            String address;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the id, Name  ");
            id = scanner.nextInt();
            name = scanner.next();
//            address = scanner.next();
//            String sql = "insert into employee (id,name,address) values (?,?,?)";
            String update = "update employee set name = ? where id = ?";

            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java2feb?characterEncoding=latin1", "root", "password");
            PreparedStatement statement = connection.prepareStatement(update);

            statement.setString(1, name);
            statement.setInt(2, id);
//            statement.setString(3, address);

            int i = statement.executeUpdate();


            System.out.println(i + "row inserted");
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
