package jdbctests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.*;

public class jdbc_examples {

    String dbUrl ="jdbc:oracle:thin:@52.207.225.148:1521:XE";
    String dbUsername = "hr";
    String dbPassword = "hr";

    @DisplayName("ResultSet Methods")
    @Test
    public void test2() throws SQLException {

        Connection connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet resultSet = statement.executeQuery("SELECT * FROM departments");

        //move last row
        resultSet.last();

        //get row count
        int rowCount = resultSet.getRow();
        System.out.println(rowCount);

        // TO MOVE before first row after we use last method
        resultSet.beforeFirst();

        //print second column information
        while (resultSet.next()) {
            System.out.println(resultSet.getString(2));
        }
        //close connection
        resultSet.close();
        statement.close();
        connection.close();
    }

        @Test
        public void test3() throws SQLException {

            Connection connection = DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet resultSet = statement.executeQuery("SELECT * FROM departments");

            //get the database related data inside the dbMetadata object
            DatabaseMetaData dbMetadata = connection.getMetaData();

            System.out.println("dbMetadata.getUserName() = " + dbMetadata.getUserName());
            System.out.println("dbMetadata.getDatabaseProductName() = " + dbMetadata.getDatabaseProductName());
            System.out.println("dbMetadata.getDatabaseProductVersion() = " + dbMetadata.getDatabaseProductVersion());
            System.out.println("dbMetadata.getDriverVersion() = " + dbMetadata.getDriverVersion());
            System.out.println("dbMetadata.getDriverName() = " + dbMetadata.getDriverName());

            ResultSetMetaData rsMetaData = resultSet.getMetaData();

            //how many columns we have?
            int colCount = rsMetaData.getColumnCount();
            System.out.println(colCount);

            //getting columns name
            System.out.println(rsMetaData.getColumnName(1));
            System.out.println(rsMetaData.getColumnName(2));

            //rsMetaData.getColumnName(i)--->gets column name
            //rsMetaData.getColumnCount()-->total number of  column
            // print all the columns name dynamically
            for (int i = 1; i <=colCount; i++) {
                 System.out.println(rsMetaData.getColumnName(i));
            }




            //close connection
        resultSet.close();
        statement.close();
        connection.close();

    }
}
