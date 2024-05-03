package com.project.seminario.Events;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {

    private Connection connection;

    public UserDAO(Connection connection) {
        this.connection = connection;
    }

    public User searchUserRegistration(int registration) throws SQLException {
        String sql = "SELECT * FROM usuario WHERE matricula = ?";
        PreparedStatement st = connection.prepareStatement(sql);
        st.setInt(1, registration);

        ResultSet rs = st.executeQuery();

        if (!rs.next()) {
            return null;
        }

        int registrationDB = rs.getInt("matricula");
        String courseBD = rs.getString("curso");
        String passwordBD = rs.getString("senha");
        String nameBD = rs.getString("nome");
        String emailBD = rs.getString("email");

        User user = new User(registrationDB, courseBD, passwordBD, nameBD, emailBD);

        rs.close();
        st.close();

        return user;
    }
}
