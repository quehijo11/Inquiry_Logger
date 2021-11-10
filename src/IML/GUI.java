package IML;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.*;



public class GUI extends JFrame implements ActionListener {
    private JPanel mainPanel;

    public void run() {
        JFrame frame = new JFrame("Title"); //Name of program
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);


        //buttons
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        //button placement
        frame.getContentPane().add(BorderLayout.SOUTH, button1);
        frame.getContentPane().add(BorderLayout.NORTH, button2);

        //basically makes the buttons on-click
        button1.addActionListener(this);
        button2.addActionListener(this);

        /*
        //drop down
        String[] Insturments = { "Piano",  }; //all the insturments
        int num = 5 //number of instuements
        JComboBox inList = new JComboBox(Insturments);
        inList.setSelectedIndex(4);
        inList.addActionListener(this);
        JComboBox cb = (JComboBox)e.getSource();
        String petName = (String)cb.getSelectedItem();
        updateLabel(petName);
    }
/*/



        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("Button 1")) {
            myMethod();
        }
        else if (command.equals("Button 2")) {
            myMethod();//other method
        }
        else if (command.equals("NewInquire")){
            InquiryGUI Steve = new InquiryGUI();
                    Steve.run();//call other GUI??? or next window
        }


    }

    public void myMethod() {
        System.out.println("rered");
        JOptionPane.showMessageDialog(this, "Hello, World!!!!!");
    }


}


