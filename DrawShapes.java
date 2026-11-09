
import javax.swing.*;
import java.awt.*;

public class DrawShapes extends JPanel {

    Font font = new Font("Arial", Font.ITALIC, 18);

    public DrawShapes() {
        setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics graph) {
        super.paintComponent(graph);

        graph.setFont(font);
        graph.setColor(Color.BLACK);
        graph.drawString("Draw Shapes", 90, 30);

        graph.setColor(Color.GRAY);
        graph.drawRect(120, 120, 120, 120);
        graph.fillRect(115, 115, 90, 90);

        graph.setColor(Color.BLACK);
        graph.fillArc(110, 110, 50, 50, 0, 360);

        graph.setColor(Color.GRAY);
        graph.drawRect(50, 50, 50, 50);

        graph.setColor(Color.WHITE);
        graph.fillRect(50, 50, 60, 60);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Draw Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 320);
        frame.add(new DrawShapes());
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
