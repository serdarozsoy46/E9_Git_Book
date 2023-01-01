package jdbctests;

import java.sql.*;

public class TestConnections {

    public static void main(String[] args) throws SQLException {

        String dbUrl ="jdbc:oracle:thin:@52.207.225.148:1521:XE";
        String dbUsername = "hr";
        String dbPassword = "hr";

        Connection connection = DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM regions");

        //once you set up connection default pointer look for 0
        // next()---> move pointer to first row
        resultSet.next();

        //getting information with column name
        System.out.println(resultSet.getString("region_name"));


        //getting information with column index(Starts 1)
        System.out.println(resultSet.getInt(1));   // 1 birinci sira
        System.out.println(resultSet.getString(2)); // europe ikinci sira

        //1-Europe
        //2-Americas
        System.out.println(resultSet.getInt(1)+"-"+resultSet.getString(2));

        //move to second row
        resultSet.next();
        System.out.println(resultSet.getInt(1)+"-"+resultSet.getString(2));

        // move to third row
        resultSet.next();
        System.out.println(resultSet.getInt(1)+"-"+resultSet.getString(2));

        while (resultSet.next()){
            System.out.println(resultSet.getInt(1) + "-" + resultSet.getString(2));
        }

        //close connection
        resultSet.close();
        statement.close();
        connection.close();
}

}
