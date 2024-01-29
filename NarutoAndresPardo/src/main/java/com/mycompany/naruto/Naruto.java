package com.mycompany.naruto;

import com.mycompany.naruto.controllers.MisionNinjaController;
import com.mycompany.naruto.persistence.BDConnection;
import com.mycompany.naruto.persistence.Operations;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Naruto {
    public static void main(String[] args) {
        Operations.setConnection(BDConnection.MySQLConnection());
        String sentencia = "SELECT * FROM Mision;";
        try (PreparedStatement ps = Operations.getConnection().prepareStatement(sentencia)) {
            ResultSet rs = Operations.query_db(ps);
            while (rs.next()) {
                String id = rs.getString("ID");
                System.out.println(id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
