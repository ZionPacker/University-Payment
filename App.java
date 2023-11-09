import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        var gui = new EmployeeGUI();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.pack();
        gui.setResizable(false);
        gui.setVisible(true);
    }
}
