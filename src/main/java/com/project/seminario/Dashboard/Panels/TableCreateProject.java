package com.project.seminario.Dashboard.Panels;

import com.project.seminario.DBConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TableCreateProject extends javax.swing.JFrame {

    private int registration;
    private String projectName;
    private String projectDescription;
    private String projectStartDate;
    private String projectEndDate;
    private String projectStatus;
    private String registrationString;
    private DBConnection conn;

    public void reloadTableCreateProject() {
        jTextField2.setText(this.registrationString);
        System.err.println("reloadTableCreateProject");
        // initComponents();
    }

    private void projectRegister(String projectName, String projectDescription, String projectStartDate,
            String projectEndDate, String projectStatus, int registration) {
        try {
            PreparedStatement st = (PreparedStatement) conn.getConnection()
                    .prepareStatement(
                            "INSERT INTO projeto (nome,descricao,dataInicio,dataFim,status,usuario_matricula) VALUES(?,?,?,?,?,?)");
            st.setString(1, projectName);
            st.setString(2, projectDescription);
            st.setString(3, projectStartDate);
            st.setString(4, projectEndDate);
            st.setString(5, projectStatus);
            st.setInt(6, registration);
            int res = st.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Projeto cadastrado com sucesso!", "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE);
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void projectCheckFields(String projectName, String projectDescription, String projectStartDate,
            String projectEndDate, String projectStatus, String registration) {
        if (projectName.isEmpty() || projectDescription.isEmpty() || projectStartDate.isEmpty()
                || projectEndDate.isEmpty()
                || projectStatus.isEmpty() || registration.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Todos os campos de cadastro devem ser preenchidos!", "Erro",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            int registrationInt = Integer.parseInt(registration);
            projectRegister(projectName, projectDescription, projectStartDate, projectEndDate, projectStatus,
                    registrationInt);
        }
    }

    public TableCreateProject(DBConnection conn) {
        this.conn = conn;
        setResizable(false);
        initComponents();

    }

    public String getRegistrationString() {
        return registrationString;
    }

    public void setRegistrationString(int registration) {
        registrationString = String.valueOf(registration);
        this.registrationString = registrationString;
    }

    public int getRegistration() {
        return registration;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public String getProjectStartDate() {
        return projectStartDate;
    }

    public void setProjectStartDate(String projectStartDate) {
        this.projectStartDate = projectStartDate;
    }

    public String getProjectEndDate() {
        return projectEndDate;
    }

    public void setProjectEndDate(String projectEndDate) {
        this.projectEndDate = projectEndDate;
    }

    public String getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        saveButton = new javax.swing.JButton();
        tfStatus = new javax.swing.JTextField();
        tfStartDate = new javax.swing.JTextField();
        tfEndDate = new javax.swing.JTextField();
        tfDescription = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        createMarkButton = new javax.swing.JButton();
        createTaskButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Criar projetos");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        saveButton.setText("Salvar");
        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveButtonMouseClicked(evt);
            }
        });

        jLabel1.setText("nome");

        jLabel2.setText("status");

        jLabel3.setText("data inicio");

        jLabel4.setText("data entrega");

        jLabel5.setText("descrição");

        jLabel6.setText("matricula");

        tfName.setToolTipText("aaaaa");
        tfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNameActionPerformed(evt);
            }
        });

        createMarkButton.setText("Criar meta");
        createMarkButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createMarkButtonMouseClicked(evt);
            }
        });

        createTaskButton.setText("Criar tarefa");
        createTaskButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createTaskButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(createMarkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                        .addComponent(createTaskButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfEndDate, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(tfStartDate)
                            .addComponent(jTextField2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfName)
                            .addComponent(tfStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(tfDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(108, 108, 108)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(createMarkButton)
                    .addComponent(createTaskButton))
                .addGap(30, 30, 30))
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

    private void createMarkButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createMarkButtonMouseClicked
        TableCreateMark tableCreateMark = new TableCreateMark(this.conn);
        tableCreateMark.setVisible(true);
    }//GEN-LAST:event_createMarkButtonMouseClicked

    private void createTaskButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createTaskButtonMouseClicked
        TableCreateTask tableCreateTask = new TableCreateTask(this.conn);
        tableCreateTask.setVisible(true);
    }//GEN-LAST:event_createTaskButtonMouseClicked

    private void tfNameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_tfNameActionPerformed

    }

    private void saveButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_saveButtonMouseClicked
        setProjectName(tfName.getText());
        setProjectDescription(tfDescription.getText());
        setProjectEndDate(tfEndDate.getText());
        setProjectStartDate(tfStartDate.getText());
        setProjectStatus(tfStatus.getText());

        // System.out.print(this.projectName+"\n");
        // System.out.print(this.registrationString+"\n");
        // System.out.print(this.projectDescription+"\n");
        // System.out.print(this.projectEndDate+"\n");
        // System.out.print(this.projectStartDate+"\n");
        // System.out.print(this.projectStatus+"\n");
        projectCheckFields(projectName, projectDescription, projectStartDate, projectEndDate, projectStatus,
                this.registrationString);
        dispose();
    }// GEN-LAST:event_saveButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createMarkButton;
    private javax.swing.JButton createTaskButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField tfDescription;
    private javax.swing.JTextField tfEndDate;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfStartDate;
    private javax.swing.JTextField tfStatus;
    // End of variables declaration//GEN-END:variables
}
