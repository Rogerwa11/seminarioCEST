package com.project.seminario.Main;

import com.project.seminario.DBConnection;
import com.project.seminario.LoginAndRegister.LoginAndRegister;

public class Main {

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginAndRegister.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginAndRegister.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginAndRegister.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginAndRegister.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        DBConnection conn = new DBConnection();
        LoginAndRegister login = new LoginAndRegister(conn);
        login.setVisible(true);
    }
}
