package com.project.seminario.Dashboard.Panels;

import com.project.seminario.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TableCreateMark extends javax.swing.JFrame {

    private DBConnection conn;
    private String description = "";
    private String status = "";
    private String projectId = "";

    public TableCreateMark(DBConnection conn) {
        this.conn = conn;
        initComponents();
    }

    private void markRegister(String description, String status, int projectId) {
        try {
            PreparedStatement st = (PreparedStatement) conn.getConnection()
                    .prepareStatement(
                            "INSERT INTO meta (descricao,status,projeto_idProjeto) VALUES(?,?,?)");
            st.setString(1, description);
            st.setString(2, status);
            st.setInt(3, projectId);
            int res = st.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Meta cadastrada com sucesso!", "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE);
            st.close();
            dispose();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void projectVerify(DBConnection conn, String projectId) {
        int projectIdInt = Integer.parseInt(projectId);
        try {
            PreparedStatement st = (PreparedStatement) conn.getConnection()
                    .prepareStatement("select * from projeto WHERE idProjeto = ?");
            st.setInt(1, projectIdInt);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                markRegister(this.description, this.status, projectIdInt);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Não existe um projeto com ID: " + projectId, "Error",
                        JOptionPane.ERROR_MESSAGE);
                tfProjectId.setText("");
            }
        } catch (SQLException e) {
        }

    }

    private void fieldsVerify(String projectId, String projectDescription, String projectStatus) {
        if (projectId.isEmpty() || projectDescription.isEmpty() || projectStatus.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Todos os campos deve ser preenchidos!!", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            setDescription(tfDescription.getText());
            setStatus(tfStatus.getText());
            setProjectId(tfProjectId.getText());
            projectVerify(this.conn, this.projectId);
        }
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

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tfDescription = new javax.swing.JTextField();
        tfStatus = new javax.swing.JTextField();
        tfProjectId = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Criar metas");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        saveButton.setText("SALVAR");
        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveButtonMouseClicked(evt);
            }
        });

        jLabel1.setText("Descrição da meta");

        jLabel2.setText("Status");

        jLabel3.setText("Id do projeto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfDescription)
                        .addComponent(tfStatus)
                        .addComponent(tfProjectId, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addComponent(tfStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfProjectId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(saveButton)
                .addGap(17, 17, 17))
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

    private void saveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseClicked
        setDescription(tfDescription.getText());
        setStatus(tfStatus.getText());
        setProjectId(tfProjectId.getText());

        fieldsVerify(this.projectId, this.description, this.status);

        //projectVerify(this.conn, this.projectId);
        //markRegister(this.description, this.status, this.projectId);
    }//GEN-LAST:event_saveButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField tfDescription;
    private javax.swing.JTextField tfProjectId;
    private javax.swing.JTextField tfStatus;
    // End of variables declaration//GEN-END:variables
}
