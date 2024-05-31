package com.project.seminario.Classes;

import com.project.seminario.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MarkDAO {

    private DBConnection conn;

    public MarkDAO(DBConnection conn) {
        this.conn = conn;
    }

    public Mark searchMarkId(int id) throws SQLException {
        PreparedStatement st = this.conn.getConnection().prepareStatement("SELECT * FROM meta WHERE idmeta = ?");
        st.setInt(1, id);

        ResultSet rs = st.executeQuery();

        if (!rs.next()) {
            return null;
        }

        int markIdDB = rs.getInt("idmeta");
        String markDescriptionDB = rs.getString("descricao");
        String markStatusDB = rs.getString("status");
        int markProjectIdDB = rs.getInt("projeto_idProjeto");

        Mark mark = new Mark(markIdDB, markDescriptionDB, markStatusDB, markProjectIdDB);

        rs.close();
        st.close();

        return mark;
    }
}
