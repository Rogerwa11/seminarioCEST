package com.project.seminario.Dashboard.Panels;

import com.project.seminario.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TableCreateTask extends javax.swing.JFrame {

    private String description = "";
    private String priority = "";
    private String startDate = "";
    private String endDate = "";
    private String status = "";
    private String markId = "";
    private String responsibleRegistration = "";
    private DBConnection conn;

    private void taskRegister(String description, String priority, String startDate, String endDate, String status, String markId, String responsibleRegistration) {
        try {
            int markIdInt = Integer.parseInt(markId);
            int responsibleRegistrationInt = Integer.parseInt(responsibleRegistration);
            PreparedStatement st = (PreparedStatement) conn.getConnection()
                    .prepareStatement(
                            "INSERT INTO tarefa (descricao,prioridade,dataInicio,dataFim,status,meta_idmeta,usuario_matricula) VALUES(?,?,?,?,?,?,?)");
            st.setString(1, description);
            st.setString(2, priority);
            st.setString(3, startDate);
            st.setString(4, endDate);
            st.setString(5, status);
            st.setInt(6, markIdInt);
            st.setInt(7, responsibleRegistrationInt);
            int res = st.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Tarefa cadastrada com sucesso!", "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE);
            st.close();
            dispose();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void projectVerify(DBConnection conn, String markId) {
        int markIdInt = Integer.parseInt(markId);
        try {
            PreparedStatement st = (PreparedStatement) conn.getConnection()
                    .prepareStatement("select * from meta WHERE idmeta = ?");
            st.setInt(1, markIdInt);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                taskRegister(this.description, this.priority, this.startDate, this.endDate, this.status, this.markId, this.responsibleRegistration);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Não existe um projeto com ID: " + markId, "Error",
                        JOptionPane.ERROR_MESSAGE);
                tfMarkId.setText("");
            }
        } catch (SQLException e) {
        }

    }
    
    private void verifyFields(String description, String priority, String startDate, String endDate, String status, String markId, String responsibleRegistration){
        if(description.isEmpty() || priority.isEmpty() || startDate.isEmpty() || endDate.isEmpty() || status.isEmpty() || markId.isEmpty() || responsibleRegistration.isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Todos os campos devem ser preenchidos!!" + markId, "Error",
                        JOptionPane.ERROR_MESSAGE);
        }else{
            projectVerify(this.conn, this.markId);
        }
    }
    

    public TableCreateTask(DBConnection conn) {
        this.conn = conn;
        initComponents();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getMarkId() {
        return markId;
    }

    public void setMarkId(String markId) {
        this.markId = markId;
    }

    public String getResponsibleRegistration() {
        return responsibleRegistration;
    }

    public void setResponsibleRegistration(String responsibleRegistration) {
        this.responsibleRegistration = responsibleRegistration;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tfDescription = new javax.swing.JTextField();
        tfPriority = new javax.swing.JTextField();
        tfStartDate = new javax.swing.JTextField();
        tfEndDate = new javax.swing.JTextField();
        tfStatus = new javax.swing.JTextField();
        tfMarkId = new javax.swing.JTextField();
        tfResponsibleRegistration = new javax.swing.JTextField();
        SaveButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Criar metas");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        SaveButton.setText("Criar");
        SaveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveButtonMouseClicked(evt);
            }
        });

        jLabel1.setText("Descrição");

        jLabel2.setText("Prioridade");

        jLabel3.setText("data inicio");

        jLabel4.setText("data fim");

        jLabel5.setText("status");

        jLabel6.setText("id meta");

        jLabel7.setText("responsavel");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfResponsibleRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfPriority, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(tfEndDate)
                    .addComponent(tfMarkId)
                    .addComponent(SaveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(tfPriority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfMarkId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfResponsibleRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(SaveButton))
                .addContainerGap(47, Short.MAX_VALUE))
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

    private void SaveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveButtonMouseClicked
        setDescription(tfDescription.getText());
        setPriority(tfPriority.getText());
        setStartDate(tfStartDate.getText());
        setEndDate(tfEndDate.getText());
        setStatus(tfStatus.getText());
        setMarkId(tfMarkId.getText());
        setResponsibleRegistration(tfResponsibleRegistration.getText());
        
        verifyFields(this.description, this.priority, this.startDate, this.endDate, this.status, this.markId, this.responsibleRegistration);
        
    }//GEN-LAST:event_SaveButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SaveButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfDescription;
    private javax.swing.JTextField tfEndDate;
    private javax.swing.JTextField tfMarkId;
    private javax.swing.JTextField tfPriority;
    private javax.swing.JTextField tfResponsibleRegistration;
    private javax.swing.JTextField tfStartDate;
    private javax.swing.JTextField tfStatus;
    // End of variables declaration//GEN-END:variables
}
