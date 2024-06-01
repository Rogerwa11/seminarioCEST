package com.project.seminario.Dashboard.Panels;

import com.project.seminario.Classes.Task;
import com.project.seminario.Classes.TaskDAO;
import com.project.seminario.DBConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class TableEditTask extends javax.swing.JFrame {

    private DBConnection conn;

    private String searchedId = "";
    private String description = "";
    private String priority = "";
    private String startDate = "";
    private String endDate = "";
    private String status = "";
    private String markId = "";
    private String responsibleRegistration = "";

    public TableEditTask(DBConnection conn) {
        this.conn = conn;
        initComponents();
    }

    private void getTaskInformations(String searchId) {
        try {
            int searchIdInt = Integer.parseInt(searchId);
            TaskDAO dao = new TaskDAO(this.conn);
            Task task = dao.searchTaskId(searchIdInt);
            if (task != null) {
                setDescription(task.getDescription());
                setPriority(task.getPriority());
                setStartDate(task.getStartDate());
                setEndDate(task.getEndDate());
                setStatus(task.getStatus());
                setMarkId(task.getMarkId());
                setResponsibleRegistration(task.getResponsibleRegistration());

                tfDescription.setText(this.description);
                tfPriority.setText(this.priority);
                tfStartDate.setText(this.startDate);
                tfEndDate.setText(this.endDate);
                tfStatus.setText(this.status);
                tfMarkId.setText(this.markId);
                tfResponsibleRegistration.setText(this.responsibleRegistration);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Tarefa não encontrado com ID: " + searchId, "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }

    private void alterTask() {
        try {
            int markIdInt = Integer.parseInt(tfMarkId.getText());
            int responsibleRegistrationInt = Integer.parseInt(tfResponsibleRegistration.getText());
            int searchedId = Integer.parseInt(tfSearchedId.getText());

            PreparedStatement st = this.conn.getConnection().prepareStatement("UPDATE tarefa SET descricao = ?, prioridade = ?, dataInicio = ?, dataFim = ?, status = ?, meta_idmeta = ?, usuario_matricula = ? WHERE idtarefa = ?");
            st.setString(1, this.description);
            st.setString(2, this.priority);
            st.setString(3, this.startDate);
            st.setString(4, this.endDate);
            st.setString(5, this.status);
            st.setInt(6, markIdInt);
            st.setInt(7, responsibleRegistrationInt);
            st.setInt(8, searchedId);

            st.executeUpdate();

            st.close();

            JOptionPane.showMessageDialog(rootPane, "Tarefa atualiazda com sucesso!", "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void checkFields(String description, String priority, String startDate, String endDate, String status, String markId, String responsibleRegistration) {
        if (description.isEmpty() || priority.isEmpty() || startDate.isEmpty() || endDate.isEmpty() || status.isEmpty() || markId.isEmpty() || responsibleRegistration.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Todos os campos devem ser preenchidos!!", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            alterTask();
        }
    }

    private void deleteTask(int taskId) {
        try {
            PreparedStatement st = this.conn.getConnection().prepareStatement("DELETE FROM tarefa WHERE idtarefa = ?");
            st.setInt(1, taskId);
            st.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void confirmdeleteTask() {
        int response = JOptionPane.showConfirmDialog(this, "Você deseja excluir a tarefa: " + this.description, "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            int taskIdInt = Integer.parseInt(tfSearchedId.getText());
            deleteTask(taskIdInt);
        }
    }

    public String getSearchedId() {
        return searchedId;
    }

    public void setSearchedId(String searchedId) {
        this.searchedId = searchedId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMarkId() {
        return markId;
    }

    public void setMarkId(int markId) {
        String markIdString = String.valueOf(markId);
        this.markId = markIdString;
    }

    public String getResponsibleRegistration() {
        return responsibleRegistration;
    }

    public void setResponsibleRegistration(int responsibleRegistration) {
        String responsibleRegistrationString = String.valueOf(responsibleRegistration);
        this.responsibleRegistration = responsibleRegistrationString;
    }

    public JButton getSearchButton() {
        return searchButton;
    }

    public void setSearchButton(JButton searchButton) {
        this.searchButton = searchButton;
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tfSearchedId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfDescription = new javax.swing.JTextField();
        tfStartDate = new javax.swing.JTextField();
        tfStatus = new javax.swing.JTextField();
        tfResponsibleRegistration = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfMarkId = new javax.swing.JTextField();
        tfEndDate = new javax.swing.JTextField();
        tfPriority = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        deleteTaskButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar tarefas");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tfSearchedId.setText("1");

        jLabel1.setText("ID da tarefa");

        searchButton.setText("Buscar");
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButtonMouseClicked(evt);
            }
        });

        jLabel2.setText("Descrição da tarefa");

        jLabel3.setText("Data de inicio");

        jLabel4.setText("Status");

        jLabel5.setText("Matrícula do responsável");

        jLabel6.setText("Nível de prioridade");

        jLabel7.setText("Data de entrega");

        jLabel8.setText("ID da meta ");

        saveButton.setText("Salvar");
        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveButtonMouseClicked(evt);
            }
        });

        jLabel10.setText("Deletar tarefa");

        deleteTaskButton.setText("Deletar");
        deleteTaskButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteTaskButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfResponsibleRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSearchedId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton)))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPriority, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfMarkId, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteTaskButton))
                            .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSearchedId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(searchButton)
                    .addComponent(jLabel10)
                    .addComponent(deleteTaskButton))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPriority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfMarkId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfResponsibleRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseClicked
        String queryID = tfSearchedId.getText();
        getTaskInformations(queryID);
    }//GEN-LAST:event_searchButtonMouseClicked

    private void saveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseClicked
        setDescription(tfDescription.getText());
        setPriority(tfPriority.getText());
        setStartDate(tfStartDate.getText());
        setEndDate(tfEndDate.getText());
        setStatus(tfStatus.getText());
        int markIdInt = Integer.parseInt(tfMarkId.getText());
        int responsibleRegistrationInt = Integer.parseInt(tfResponsibleRegistration.getText());
        setMarkId(markIdInt);
        setResponsibleRegistration(responsibleRegistrationInt);
        setSearchedId(tfSearchedId.getText());

        checkFields(this.description, this.priority, this.startDate, this.endDate, this.status, this.markId, this.responsibleRegistration);
    }//GEN-LAST:event_saveButtonMouseClicked

    private void deleteTaskButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteTaskButtonMouseClicked
        confirmdeleteTask();
    }//GEN-LAST:event_deleteTaskButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteTaskButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField tfDescription;
    private javax.swing.JTextField tfEndDate;
    private javax.swing.JTextField tfMarkId;
    private javax.swing.JTextField tfPriority;
    private javax.swing.JTextField tfResponsibleRegistration;
    private javax.swing.JTextField tfSearchedId;
    private javax.swing.JTextField tfStartDate;
    private javax.swing.JTextField tfStatus;
    // End of variables declaration//GEN-END:variables
}
