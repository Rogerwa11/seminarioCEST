package com.project.seminario.Classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.project.seminario.DBConnection;

public class UserDAO {

    private DBConnection conn;

    public UserDAO(DBConnection conn) {
        this.conn = conn;
    }

    public User searchUserRegistration(int registration) throws SQLException {
        PreparedStatement st = this.conn.getConnection().prepareStatement("SELECT * FROM usuario WHERE matricula = ?");
        st.setInt(1, registration);

        ResultSet rs = st.executeQuery();

        if (!rs.next()) {
            return null;
        }

        int registrationDB = rs.getInt("matricula");
        String courseDB = rs.getString("curso");
        String passwordDB = rs.getString("senha");
        String nameDB = rs.getString("nome");
        String emailDB = rs.getString("email");

        User user = new User(registrationDB, courseDB, passwordDB, nameDB, emailDB);

        rs.close();
        st.close();

        return user;
    }
}
