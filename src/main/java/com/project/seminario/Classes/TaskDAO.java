package com.project.seminario.Classes;

import com.project.seminario.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TaskDAO {

    private DBConnection conn;

    public TaskDAO(DBConnection conn) {
        this.conn = conn;
    }

    public Task searchTaskId(int taskId) throws SQLException {
        PreparedStatement st = this.conn.getConnection().prepareStatement("SELECT * FROM tarefa WHERE idtarefa = ?");
        st.setInt(1, taskId);

        ResultSet rs = st.executeQuery();

        if (!rs.next()) {
            return null;
        }

        int taskIdDB = rs.getInt("idtarefa");
        String descriptionDB = rs.getString("descricao");
        String priorityDB = rs.getString("prioridade");
        String startDateDB = rs.getString("dataInicio");
        String endDateDB = rs.getString("dataFim");
        String statusDB = rs.getString("status");
        int markIdDB = rs.getInt("meta_idmeta");
        int responsibleRegistrationDB = rs.getInt("usuario_matricula");

        Task task = new Task(taskIdDB, descriptionDB, priorityDB, startDateDB, endDateDB, statusDB, markIdDB, responsibleRegistrationDB);

        rs.close();
        st.close();

        return task;
    }
}
