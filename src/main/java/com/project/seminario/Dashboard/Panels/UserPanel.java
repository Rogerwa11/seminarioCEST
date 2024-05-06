package com.project.seminario.Dashboard.Panels;

import com.project.seminario.DBConnection;
import com.project.seminario.Events.User;
import com.project.seminario.Events.UserDAO;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class UserPanel extends javax.swing.JInternalFrame {

    private String password;
    private int registration;
    private String email;
    private String name;
    private String course;
    private DBConnection conn;

    public UserPanel(DBConnection conn) {
        this.conn = conn;
        initComponents();
    }

    public void reloadUserPanel() {
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        initComponents();
    }

    public void getUserInformations(int registration) {
        try {
            UserDAO dao = new UserDAO(this.conn);
            User user = dao.searchUserRegistration(registration);
            if (user != null) {
                setRegistration(user.getMatricula());
                setCourse(user.getCurso());
                setPassword(user.getSenha());
                setName(user.getNome());
                setEmail(user.getEmail());
            } else {
                System.out.println("Usuário não encontrado com matrícula: " + registration);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }

    public String getPassword() {
        return password;
    }

    public int getRegistration() {
        return registration;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setText("Matricula: " + this.registration);

        jLabel2.setText("Nome: " + this.name);

        jLabel3.setText("Senha: " + this.password);

        jLabel4.setText("Email: " + this.email);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 180,
                                                Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(469, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(308, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
