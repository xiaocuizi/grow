package com.gemini.exceptions;

import java.sql.SQLException;

public class ExDemo {
    public static void main(String[] args) {
        try {
            throw new SQLException("sdsds");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
