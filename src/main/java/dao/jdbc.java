package dao;

import oracle.jdbc.OracleDriver;
import org.junit.Test;

import java.sql.*;
import java.util.Properties;

/**
 * @Author: Junze
 * @Date: Create in 17:52 2017/6/1
 * @Description:
 */
public class jdbc {
    private String url = "jdbc:oracle:thin:@192.168.1.200:1521:yydb";
    private String user = "fhseed";
    private String pass = "fhseed";
    @Test
    public void con () throws SQLException, ClassNotFoundException {

        Class.forName("oracle.jdbc.OracleDriver");
        Properties props = new Properties();
        props.setProperty("user",user);
        props.setProperty("password",pass);
        Connection con = DriverManager.getConnection(url, props);
        String sql = "select * from te_test2";
        //Statement stat = con.createStatement();
        PreparedStatement stat = con.prepareStatement(sql);

        ResultSet resultSet = stat.executeQuery();
        while(resultSet.next()){
            int sal = resultSet.getInt("sal");
            System.out.println(sal);

        }

        System.out.print(resultSet);
        stat.close();
        con.close();

    }
}
