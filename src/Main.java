import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {






        JFrame frame = new JFrame();
        frame.setTitle("STANDARD CALCULATOR");
//        frame.setSize(450,550);
//        frame.setLocation(700,200);
        frame.setBounds(700,200,450,550);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);

        ImageIcon image = new ImageIcon("D:\\ALL DATA OF CODING\\JAVA\\Standard Calculator\\src\\calcuation.png");
        frame.setIconImage(image.getImage());
        JTextField  textField = new JTextField();
        textField.setBounds(50,60,100,50);
        textField.setText("ENTER FRIST NUMBER");

 JTextField  textField1 = new JTextField();
        textField1.setBounds(160,60,100,50);
        textField1.setText("ENTER SECOND NUMBER");









        JButton button = new JButton();
        JButton button1 = new JButton();
        button.setText(" + ");
        button.setBounds(160,160,100,25);
        button1.setText(" - ");
        button1.setBounds(120,120,100,25);

        button.setFocusable(false);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1=Double.parseDouble(textField.getText());
                double num2=Double.parseDouble(textField1.getText());
                double res = num1+num2;
                JOptionPane.showMessageDialog(null,"result = "+(res));
            }
        });
        button1.setFocusable(false);

        frame.add(button);
        frame.add(button1);
        frame.add(textField);
        frame.add(textField1);
        frame.setVisible(true);





    }



}
