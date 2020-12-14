package com;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.text.ParseException;


public class gui implements ActionListener {
    private static JLabel label1Error;
    private static JLabel label2Error;
    private static JTextField text1;
    private static JTextField text2;
    private static JLabel resultLabel2;

    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(230, 220);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Divider");

        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);

        JLabel label1 = new JLabel("First number:");
        label1.setBounds(10,20,80,25);
        panel.add(label1);

        Font labelFont = label1.getFont();

        label1Error = new JLabel("");
        label1Error.setBounds(10,40,200,25);
        label1Error.setForeground(Color.red);
        label1Error.setFont(new Font(labelFont.getName(), Font.PLAIN, 10));
        panel.add(label1Error);

        text1 = new JTextField(10);
        text1.setBounds(110,20,50,25);
        panel.add(text1);

        JLabel label2 = new JLabel("Second number:");
        label2.setBounds(10,70,100,25);
        panel.add(label2);

        label2Error = new JLabel("");
        label2Error.setBounds(10,90,200,25);
        label2Error.setForeground(Color.red);
        label2Error.setFont(new Font(labelFont.getName(), Font.PLAIN, 10));
        panel.add(label2Error);

        text2 = new JTextField(10);
        text2.setBounds(110,70,50,25);
        panel.add(text2);

        JLabel resultLabel1 = new JLabel("Result:");
        resultLabel1.setBounds(10,110,80,25);
        panel.add(resultLabel1);

        resultLabel2 = new JLabel("");
        resultLabel2.setBounds(110,110,50,25);
        panel.add(resultLabel2);

        Button button = new Button("Divide");
        button.setBounds(110,140,80,25);
        button.addActionListener(new gui());
        panel.add(button);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        label1Error.setText("");
        label2Error.setText("");
        resultLabel2.setText("");
        NumberFormat nf = NumberFormat.getInstance();
        String t1 = text1.getText();
        String t2 = text2.getText();
        Number nr1, nr2;
        if (t1.equals("")){
            label1Error.setText("Enter number");
            return;
        }
        if (t2.equals("")){
            label2Error.setText("Enter number");
            return;
        }
        try {
            nr1 = nf.parse(t1);
        } catch (ParseException ex) {
            label1Error.setText(ex.getMessage());
            return;
        }
        try {
            nr2 = nf.parse(t2);
        } catch (ParseException ex) {
            label2Error.setText(ex.getMessage());
            return;
        }
        if (nr2.doubleValue() == 0 ){
            label2Error.setText("Can't divide by zero");
            return;
        }
        if (nr2.doubleValue() == 13){
            try {
                throw new UnluckyException("The divisor is 13!");
            } catch (UnluckyException unluckyException) {
                unluckyException.printStackTrace();
            }
        }
        double result = nr1.doubleValue() / nr2.doubleValue();
        resultLabel2.setText(String.valueOf(result));
    }
}
