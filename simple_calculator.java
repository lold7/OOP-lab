import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class simple_calculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,3));

        JTextField num1 = new JTextField();
        JTextField num2 = new JTextField();
        JButton sub = new JButton("-");
        JButton add = new JButton("+");

        JLabel show = new JLabel();
        
        panel.add(num1);
        panel.add(num2);
        panel.add(add);
        panel.add(sub);
        panel.add(new JLabel(""));
        panel.add(show);

        add.addActionListener(new ActionListener() {
            @Override 
            public void actionPerformed(ActionEvent x){
                int num_1 = Integer.parseInt(num1.getText());
                int num_2 = Integer.parseInt(num2.getText());
                int result = num_1 + num_2 ;
                show.setText(""+result);
            }
        });
        sub.addActionListener(new ActionListener() {
            @Override 
            public void actionPerformed(ActionEvent x){
                int num_1 = Integer.parseInt(num1.getText());
                int num_2 = Integer.parseInt(num2.getText());
                int result = num_1 - num_2 ;
                show.setText(""+result);
            }
        });

        frame.add(panel);
        frame.setVisible(true);



    }
}
