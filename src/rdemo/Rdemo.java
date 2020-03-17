
package rdemo;

import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

 public class Rdemo extends JFrame{
    private Container c;
    private  ImageIcon icon;
    private JLabel label;
    private JButton button1;
    private JButton button2;
    public void initComponents(){
    c= this.getContentPane();
     c.setLayout(null);
     icon =new ImageIcon(getClass().getResource("index1.jpg"));
     label=new JLabel(icon);
     label.setBounds(0,0,800,500);
     c.add(label);
     button1=new JButton();
     button2=new JButton();
     button1.setLocation(50, 80);
     label.add(button1);
     //c.setVisible(true);
    }
  
    public static void main(String[] args){
     Rdemo frame= new Rdemo();
     frame.setBounds(100, 50, 800, 510);
     frame.setVisible(true);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.initComponents();
    }
}        