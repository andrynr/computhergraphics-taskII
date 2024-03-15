import java.awt.event.*;

public class MyFinishWindow extends WindowAdapter {
    public void windowClosing(WindowEvent event) {
        System.exit(0);
    }
}