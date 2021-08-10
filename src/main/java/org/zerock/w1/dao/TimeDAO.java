package org.zerock.w1.dao;

import org.zerock.db.util.JdbcTemplate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TimeDAO {

    public String getTime() throws RuntimeException {

        new JdbcTemplate() {
            @Override
            protected void execute() throws Exception {
                preparedStatement = connection.prepareStatement("select now()");
                resultSet = preparedStatement.executeQuery();
                resultSet.next();
                System.out.println(resultSet.getString(1));
            }
        }.makeAll();

        return null;
    }

}//c end
