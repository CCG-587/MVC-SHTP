package db;

import java.sql.*;

/**
 * 数据库连接类
 */
public class DButil {

    /*定义连接数据库四大变量*/
    //驱动名称
    private static final String DBDRIVER="com.mysql.cj.jdbc.Driver";
    //资源路径
    private static final String DBURL="jdbc:mysql://localhost:3306/shtp?serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=utf-8";
    //用户名
    private static final String DBUSER="root";
    //密码
    private static final String DBPASSWORD="123456";

    /*静态代码块注册驱动*/
    static {
        try {
            Class.forName(DBDRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("驱动加载异常！");
        }
    }

    /*获取数据库连接*/
    public static Connection getConnction(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DBURL, DBUSER, DBPASSWORD);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("连接数据库异常！");
        }
        return conn;
    }

    /*三参关闭资源*/
    public static void close(ResultSet rs,
                             Statement stmt,
                             Connection conn){
        try {
            if(rs != null)rs.close();
            if(stmt != null)stmt.close();
            if(conn != null)conn.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /*两参关闭资源*/
    public static void close(Statement stmt,Connection conn){

        try {
            if(stmt != null)stmt.close();
            if(conn != null)conn.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
