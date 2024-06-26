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

    public void setProjectStartDate(String projectStartDateAAAA, String projectStartDateMM, String projectStartDateDD) {
        String projectStartDate = projectStartDateAAAA+projectStartDateMM+projectStartDateDD;
        this.projectStartDate = projectStartDate;
    }

    public String getProjectEndDate() {
        return projectEndDate;
    }

    public void setProjectEndDate(String projectEndDateAAAA, String projectEndDateMM, String projectEndDateDD) {
        String projectEndDate = projectEndDateAAAA+ projectEndDateMM+ projectEndDateDD;
        this.projectEndDate = projectEndDate;
    }

    public String getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        createButton = new javax.swing.JButton();
        tfStatus = new javax.swing.JTextField();
        tfStartDateDD = new javax.swing.JTextField();
        tfEndDateDD = new javax.swing.JTextField();
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
        tfStartDateMM = new javax.swing.JTextField();
        tfStartDateAAAA = new javax.swing.JTextField();
        tfEndDateMM = new javax.swing.JTextField();
        tfEndDateAAAA = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Criar projetos");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        createButton.setText("Criar projeto");
        createButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createButtonMouseClicked(evt);
            }
        });
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome do projeto");

        jLabel2.setText("Status");

        jLabel3.setText("Data de inicio DD/MM/AAAA");

        jLabel4.setText("Data de entrega DD/MM/AAAA");

        jLabel5.setText("Descrição");

        jLabel6.setText("Matrícula");

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
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(createMarkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(createTaskButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfEndDateDD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfEndDateMM, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfEndDateAAAA, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfStartDateDD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfStartDateMM, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfStartDateAAAA, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(89, 89, 89)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfStartDateDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfStartDateMM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfStartDateAAAA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEndDateDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEndDateMM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEndDateAAAA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(108, 108, 108)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        
    }//GEN-LAST:event_createButtonActionPerformed

    private void tfNameActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void createButtonMouseClicked(java.awt.event.MouseEvent evt) {
        setProjectName(tfName.getText());
        setProjectDescription(tfDescription.getText());
        setProjectEndDate(tfEndDateAAAA.getText(), tfEndDateMM.getText(), tfEndDateDD.getText());
        setProjectStartDate(tfStartDateAAAA.getText(), tfStartDateMM.getText(), tfStartDateDD.getText());
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
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createButton;
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
    private javax.swing.JTextField tfDescription;
    private javax.swing.JTextField tfEndDateAAAA;
    private javax.swing.JTextField tfEndDateDD;
    private javax.swing.JTextField tfEndDateMM;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfStartDateAAAA;
    private javax.swing.JTextField tfStartDateDD;
    private javax.swing.JTextField tfStartDateMM;
    private javax.swing.JTextField tfStatus;
    // End of variables declaration//GEN-END:variables
}
