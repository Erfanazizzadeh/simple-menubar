import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Filee extends JFrame {
   private  static JMenu fileMenu;
   private  static JMenu edit;
   private  static JMenuBar menuBar;
   private  static JMenuItem openMenuItem;
   private  static JMenuItem exit;
   private  static JFrame frame;

    private  static void  start(){
        frame = new JFrame("Tutorial");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        openMenuItem = new JMenuItem("Open File...");
        fileMenu.add(openMenuItem);

        exit = new JMenuItem("Exit");
        fileMenu.add(exit);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        fileMenu.addSeparator();

        edit = new JMenu("Edit");
        menuBar.add(edit);



        frame.setVisible(true);
    }

    public static void main(String[] args) {
   start();
    }
}
