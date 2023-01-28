import java.awt.*;
import java.awt.event.*;
public class Bdemo extends Frame implements ActionListener{
    Button b1,b2,b3,b4;
    public Bdemo()
    {
        setLayout(new FlowLayout());
        b1 = new Button("RED");
        b2 = new Button("BLUE");
        b3 = new Button("GREEN");
b4 = new Button("CLOSE");       
add(b1);
        add(b2);
        add(b3);
add(b4);
        setTitle("Buttons in actiion");
        setSize(350,350);
        setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
b4.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
        if(s.equals("RED"))
        {
            setBackground(Color.red);
        }
        else if(s.equals("GREEN"))
        {
            setBackground(Color.green);
        }
        else if(s.equals("BLUE"))
        {
            setBackground(Color.blue);
        }
	else if(s.equals("close"))
{
System.exit(0);
}
    }

    public static void main(String[] args) {
        new Bdemo();
    }
}
public void nn
{}