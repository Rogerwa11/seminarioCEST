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

        int idDB = rs.getInt("idProjeto");
        String nameDB = rs.getString("nome");
        String descriptionDB = rs.getString("descricao");
        String startDateDB = rs.getString("dataInicio");
        String endDateDB = rs.getString("dataFim");
        String statusDB = rs.getString("status");
        int userRegistrationDB = rs.getInt("usuario_matricula");

        Project project = new Project(idDB, nameDB, descriptionDB, startDateDB, endDateDB, statusDB, userRegistrationDB);

        rs.close();
        st.close();

        return project;
    }
}
