package com.wcl.demo.datasource;

import com.wcl.demo.TestLogin;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @ Author     ：wcl
 * @ Description：
 */
public class TestDataSource extends TestLogin {


    @Autowired
    DataSource dataSource;

    @Test
    public void test() throws SQLException {
        System.out.println("数据源>>>>>>" + dataSource.getClass());
        Connection connection = dataSource.getConnection();

        System.out.println("连接>>>>>>>>>" + connection);
        System.out.println("连接地址>>>>>" + connection.getMetaData().getURL());
        connection.close();

    }
}
