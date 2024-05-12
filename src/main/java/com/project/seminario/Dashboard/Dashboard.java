package com.project.seminario.Dashboard;

import com.project.seminario.DBConnection;
import com.project.seminario.Dashboard.Panels.CreateProjectPanel;
import com.project.seminario.Dashboard.Panels.UserPanel;
import java.awt.Color;
import com.project.seminario.Events.Colors;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Dashboard extends javax.swing.JFrame {

    private int registration;
    private String password;
    private DBConnection conn;

    Colors colors = new Colors();

    public Dashboard(DBConnection conn) {
        this.conn = conn;
        initComponents();
    }

    public void reloadDashboard() {
        initComponents();

    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRegistration() {
        return this.registration;
    }

    public String getPassword() {
        return this.password;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        sidepane = new javax.swing.JPanel();
        userInfosPanel = new javax.swing.JPanel();
        userInfosButton = new javax.swing.JButton();
        createProjectsPanel = new javax.swing.JPanel();
        createProjectsButton = new javax.swing.JButton();
        nextPanel = new javax.swing.JPanel();
        nextButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanelContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DashBoardHome");
        setMaximumSize(new java.awt.Dimension(910, 560));
        setMinimumSize(new java.awt.Dimension(910, 560));
        setPreferredSize(new java.awt.Dimension(1600, 900));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setForeground(new java.awt.Color(255, 255, 255));
        bg.setToolTipText("");
        setResizable(false);

        sidepane.setBackground(new java.awt.Color(8, 104, 126));
        sidepane.setRequestFocusEnabled(false);
        sidepane.setVerifyInputWhenFocusTarget(false);

        userInfosPanel.setBackground(new java.awt.Color(5, 111, 137));
        userInfosPanel.setFocusable(false);
        userInfosPanel.setRequestFocusEnabled(false);
        userInfosPanel.setVerifyInputWhenFocusTarget(false);

        userInfosButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        userInfosButton.setForeground(new java.awt.Color(255, 255, 255));
        userInfosButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuario-do-circulo.png"))); // NOI18N
        userInfosButton.setText("Usuario");
        userInfosButton.setBorder(null);
        userInfosButton.setContentAreaFilled(false);
        userInfosButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        userInfosButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        userInfosButton.setIconTextGap(60);
        userInfosButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userInfosButtonMouseClicked(evt);
            }

            public void mousePressed(java.awt.event.MouseEvent evt) {
                userInfosButtonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout userInfosPanelLayout = new javax.swing.GroupLayout(userInfosPanel);
        userInfosPanel.setLayout(userInfosPanelLayout);
        userInfosPanelLayout.setHorizontalGroup(
                userInfosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                userInfosPanelLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(userInfosButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        userInfosPanelLayout.setVerticalGroup(
                userInfosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(userInfosButton, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE));

        createProjectsPanel.setBackground(new java.awt.Color(5, 111, 137));

        createProjectsButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        createProjectsButton.setForeground(new java.awt.Color(255, 255, 255));
        createProjectsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adicionar.png"))); // NOI18N
        createProjectsButton.setText("Projetos");
        createProjectsButton.setBorder(null);
        createProjectsButton.setContentAreaFilled(false);
        createProjectsButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        createProjectsButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        createProjectsButton.setIconTextGap(56);
        createProjectsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createProjectsButtonMouseClicked(evt);
            }

            public void mousePressed(java.awt.event.MouseEvent evt) {
                createProjectsButtonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout createProjectsPanelLayout = new javax.swing.GroupLayout(createProjectsPanel);
        createProjectsPanel.setLayout(createProjectsPanelLayout);
        createProjectsPanelLayout.setHorizontalGroup(
                createProjectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                createProjectsPanelLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(createProjectsButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        createProjectsPanelLayout.setVerticalGroup(
                createProjectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(createProjectsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE));

        nextPanel.setBackground(new java.awt.Color(5, 111, 137));

        nextButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        nextButton.setForeground(new java.awt.Color(255, 255, 255));
        nextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adicionar.png"))); // NOI18N
        nextButton.setText("PróximoPainel");
        nextButton.setBorder(null);
        nextButton.setContentAreaFilled(false);
        nextButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nextButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        nextButton.setIconTextGap(40);
        nextButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nextButtonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout nextPanelLayout = new javax.swing.GroupLayout(nextPanel);
        nextPanel.setLayout(nextPanelLayout);
        nextPanelLayout.setHorizontalGroup(
                nextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nextPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(nextButton, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)));
        nextPanelLayout.setVerticalGroup(
                nextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nextButton, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE));

        javax.swing.GroupLayout sidepaneLayout = new javax.swing.GroupLayout(sidepane);
        sidepane.setLayout(sidepaneLayout);
        sidepaneLayout.setHorizontalGroup(
                sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(userInfosPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(createProjectsPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nextPanel, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE));
        sidepaneLayout.setVerticalGroup(
                sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(sidepaneLayout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(userInfosPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(createProjectsPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(nextPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));

        jPanel1.setBackground(new java.awt.Color(8, 104, 126));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 75, Short.MAX_VALUE));

        jPanelContent.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelContentLayout = new javax.swing.GroupLayout(jPanelContent);
        jPanelContent.setLayout(jPanelContentLayout);
        jPanelContentLayout.setHorizontalGroup(
                jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 645, Short.MAX_VALUE));
        jPanelContentLayout.setVerticalGroup(
                jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 517, Short.MAX_VALUE));

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
                bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(sidepane, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanelContent, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))));
        bgLayout.setVerticalGroup(
                bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(sidepane, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jPanelContent, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE));

        setBounds(0, 0, 900, 600);
    }// </editor-fold>//GEN-END:initComponents

    public void setUserPanel() {
        UserPanel UserPanel = new UserPanel(this.conn);
        UserPanel.getUserInformations(123);
        UserPanel.reloadUserPanel();
        jPanelContent.add(UserPanel).setVisible(true);

    }

    private void formWindowClosing(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowClosing
        try {
            this.conn.getConnection().close();
            System.out.print("conexão fechada");
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }// GEN-LAST:event_formWindowClosing

    private void userInfosButtonMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_userInfosButtonMousePressed
        colors.setStrongColor(userInfosPanel);
        colors.setWeakColor(createProjectsPanel);
        colors.setWeakColor(nextPanel);
    }// GEN-LAST:event_userInfosButtonMousePressed

    private void createProjectsButtonMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_createProjectsButtonMousePressed
        colors.setWeakColor(userInfosPanel);
        colors.setStrongColor(createProjectsPanel);
        colors.setWeakColor(nextPanel);
    }// GEN-LAST:event_createProjectsButtonMousePressed

    private void nextButtonMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_nextButtonMousePressed
        colors.setWeakColor(userInfosPanel);
        colors.setWeakColor(createProjectsPanel);
        colors.setStrongColor(nextPanel);
    }// GEN-LAST:event_nextButtonMousePressed

    private void userInfosButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_userInfosButtonMouseClicked
        UserPanel userPanel = new UserPanel(this.conn);
        userPanel.getUserInformations(this.registration);
        userPanel.reloadUserPanel();
        jPanelContent.removeAll();
        jPanelContent.add(userPanel).setVisible(true);
    }// GEN-LAST:event_userInfosButtonMouseClicked

    private void createProjectsButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_createProjectsButtonMouseClicked
        CreateProjectPanel createProjectPanel = new CreateProjectPanel(this.conn);
        createProjectPanel.getUserInformations(this.registration);
        createProjectPanel.reloadUserPanel();
        jPanelContent.removeAll();
        jPanelContent.add(createProjectPanel).setVisible(true);
    }// GEN-LAST:event_createProjectsButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton createProjectsButton;
    private javax.swing.JPanel createProjectsPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelContent;
    private javax.swing.JButton nextButton;
    private javax.swing.JPanel nextPanel;
    private javax.swing.JPanel sidepane;
    private javax.swing.JButton userInfosButton;
    private javax.swing.JPanel userInfosPanel;
    // End of variables declaration//GEN-END:variables
}
