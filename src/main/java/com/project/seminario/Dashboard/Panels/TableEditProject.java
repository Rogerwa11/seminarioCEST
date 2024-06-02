package com.project.seminario.Dashboard.Panels;

import com.project.seminario.DBConnection;
import com.project.seminario.Classes.Project;
import com.project.seminario.Classes.ProjectDAO;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TableEditProject extends javax.swing.JFrame {

    private DBConnection conn;
    private int id;
    private int userRegistration;
    private String name;
    private String description;
    private String startDate;
    private String startDateDD;
    private String startDateMM;
    private String startDateAAAA;
    private String endDate;
    private String endDateDD;
    private String endDateMM;
    private String endDateAAAA;
    private String status;

    public void getProjectInformations(int id) {
        try {
            ProjectDAO dao = new ProjectDAO(this.conn);
            Project project = dao.searchProjectId(id);
            if (project != null) {
                setId(project.getId());
                setName(project.getName());
                setDescription(project.getDescription());
                setStartDate(project.getStartDate());
                setEndDate(project.getEndDate());
                setStatus(project.getStatus());
                setUserRegistration(project.getUserRegistration());
                setStartDateDDMMAAAA();
                setEndDateDDMMAAAA();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Projeto não encontrado com ID: " + id, "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }

    private void alterProject() {
        try {

            setName(tfName.getText());
            setStatus(tfStatus.getText());

            this.startDateDD = tfStartDateDD.getText();
            this.startDateMM = tfStartDateMM.getText();
            this.startDateAAAA = tfStartDateAAAA.getText();

            this.endDateDD = tfEndDateDD.getText();
            this.endDateMM = tfEndDateMM.getText();
            this.endDateAAAA = tfEndDateAAAA.getText();

            setStartDate(this.startDateAAAA + this.startDateMM + this.startDateDD);
            setEndDate(this.endDateAAAA + this.endDateMM + this.endDateDD);
            setDescription(tfDescription.getText());

            PreparedStatement st = this.conn.getConnection().prepareStatement("UPDATE projeto SET nome = ?, descricao = ?, dataInicio = ?, dataFim = ?, status = ? WHERE idProjeto = ?");
            st.setString(1, this.name);
            st.setString(2, this.description);
            st.setString(3, this.startDate);
            st.setString(4, this.endDate);
            st.setString(5, this.status);
            st.setInt(6, this.id);

            st.executeUpdate();

            st.close();

            JOptionPane.showMessageDialog(rootPane, "Projeto atualiazdo com sucesso!", "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void checkFields(String nameString, String statusString, String startDateString, String endDateString, String descriptionString) {
        if (nameString.isEmpty() || statusString.isEmpty() || startDateString.isEmpty() || endDateString.isEmpty() || descriptionString.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Todos os campos devem ser preenchidos!", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            alterProject();
        }
    }

    private void deleteProject(int projectId) {
        try {
            PreparedStatement st = this.conn.getConnection().prepareStatement("DELETE FROM projeto WHERE idProjeto = ?");
            st.setInt(1, projectId);
            st.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void confirmDeleteProject() {
        int response = JOptionPane.showConfirmDialog(this, "Você deseja excluir o projeto: " + this.name, "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            int projectIdInt = Integer.parseInt(tfIdSearch.getText());
            deleteProject(projectIdInt);
            clearProjectFields();
        }
    }

    private void clearProjectFields() {
        tfDescription.setText("");
        tfEndDateDD.setText("");
        tfIdSearch.setText("");
        tfName.setText("");
        tfStartDateDD.setText("");
        tfStatus.setText("");
    }

    public void setId(int id) {
        this.id = id;
    }

    private void setStartDateDDMMAAAA() {
        String[] startDate = this.startDate.split("-");

        this.startDateDD = startDate[2];
        this.startDateMM = startDate[1];
        this.startDateAAAA = startDate[0];
    }

    private void setEndDateDDMMAAAA() {
        String[] endDate = this.endDate.split("-");

        this.endDateDD = endDate[2];
        this.endDateMM = endDate[1];
        this.endDateAAAA = endDate[0];
    }

    public void setUserRegistration(int userRegistration) {
        this.userRegistration = userRegistration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public TableEditProject(DBConnection conn) {
        this.conn = conn;
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tfIdSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        tfStatus = new javax.swing.JTextField();
        tfStartDateDD = new javax.swing.JTextField();
        tfEndDateDD = new javax.swing.JTextField();
        tfDescription = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        editMarkButton = new javax.swing.JButton();
        editTaskButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        tfStartDateMM = new javax.swing.JTextField();
        tfStartDateAAAA = new javax.swing.JTextField();
        tfEndDateMM = new javax.swing.JTextField();
        tfEndDateAAAA = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar projetos");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tfIdSearch.setText("1");

        jLabel1.setText("ID do projeto");

        jLabel2.setText("Nome do projeto");

        jLabel3.setText("Status");

        jLabel4.setText("Data de inicio");

        jLabel5.setText("Data de entrega");

        jLabel6.setText("Descrição do projeto");

        searchButton.setText("Buscar");
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButtonMouseClicked(evt);
            }
        });

        jButton1.setText("Editar projeto");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        editMarkButton.setText("Editar meta");
        editMarkButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMarkButtonMouseClicked(evt);
            }
        });

        editTaskButton.setText("Editar tarefa");
        editTaskButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editTaskButtonMouseClicked(evt);
            }
        });

        jLabel7.setText("Deletar projeto");

        deleteButton.setText("Deletar");
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tfDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfIdSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(searchButton)))
                                .addGap(59, 59, 59)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(deleteButton))
                                    .addComponent(tfStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tfEndDateDD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfEndDateMM, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfEndDateAAAA, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addComponent(editMarkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(104, 104, 104)
                                    .addComponent(editTaskButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(98, 98, 98)
                                    .addComponent(jButton1))
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfStartDateDD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfStartDateMM, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfStartDateAAAA, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfIdSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton)
                    .addComponent(jLabel7)
                    .addComponent(deleteButton))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfStartDateDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEndDateDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfStartDateMM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfStartDateAAAA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEndDateMM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEndDateAAAA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editMarkButton)
                    .addComponent(editTaskButton))
                .addGap(28, 28, 28))
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

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String nameString = tfName.getText();
        String statusString = tfStatus.getText();
        String startDateString = tfStartDateDD.getText();
        String endDateString = tfEndDateDD.getText();
        String descriptionString = tfDescription.getText();

        checkFields(nameString, statusString, startDateString, endDateString, descriptionString);
    }//GEN-LAST:event_jButton1MouseClicked

    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseClicked
        String searchId = tfIdSearch.getText();
        Integer searchIdInt = Integer.parseInt(searchId);

        getProjectInformations(searchIdInt);

        tfName.setText(this.name);
        tfStatus.setText(this.status);
        tfStartDateDD.setText(this.startDateDD);
        tfStartDateMM.setText(this.startDateMM);
        tfStartDateAAAA.setText(this.startDateAAAA);
        tfEndDateDD.setText(this.endDateDD);
        tfEndDateMM.setText(this.endDateMM);
        tfEndDateAAAA.setText(this.endDateAAAA);
        tfDescription.setText(this.description);
        setId(searchIdInt);

        //System.out.print(this.name + "\n");
        //System.out.print(this.status + "\n");
        //System.out.print(this.startDate + "\n");
        //System.out.print(this.endDate + "\n");
        //System.out.print(this.description + "\n");
    }//GEN-LAST:event_searchButtonMouseClicked

    private void editMarkButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMarkButtonMouseClicked
        TableEditMark tableEditMark = new TableEditMark(this.conn);
        tableEditMark.setVisible(true);
    }//GEN-LAST:event_editMarkButtonMouseClicked

    private void editTaskButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editTaskButtonMouseClicked
        TableEditTask tableEditTask = new TableEditTask(this.conn);
        tableEditTask.setVisible(true);
    }//GEN-LAST:event_editTaskButtonMouseClicked

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        confirmDeleteProject();
    }//GEN-LAST:event_deleteButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editMarkButton;
    private javax.swing.JButton editTaskButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField tfDescription;
    private javax.swing.JTextField tfEndDateAAAA;
    private javax.swing.JTextField tfEndDateDD;
    private javax.swing.JTextField tfEndDateMM;
    private javax.swing.JTextField tfIdSearch;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfStartDateAAAA;
    private javax.swing.JTextField tfStartDateDD;
    private javax.swing.JTextField tfStartDateMM;
    private javax.swing.JTextField tfStatus;
    // End of variables declaration//GEN-END:variables
}
