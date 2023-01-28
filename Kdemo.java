import java.awt.*;
import java.awt.event.*;
public class Kdemo extends Frame implements KeyListener
{
public Kdemo()
{
addKeyListener(this);
setVisible(true);
setTitle("Buttons in action");
setSize(350,350);
}

public void keyPressed(KeyEvent e)
{}
public void keyReleased(KeyEvent e)
{}
public void keyTyped(KeyEvent e)
{
char ch = e.getKeyChar();
if(ch =='r')
{
setBackground(Color.red);
}
if(ch =='g')
{
setBackground(Color.green);
}
if(ch == 'x')
{
System.exit(0);
}
}
public static void main(String []args) 
{
new Kdemo();
}
}
