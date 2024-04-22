package com.project.seminario.LoginAndRegister;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.project.seminario.DBConnection;

public class ViewRegister extends javax.swing.JFrame {

        public ViewRegister() {
                initComponents();
        }

        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jLabelLogoCest = new javax.swing.JLabel();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jTextFieldEmail = new javax.swing.JTextField();
                jLabel4 = new javax.swing.JLabel();
                jPasswordFieldPass = new javax.swing.JPasswordField();
                jLabel5 = new javax.swing.JLabel();
                jTextFieldName = new javax.swing.JTextField();
                jLabel6 = new javax.swing.JLabel();
                jTextFieldRegistration = new javax.swing.JTextField();
                jLabel7 = new javax.swing.JLabel();
                jTextFieldCourse = new javax.swing.JTextField();
                jButtonRegister = new javax.swing.JButton();
                jButtonBackToLogin = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setResizable(false);

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));

                jLabelLogoCest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoCESTazul.png"))); // NOI18N

                jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(0, 0, 102));
                jLabel1.setText("Tela de cadastro");

                jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(0, 0, 102));
                jLabel2.setText("Sistema de gerenciamento para projetos universitários.");

                jLabel3.setText("Email:");

                jTextFieldEmail.setCaretColor(new java.awt.Color(0, 0, 102));

                jLabel4.setText("Senha:");

                jPasswordFieldPass.setCaretColor(new java.awt.Color(0, 0, 102));

                jLabel5.setText("Nome completo:");

                jTextFieldName.setCaretColor(new java.awt.Color(0, 0, 102));

                jLabel6.setText("Matrícula:");

                jTextFieldRegistration.setCaretColor(new java.awt.Color(0, 0, 102));
                jTextFieldRegistration.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyTyped(java.awt.event.KeyEvent evt) {
                                jTextFieldRegistrationKeyTyped(evt);
                        }
                });

                jLabel7.setText("Curso:");

                jTextFieldCourse.setCaretColor(new java.awt.Color(0, 0, 102));

                jButtonRegister.setBackground(new java.awt.Color(0, 0, 102));
                jButtonRegister.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
                jButtonRegister.setForeground(new java.awt.Color(255, 255, 255));
                jButtonRegister.setText("Criar conta");
                jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButtonRegisterActionPerformed(evt);
                        }
                });

                jButtonBackToLogin.setForeground(new Color(0, 0, 0));
                jButtonBackToLogin.setFont(new Font("sansserif", 1, 12));
                jButtonBackToLogin.setBorder(null);
                jButtonBackToLogin.setContentAreaFilled(false);
                jButtonBackToLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
                jButtonBackToLogin.setText("Voltar para o login");
                jButtonBackToLogin.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButtonBackToLoginActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap(50, Short.MAX_VALUE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel7)
                                                                                .addComponent(jTextFieldCourse,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                300,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel6)
                                                                                .addComponent(jTextFieldRegistration,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                300,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                false)
                                                                                                .addComponent(jLabel5)
                                                                                                .addComponent(jLabel4)
                                                                                                .addComponent(jLabel3)
                                                                                                .addComponent(jLabel1)
                                                                                                .addComponent(jLabelLogoCest)
                                                                                                .addComponent(jLabel2)
                                                                                                .addComponent(jTextFieldEmail)
                                                                                                .addComponent(jPasswordFieldPass)
                                                                                                .addComponent(jButtonRegister,
                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                300,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jTextFieldName)))
                                                                .addContainerGap(50, Short.MAX_VALUE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jButtonBackToLogin,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                136,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap(40, Short.MAX_VALUE)
                                                                .addComponent(jLabelLogoCest)
                                                                .addGap(15, 15, 15)
                                                                .addComponent(jLabel1)
                                                                .addGap(15, 15, 15)
                                                                .addComponent(jLabel2)
                                                                .addGap(15, 15, 15)
                                                                .addComponent(jLabel3)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextFieldEmail,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(15, 15, 15)
                                                                .addComponent(jLabel4)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jPasswordFieldPass,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(15, 15, 15)
                                                                .addComponent(jLabel5)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextFieldName,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(15, 15, 15)
                                                                .addComponent(jLabel6)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextFieldRegistration,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(15, 15, 15)
                                                                .addComponent(jLabel7)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextFieldCourse,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(25, 25, 25)
                                                                .addComponent(jButtonRegister,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                35,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jButtonBackToLogin)
                                                                .addContainerGap(15, Short.MAX_VALUE)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

                pack();
        }

        private void jTextFieldRegistrationKeyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();

                if (!Character.isDigit(c)) {
                        evt.consume();
                }
        }

        private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {
                String email = jTextFieldEmail.getText();
                String password = String.valueOf(jPasswordFieldPass.getPassword());
                String name = jTextFieldName.getText();
                String registration = jTextFieldRegistration.getText();
                String course = jTextFieldCourse.getText();

                if (password.isEmpty() || email.isEmpty() || name.isEmpty() || registration.isEmpty()
                                || course.isEmpty()) {
                        JOptionPane.showMessageDialog(rootPane, "Todos os campos devem ser preenchidos!", "Erro",
                                        JOptionPane.ERROR_MESSAGE);
                } else {
                        userRegister(email, password, name, registration, course);
                }
        }

        private void jButtonBackToLoginActionPerformed(java.awt.event.ActionEvent evt) {
                dispose();
                ViewLogin l = new ViewLogin();
                l.setTitle("Tela de login");
                l.setVisible(true);
        }

        private void userRegister(String email, String password, String name, String registration, String course) {
                Connection dbconn = null;
                try {
                        dbconn = DBConnection.getConnection();
                } catch (SQLException e) {
                        e.printStackTrace();
                }
                try {

                        PreparedStatement checkStmt = dbconn
                                        .prepareStatement("SELECT * FROM usuario WHERE matricula = ?");
                        checkStmt.setString(1, registration);
                        ResultSet rs = checkStmt.executeQuery();

                        if (rs.next()) {
                                JOptionPane.showMessageDialog(rootPane, "Matrícula já cadastrada!", "Erro",
                                                JOptionPane.ERROR_MESSAGE);
                        } else {
                                PreparedStatement st = (PreparedStatement) dbconn
                                                .prepareStatement(
                                                                "INSERT INTO usuario (matricula,email,nome,senha,curso) VALUES(?,?,?,?,?)");
                                st.setString(1, registration);
                                st.setString(2, email);
                                st.setString(3, name);
                                st.setString(4, password);
                                st.setString(5, course);

                                // int res = st.executeUpdate();
                                JOptionPane.showMessageDialog(rootPane, "Usuário cadastrado com sucesso!", "Sucesso",
                                                JOptionPane.INFORMATION_MESSAGE);
                        }
                        rs.close();
                        checkStmt.close();

                } catch (SQLException e) {
                        e.printStackTrace();
                }
        }

        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {

                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(ViewRegister.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(ViewRegister.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(ViewRegister.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(ViewRegister.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                }

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new ViewRegister().setVisible(true);
                        }
                });
        }

        private javax.swing.JButton jButtonBackToLogin;
        private javax.swing.JButton jButtonRegister;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabelLogoCest;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPasswordField jPasswordFieldPass;
        private javax.swing.JTextField jTextFieldCourse;
        private javax.swing.JTextField jTextFieldEmail;
        private javax.swing.JTextField jTextFieldName;
        private javax.swing.JTextField jTextFieldRegistration;
}
