package com.project.seminario.Events;

import java.awt.Color;
import javax.swing.JPanel;

public class Colors {
    public void setColor(JPanel panel, Color color) {
        panel.setBackground(color);
    }

    public void setStrongColor(JPanel panel) {
        Color strongColor = new Color(3, 75, 93);
        panel.setBackground(strongColor);
    }

    public void setWeakColor(JPanel panel) {
        Color weakColor = new Color(5, 111, 137);
        panel.setBackground(weakColor);
    }
}
