package com.project.seminario.Classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.project.seminario.DBConnection;

public class ProjectDAO {

    private DBConnection conn;

    public ProjectDAO(DBConnection conn) {
        this.conn = conn;
    }

    public Project searchProjectId(int id) throws SQLException {
        PreparedStatement st = this.conn.getConnection().prepareStatement("SELECT * FROM projeto WHERE idProjeto = ?");
        st.setInt(1, id);

        ResultSet rs = st.executeQuery();

        if (!rs.next()) {
            return null;
        }

        int idBD = rs.getInt("idProjeto");
        String nameBD = rs.getString("nome");
        String descriptionBD = rs.getString("descricao");
        String startDateBD = rs.getString("dataInicio");
        String endDateBD = rs.getString("dataFim");
        String status = rs.getString("status");
        int userRegistrationBD = rs.getInt("usuario_matricula");

        Project project = new Project(idBD, nameBD, descriptionBD, startDateBD, endDateBD, status, userRegistrationBD);

        rs.close();
        st.close();

        return project;
    }
}
