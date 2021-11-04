package IML;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;


public class GUI extends Component implements ActionListener {
    private JPanel mainPanel;

    public void run() {
        JFrame frame = new JFrame("Title"); //Name of program
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);


        //buttons
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        frame.getContentPane().add(BorderLayout.SOUTH, button1);
        frame.getContentPane().add(BorderLayout.NORTH, button2);

        //mainPanel.add( button3 );


        button1.addActionListener(this);
        button2.addActionListener(this);


        //drop down
        //String[] Insturments = { "Piano",  }; //all the insturments
        // JComboBox inList = new JComboBox(Insturments);
        // inList.setSelectedIndex(4);
        //inList.addActionListener(this);


        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String command = e.getActionCommand();
        if (command.equals("Button 1")) {
            myMethod();
        }
        else if ("Button 2" == e.getSource()) {
            myMethod();//other method
            System.out.println("stre");
        }
        else if (command.equals("NewInquire")){
            InquiryGUI.run();//call other GUI
        }

    }

    public void myMethod() {
        System.out.println("rered");
        JOptionPane.showMessageDialog(this, "Hello, World!!!!!");
    }


}
