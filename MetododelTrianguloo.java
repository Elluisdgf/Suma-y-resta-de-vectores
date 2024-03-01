import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MetododelTrianguloo extends JFrame {

    private JTextField vector1Field, vector2Field;
    private JComboBox<String> directionComboBox, unitsComboBox;

    public MetododelTrianguloo() {
        setTitle("Vector Suma");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(4, 2));

        JLabel vector1Label = new JLabel("Vector 1 (magnitude):");
        vector1Field = new JTextField();
        JLabel vector2Label = new JLabel("Vector 2 (magnitude):");
        vector2Field = new JTextField();

        JLabel directionLabel = new JLabel("Direction:");
        String[] directions = {"Norte", "Sur", "Este", "Oeste"};
        directionComboBox = new JComboBox<>(directions);

        JLabel unitsLabel = new JLabel("Medida:");
        String[] units = {"Centimetros", "Metros", "Millas", "Yardas", "Milímetros"};
        unitsComboBox = new JComboBox<>(units);

        JButton calculateButton = new JButton("Calcular");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateAndPlotVectors();
            }
        });

        inputPanel.add(vector1Label);
        inputPanel.add(vector1Field);
        inputPanel.add(vector2Label);
        inputPanel.add(vector2Field);
        inputPanel.add(directionLabel);
        inputPanel.add(directionComboBox);
        inputPanel.add(unitsLabel);
        inputPanel.add(unitsComboBox);

        add(inputPanel, BorderLayout.NORTH);
        add(calculateButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void calculateAndPlotVectors() {

        JPanel drawingPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.drawLine(50, 50, 150, 150);
            }
        };

        add(drawingPanel, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MetododelTrianguloo();
            }
        });
    }
}
