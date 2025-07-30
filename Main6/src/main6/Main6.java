package main6;

import javax.swing.SwingUtilities;

public class Main6 {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PedraPapelTesouraGUI gui = new PedraPapelTesouraGUI();
            gui.setVisible(true);
        });
    }
}
