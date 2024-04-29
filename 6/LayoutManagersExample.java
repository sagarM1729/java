import javax.swing.*;
import java.awt.*;

public class LayoutManagersExample extends JFrame {
    public LayoutManagersExample() {
        setTitle("Layout Managers Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        // Create a panel for each layout manager
        JPanel flowLayoutPanel = new JPanel(new FlowLayout());
        JPanel borderLayoutPanel = new JPanel(new BorderLayout());
        JPanel gridLayoutPanel = new JPanel(new GridLayout(2, 2));
        JPanel boxLayoutPanel = new JPanel();
        boxLayoutPanel.setLayout(new BoxLayout(boxLayoutPanel, BoxLayout.Y_AXIS));

        // Add components to each panel
        flowLayoutPanel.add(new JButton("Flow 1"));
        flowLayoutPanel.add(new JButton("Flow 2"));
        flowLayoutPanel.add(new JButton("Flow 3"));

        borderLayoutPanel.add(new JButton("North"), BorderLayout.NORTH);
        borderLayoutPanel.add(new JButton("South"), BorderLayout.SOUTH);
        borderLayoutPanel.add(new JButton("East"), BorderLayout.EAST);
        borderLayoutPanel.add(new JButton("West"), BorderLayout.WEST);
        borderLayoutPanel.add(new JButton("Center"), BorderLayout.CENTER);

        gridLayoutPanel.add(new JButton("Grid 1"));
        gridLayoutPanel.add(new JButton("Grid 2"));
        gridLayoutPanel.add(new JButton("Grid 3"));
        gridLayoutPanel.add(new JButton("Grid 4"));

        boxLayoutPanel.add(new JButton("Box 1"));
        boxLayoutPanel.add(new JButton("Box 2"));
        boxLayoutPanel.add(new JButton("Box 3"));

        // Create a tabbed pane to display the panels
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Flow Layout", flowLayoutPanel);
        tabbedPane.addTab("Border Layout", borderLayoutPanel);
        tabbedPane.addTab("Grid Layout", gridLayoutPanel);
        tabbedPane.addTab("Box Layout", boxLayoutPanel);

        // Add the tabbed pane to the frame
        add(tabbedPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LayoutManagersExample example = new LayoutManagersExample();
            example.setVisible(true);
        });
    }
}


