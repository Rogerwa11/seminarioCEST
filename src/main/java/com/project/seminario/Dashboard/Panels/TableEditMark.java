package com.project.seminario.Dashboard.Panels;

import com.project.seminario.Classes.Mark;
import com.project.seminario.Classes.MarkDAO;
import com.project.seminario.DBConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TableEditMark extends javax.swing.JFrame {

    private DBConnection conn;
    private String description = "";
    private String status = "";
    private String projectId = "";
    private String id = "";

    public void getMarkInformations(String id) {
        try {
            int idInt = Integer.parseInt(id);
            MarkDAO dao = new MarkDAO(this.conn);
            Mark mark = dao.searchMarkId(idInt);
            if (mark != null) {
                setDescription(mark.getDescription());
                setStatus(mark.getStatus());
                setProjectId(mark.getProjectId());
                setId(mark.getId());
            } else {
                JOptionPane.showMessageDialog(rootPane, "Meta não encontrada com ID: " + id, "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }

    private void alterMark() {
        try {
            String projectIdString = tfProjectId.getText();
            String searchId = tfSearchId.getText();

            int projectIdInt = Integer.parseInt(projectIdString);
            int searchedId = Integer.parseInt(searchId);

            PreparedStatement st = this.conn.getConnection().prepareStatement("UPDATE meta SET descricao = ?, status = ?, projeto_idProjeto = ? WHERE idmeta = ?");
            st.setString(1, this.description);
            st.setString(2, this.status);
            st.setInt(3, projectIdInt);
            st.setInt(4, searchedId);

            st.executeUpdate();

            st.close();

            JOptionPane.showMessageDialog(rootPane, "Meta atualiazda com sucesso!", "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void checkFields(String description, String status, String projectId, String markId) {
        if (description.isEmpty() || status.isEmpty() || projectId.isEmpty() || markId.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Todos os campos deve ser preenchidos!!", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            alterMark();
        }
    }

    private void clearMarkFields() {
        tfDescription.setText("");
        tfProjectId.setText("");
        tfSearchId.setText("");
        tfStatus.setText("");
    }

    public TableEditMark(DBConnection conn) {
        this.conn = conn;
        initComponents();
    }

    private void deleteMark(int markId) {
        try {
            PreparedStatement st = this.conn.getConnection().prepareStatement("DELETE FROM meta WHERE idmeta = ?");
            st.setInt(1, markId);
            st.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void confirmDeleteMark() {
        int response = JOptionPane.showConfirmDialog(this, "Você deseja excluir a meta: " + this.description, "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            int markIdInt = Integer.parseInt(tfSearchId.getText());
            deleteMark(markIdInt);
            clearMarkFields();
        }
    }

    public String getId() {
        return id;
    }

    public void setId(int id) {
        String idString = String.valueOf(id);
        this.id = idString;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        String projectIdString = String.valueOf(projectId);
        this.projectId = projectIdString;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tfSearchId = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        tfDescription = new javax.swing.JTextField();
        tfStatus = new javax.swing.JTextField();
        tfProjectId = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        deleteMarkButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar metas");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        searchButton.setText("Buscar");
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButtonMouseClicked(evt);
            }
        });

        saveButton.setText("Editar meta");
        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveButtonMouseClicked(evt);
            }
        });

        jLabel1.setText("Descrição");

        jLabel2.setText("Status");

        jLabel3.setText("Id do projeto");

        deleteMarkButton.setText("Deletar");
        deleteMarkButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMarkButtonMouseClicked(evt);
            }
        });

        jLabel4.setText("Deletar meta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfDescription)
                        .addComponent(tfStatus)
                        .addComponent(tfProjectId, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(102, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfSearchId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteMarkButton)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSearchId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton)
                    .addComponent(deleteMarkButton)
                    .addComponent(jLabel4))
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfProjectId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(saveButton)
                .addGap(32, 32, 32))
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
        String idString = tfSearchId.getText();
        getMarkInformations(idString);
        tfDescription.setText(this.description);
        tfStatus.setText(this.status);
        tfProjectId.setText(this.projectId);
    }//GEN-LAST:event_searchButtonMouseClicked

    private void saveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseClicked
        String projectIdString = tfProjectId.getText();
        String searchId = tfSearchId.getText();

        int projectIdInt = Integer.parseInt(projectIdString);
        int searchedId = Integer.parseInt(searchId);

        setDescription(tfDescription.getText());
        setStatus(tfStatus.getText());
        setProjectId(projectIdInt);
        setId(searchedId);

        checkFields(this.description, this.status, this.projectId, this.id);
    }//GEN-LAST:event_saveButtonMouseClicked

    private void deleteMarkButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMarkButtonMouseClicked
        confirmDeleteMark();
    }//GEN-LAST:event_deleteMarkButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteMarkButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField tfDescription;
    private javax.swing.JTextField tfProjectId;
    private javax.swing.JTextField tfSearchId;
    private javax.swing.JTextField tfStatus;
    // End of variables declaration//GEN-END:variables
}
