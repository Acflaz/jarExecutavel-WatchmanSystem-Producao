package com.mycompany.swing.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {
    public Connection getJdbcTemplateMySQL() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:" + "mysql" + "://" + "localhost" + ":" + "3306" + "/" + "watchmanSystem" + "?" + "useSSL=false&allowPublicKeyRetrieval=true",
                    "root", "Viniciuscruz07");
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
