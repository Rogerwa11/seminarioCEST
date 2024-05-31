package com.project.seminario.Dashboard.Panels;

import com.project.seminario.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TableViewProjects extends javax.swing.JFrame {
    
    private DBConnection conn;
    
    public TableViewProjects(DBConnection conn) {
        this.conn = conn;
        initComponents();
        setResizable(false);
    }
    
    private void GetProjects() {
        try {
            PreparedStatement st = (PreparedStatement) conn.getConnection()
                    .prepareStatement("select * from projeto");
            ResultSet rs = st.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            int cols = rsmd.getColumnCount();
            String[] colName = new String[cols];
            for (int i = 0; i < cols; i++) {
                colName[i] = rsmd.getColumnName(i + 1);
            }
            model.setColumnIdentifiers(colName);
            
            String id, name, desc, startDate, endDate, status, registration;
            
            while (rs.next()) {
                id = rs.getString(1);
                name = rs.getString(2);
                desc = rs.getString(3);
                startDate = rs.getString(4);
                endDate = rs.getString(5);
                status = rs.getString(6);
                registration = rs.getString(7);
                String[] row = {id, name, desc, startDate, endDate, status, registration};
                model.addRow(row);
            }
            rs.close();
            st.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void GetMark(int searchedId) {
        try {
            PreparedStatement st = (PreparedStatement) conn.getConnection()
                    .prepareStatement("select * from meta WHERE projeto_idProjeto = ?");
            st.setInt(1, searchedId);
            ResultSet rs = st.executeQuery();
            
            ResultSetMetaData rsmd = rs.getMetaData();
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            int cols = rsmd.getColumnCount();
            String[] colName = new String[cols];
            for (int i = 0; i < cols; i++) {
                colName[i] = rsmd.getColumnName(i + 1);
            }
            model.setColumnIdentifiers(colName);
            
            String id, desc, status, projectId;
            
            while (rs.next()) {
                id = rs.getString(1);
                desc = rs.getString(2);
                status = rs.getString(3);
                projectId = rs.getString(4);
                String[] row = {id, desc, status, projectId};
                System.out.print(row);
                model.addRow(row);
            }
            
            if (!rs.next()) {
                System.out.print("Sem mais metas para exibir");
            }
            rs.close();
            st.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void GetTask(int searchedId) {
        try {
            PreparedStatement st = (PreparedStatement) conn.getConnection()
                    .prepareStatement("select * from tarefa WHERE meta_idmeta = ?");
            st.setInt(1, searchedId);
            ResultSet rs = st.executeQuery();
            
            ResultSetMetaData rsmd = rs.getMetaData();
            DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
            int cols = rsmd.getColumnCount();
            String[] colName = new String[cols];
            for (int i = 0; i < cols; i++) {
                colName[i] = rsmd.getColumnName(i + 1);
            }
            model.setColumnIdentifiers(colName);
            
            String id, desc, priority, startDate, endDate, status, idMark, userRegistration;
            
            while (rs.next()) {
                id = rs.getString(1);
                desc = rs.getString(2);
                priority = rs.getString(3);
                startDate = rs.getString(4);
                endDate = rs.getString(5);
                status = rs.getString(6);
                idMark = rs.getString(7);
                userRegistration = rs.getString(8);
                
                String[] row = {id, desc, priority, startDate, endDate, status, idMark, userRegistration};
                System.out.print(row);
                model.addRow(row);
            }
            
            if (!rs.next()) {
                System.out.print("Sem mais tarefas para exibir");
            }
            rs.close();
            st.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void clearTable(JTable table) {
        table.setModel(new DefaultTableModel());
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        showButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Visualizar projetos");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        showButton.setText("Atualizar");
        showButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showButtonMouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(showButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(showButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void showButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showButtonMouseClicked
        clearTable(jTable1);
        GetProjects();
    }//GEN-LAST:event_showButtonMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        clearTable(jTable2);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String tblId = model.getValueAt(jTable1.getSelectedRow(), 0).toString();
        int tblIdInt = Integer.parseInt(tblId);
        
        GetMark(tblIdInt);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        clearTable(jTable3);
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        String tblId = model.getValueAt(jTable2.getSelectedRow(), 0).toString();
        int tblIdInt = Integer.parseInt(tblId);
        GetTask(tblIdInt);
    }//GEN-LAST:event_jTable2MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JButton showButton;
    // End of variables declaration//GEN-END:variables
}
