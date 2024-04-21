package com.project.seminario.LoginAndRegister;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.project.seminario.DBConnection;

import com.project.seminario.Dashboard.Dashboard;

public class ViewLogin extends javax.swing.JFrame {
    DBConnection conn;

    public ViewLogin() {
        initComponents();
        conn = new DBConnection();
        if (conn == null) {
            JOptionPane.showMessageDialog(rootPane, "Impossível conectar-se ao banco de dados.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabelLogoCest = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldRegistration = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPasswordFieldPass = new javax.swing.JPasswordField();
        jButtonLogin = new javax.swing.JButton();
        jButtonRegister = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Tela de login");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabelLogoCest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoCESTazul.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Tela de login");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Sistema de gerenciamento para projetos universitários.");

        jLabel3.setText("Matrícula:");

        jTextFieldRegistration.setCaretColor(new java.awt.Color(0, 0, 102));

        jLabel4.setText("Senha:");

        jPasswordFieldPass.setCaretColor(new java.awt.Color(0, 0, 102));

        jButtonLogin.setBackground(new java.awt.Color(0, 0, 102));
        jButtonLogin.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jButtonLogin.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogin.setText("Entrar");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        jButtonRegister.setText("Criar nova conta.");
        jButtonRegister.setForeground(new Color(0, 0, 0));
        jButtonRegister.setFont(new Font("sansserif", 1, 12));
        jButtonRegister.setBorder(null);
        jButtonRegister.setContentAreaFilled(false);
        jButtonRegister.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(50, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabelLogoCest)
                                        .addComponent(jLabel2)
                                        .addComponent(jTextFieldRegistration)
                                        .addComponent(jPasswordFieldPass)
                                        .addComponent(jButtonLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 300,
                                                Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(75, 75, 75)
                                                .addComponent(jButtonRegister, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(50, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(40, Short.MAX_VALUE)
                                .addComponent(jLabelLogoCest)
                                .addGap(15, 15, 15)
                                .addComponent(jLabel1)
                                .addGap(15, 15, 15)
                                .addComponent(jLabel2)
                                .addGap(70, 70, 70)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPasswordFieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonRegister)
                                .addContainerGap(25, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));

        pack();
    }

    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        ViewRegister r = new ViewRegister();
        r.setTitle("Tela de cadastro");
        r.setVisible(true);
    }

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {
        String registration = jTextFieldRegistration.getText();
        String password = String.valueOf(jPasswordFieldPass.getPassword());
        if (password.isEmpty() && registration.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Os campos matrícula e senha não podem estar vazios", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else if (password.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "O campo Senha não pode estar vazio!", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else if (registration.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "O campo matrícula não pode estar vazio!", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            userLogin(registration, password);
        }
    }

    private void userLogin(String registration, String password) {
        Connection dbconn = null;
        try {
            dbconn = DBConnection.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            PreparedStatement st = (PreparedStatement) dbconn
                    .prepareStatement("Select * from usuario WHERE matricula = ? AND senha = ?");
            st.setString(1, registration);
            st.setString(2, password);
            ResultSet res = st.executeQuery();
            if (res.next()) {
                // tela de acesso ao sistema!!
                dispose();
                Dashboard d = new Dashboard();
                d.setTitle("Dashboard");
                d.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Matrícula ou senha não encontrados!", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewLogin().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelLogoCest;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldPass;
    private javax.swing.JTextField jTextFieldRegistration;
}
