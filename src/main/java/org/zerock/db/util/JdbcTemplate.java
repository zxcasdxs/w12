package org.zerock.db.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public abstract class JdbcTemplate {

    static{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    protected Connection connection;
    protected PreparedStatement preparedStatement;
    protected ResultSet resultSet;


    public void makeAll(){
        try {
            makeConnection();
            execute();
            finish();
            System.out.println("END");
        }catch(Exception e){

        }finally {
            finish();
        }
    }

    protected abstract void execute()throws Exception;

    private void makeConnection() throws Exception{
        System.out.println("물끓이기");
        this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bit08db?serverTimezone=Asia/Seoul","bituser","bituser");
    }

    private void finish() {
        System.out.println("------------finish--------------");
        System.out.println("Template ResultSet: "+ resultSet);
        System.out.println("Template PreparedStatement: "+preparedStatement);
        System.out.println(connection);

        if(resultSet != null){
            try{ resultSet.close(); }catch(Exception e){}
        }

        if(preparedStatement != null){
            try{ preparedStatement.close(); }catch(Exception e){}
        }

        if(connection != null){
            try{ connection.close(); }catch(Exception e){}
        }
    }
}