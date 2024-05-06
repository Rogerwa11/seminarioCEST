package com.project.seminario.LoginAndRegister;

import com.project.seminario.DBConnection;
import com.project.seminario.Dashboard.Dashboard;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import com.project.seminario.Events.Colors;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginAndRegister extends javax.swing.JFrame {

    private int registration;
    private String password;
    private DBConnection conn;
    Colors color = new Colors();
    Color corForte = new Color(3, 75, 93);
    Color corFraca = new Color(5, 111, 137);

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRegistration() {
        return this.registration;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }

    public LoginAndRegister(DBConnection conn) {
        this.conn = conn;
        if (conn == null) {
            JOptionPane.showMessageDialog(rootPane, "Impossível conectar-se ao banco de dados.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        labelRegistrationLogin = new javax.swing.JLabel();
        tfRegistrationLogin = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        labelPasswordLogin = new javax.swing.JLabel();
        tfPasswordLogin = new javax.swing.JPasswordField();
        jPanel11 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        labelPassword = new javax.swing.JLabel();
        tfPassword = new javax.swing.JPasswordField();
        jPanel12 = new javax.swing.JPanel();
        labelName = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        labelRegistration = new javax.swing.JLabel();
        tfRegistration = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        labelEmail4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        labelEmail5 = new javax.swing.JLabel();
        tfEmail4 = new javax.swing.JTextField();
        labelCourse = new javax.swing.JLabel();
        tfCourse = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        labelEmail7 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        registerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hello");
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        bg.setBackground(new java.awt.Color(5, 111, 137));
        bg.setInheritsPopupMenu(true);

        jPanel1.setBackground(new java.awt.Color(8, 104, 126));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        labelRegistrationLogin.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelRegistrationLogin.setForeground(new java.awt.Color(255, 255, 255));
        labelRegistrationLogin.setText("Matrícula:");

        tfRegistrationLogin.setBackground(new java.awt.Color(8, 104, 126));
        tfRegistrationLogin.setForeground(new java.awt.Color(255, 255, 255));
        tfRegistrationLogin.setBorder(null);
        tfRegistrationLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfRegistrationLoginKeyTyped(evt);
            }
        });

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setPreferredSize(new java.awt.Dimension(0, 2));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        labelPasswordLogin.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelPasswordLogin.setForeground(new java.awt.Color(255, 255, 255));
        labelPasswordLogin.setText("Senha:");

        tfPasswordLogin.setBackground(new java.awt.Color(8, 104, 126));
        tfPasswordLogin.setForeground(new java.awt.Color(255, 255, 255));
        tfPasswordLogin.setBorder(null);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setPreferredSize(new java.awt.Dimension(0, 2));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(5, 111, 137));

        loginButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Entrar");
        loginButton.setBorder(null);
        loginButton.setContentAreaFilled(false);
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginButtonMouseExited(evt);
            }
        });
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoCESTazul.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(labelPasswordLogin)
                        .addComponent(tfRegistrationLogin)
                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                        .addComponent(labelRegistrationLogin)
                        .addComponent(tfPasswordLogin)
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(labelRegistrationLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tfRegistrationLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(labelPasswordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tfPasswordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        labelEmail.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelEmail.setForeground(new java.awt.Color(255, 255, 255));
        labelEmail.setText("Email:");

        tfEmail.setBackground(new java.awt.Color(5, 111, 137));
        tfEmail.setForeground(new java.awt.Color(255, 255, 255));
        tfEmail.setBorder(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(0, 2));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        labelPassword.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelPassword.setForeground(new java.awt.Color(255, 255, 255));
        labelPassword.setText("Senha:");

        tfPassword.setBackground(new java.awt.Color(5, 111, 137));
        tfPassword.setForeground(new java.awt.Color(255, 255, 255));
        tfPassword.setBorder(null);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setPreferredSize(new java.awt.Dimension(0, 2));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        labelName.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelName.setForeground(new java.awt.Color(255, 255, 255));
        labelName.setText("Nome completo:");

        tfName.setBackground(new java.awt.Color(5, 111, 137));
        tfName.setForeground(new java.awt.Color(255, 255, 255));
        tfName.setBorder(null);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(0, 2));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        labelRegistration.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelRegistration.setForeground(new java.awt.Color(255, 255, 255));
        labelRegistration.setText("Matrícula:");

        tfRegistration.setBackground(new java.awt.Color(5, 111, 137));
        tfRegistration.setForeground(new java.awt.Color(255, 255, 255));
        tfRegistration.setBorder(null);
        tfRegistration.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfRegistrationKeyTyped(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(0, 2));

        labelEmail4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelEmail4.setForeground(new java.awt.Color(255, 255, 255));
        labelEmail4.setText("Email:");

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(0, 2));

        labelEmail5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelEmail5.setForeground(new java.awt.Color(255, 255, 255));
        labelEmail5.setText("Email:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        tfEmail4.setBackground(new java.awt.Color(8, 104, 126));
        tfEmail4.setForeground(new java.awt.Color(255, 255, 255));
        tfEmail.setBorder(null);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(labelEmail4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfEmail4)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(tfEmail4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(labelEmail4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        labelCourse.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelCourse.setForeground(new java.awt.Color(255, 255, 255));
        labelCourse.setText("Curso:");

        tfCourse.setBackground(new java.awt.Color(5, 111, 137));
        tfCourse.setForeground(new java.awt.Color(255, 255, 255));
        tfCourse.setBorder(null);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(0, 2));

        labelEmail7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        labelEmail7.setForeground(new java.awt.Color(255, 255, 255));
        labelEmail7.setText("Email:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(8, 104, 126));

        registerButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        registerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerButton.setText("Criar conta");
        registerButton.setBorder(null);
        registerButton.setContentAreaFilled(false);
        registerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerButtonMouseExited(evt);
            }
        });
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfEmail)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                        .addComponent(labelEmail)
                        .addComponent(labelPassword)
                        .addComponent(labelName)
                        .addComponent(tfName)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                        .addComponent(labelRegistration)
                        .addComponent(tfRegistration)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelCourse)
                        .addComponent(tfCourse)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfPassword)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(100, 100, 100))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(labelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(labelRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tfRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(labelCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tfCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 828, 508);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            this.conn.getConnection().close();
            System.out.print("Conexão fechada");
        } catch (SQLException ex) {
            Logger.getLogger(LoginAndRegister.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosing

    private void loginButtonMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_loginButtonMouseEntered
        color.setColor(jPanel3, corForte);
    }// GEN-LAST:event_loginButtonMouseEntered

    private void loginButtonMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_loginButtonMouseExited
        color.setColor(jPanel3, corFraca);
    }// GEN-LAST:event_loginButtonMouseExited

    private void registerButtonMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_registerButtonMouseEntered
        color.setColor(jPanel9, corForte);
    }// GEN-LAST:event_registerButtonMouseEntered

    private void registerButtonMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_registerButtonMouseExited
        Color corFraca1 = new Color(8, 104, 126);
        color.setColor(jPanel9, corFraca1);
    }// GEN-LAST:event_registerButtonMouseExited

    private void userLogin(int registration, String password) {
        try {
            PreparedStatement st = (PreparedStatement) conn.getConnection()
                    .prepareStatement("Select * from usuario WHERE matricula = ? AND senha = ?");
            st.setInt(1, registration);
            st.setString(2, password);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                // tela de acesso ao sistema!!
                Dashboard d = new Dashboard(this.conn);
                d.setPassword(password);
                d.setRegistration(registration);
                d.reloadDashboard();
                dispose();
                d.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(rootPane, "Matrícula ou senha não encontrados!", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
            st.close();
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void userRegister(String email, String password, String name, int registration, String course) {
        try {
            PreparedStatement chkSt = conn.getConnection()
                    .prepareStatement("SELECT * FROM usuario WHERE matricula = ?");
            chkSt.setInt(1, registration);
            ResultSet rs = chkSt.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(rootPane, "Matrícula já cadastrada!", "Erro",
                        JOptionPane.ERROR_MESSAGE);
                chkSt.close();
                rs.close();
            } else {
                PreparedStatement st = (PreparedStatement) conn.getConnection()
                        .prepareStatement("INSERT INTO usuario (matricula,email,nome,senha,curso) VALUES(?,?,?,?,?)");
                st.setInt(1, registration);
                st.setString(2, email);
                st.setString(3, name);
                st.setString(4, password);
                st.setString(5, course);
                int res = st.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "Usuário cadastrado com sucesso!", "Sucesso",
                        JOptionPane.INFORMATION_MESSAGE);
                st.close();
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void verificarCamposLogin(String registration, String password) {
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
            int registrationInt = Integer.parseInt(registration);
            setPassword(password);
            setRegistration(registrationInt);
            userLogin(registrationInt, password);
        }
    }

    private void verificarCamposRegister(String email, String password, String name, String registration,
            String course) {
        if (password.isEmpty() || email.isEmpty() || name.isEmpty() || registration.isEmpty()
                || course.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Todos os campos de cadastro devem ser preenchidos!", "Erro",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            int registrationInt = Integer.parseInt(registration);
            userRegister(email, password, name, registrationInt, course);
        }
    }

    private void tfRegistrationLoginKeyTyped(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_tfMatriculaLoginKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }// GEN-LAST:event_tfMatriculaLoginKeyTyped

    private void tfRegistrationKeyTyped(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_tfMatriculaKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }// GEN-LAST:event_tfMatriculaKeyTyped

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BotaoRegisterActionPerformed
        String email = tfEmail.getText();
        String password = String.valueOf(tfPassword.getPassword());
        String name = tfName.getText();
        String registration = tfRegistration.getText();
        String course = tfCourse.getText();

        verificarCamposRegister(email, password, name, registration, course);
    }// GEN-LAST:event_BotaoRegisterActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BotaoLoginActionPerformed
        String registration = tfRegistrationLogin.getText();
        String password = String.valueOf(tfPasswordLogin.getPassword());
        verificarCamposLogin(registration, password);
    }// GEN-LAST:event_BotaoLoginActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel labelCourse;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEmail4;
    private javax.swing.JLabel labelEmail5;
    private javax.swing.JLabel labelEmail7;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelPasswordLogin;
    private javax.swing.JLabel labelRegistration;
    private javax.swing.JLabel labelRegistrationLogin;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton registerButton;
    private javax.swing.JTextField tfCourse;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfEmail4;
    private javax.swing.JTextField tfName;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JPasswordField tfPasswordLogin;
    private javax.swing.JTextField tfRegistration;
    private javax.swing.JTextField tfRegistrationLogin;
    // End of variables declaration//GEN-END:variables
}
