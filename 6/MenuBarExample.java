import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBarExample extends JFrame implements ActionListener {
    private JMenuBar menuBar;
    private JMenu menuA, menuB;
    private JMenuItem upItem, downItem, resetItem;

    public MenuBarExample() {
        setTitle("Menu Bar Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create menu bar
        menuBar = new JMenuBar();

        // Create Menu-A
        menuA = new JMenu("Menu-A");
        upItem = new JMenuItem("Up");
        upItem.addActionListener(this);
        downItem = new JMenuItem("Down");
        downItem.addActionListener(this);
        menuA.add(upItem);
        menuA.add(downItem);

        // Create Menu-B
        menuB = new JMenu("Menu-B");
        resetItem = new JMenuItem("Reset");
        resetItem.addActionListener(this);
        menuB.add(resetItem);

        // Add menus to the menu bar
        menuBar.add(menuA);
        menuBar.add(menuB);

        // Set the menu bar
        setJMenuBar(menuBar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == upItem) {
            System.out.println("Up menu item clicked");
        } else if (e.getSource() == downItem) {
            System.out.println("Down menu item clicked");
        } else if (e.getSource() == resetItem) {
            System.out.println("Reset menu item clicked");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuBarExample().setVisible(true);
            }
        });
    }
}
