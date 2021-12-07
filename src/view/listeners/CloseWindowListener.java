package view.listeners;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CloseWindowListener extends WindowAdapter {

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}
