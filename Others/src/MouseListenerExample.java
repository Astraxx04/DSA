import java.awt.*;
import java.awt.event.*;
public class MouseListenerExample extends Frame implements MouseListener, MouseMotionListener{
    Label l;
    MouseListenerExample(){
        addMouseListener(this);
        addMouseMotionListener(this);
        l = new Label();
        l.setBounds(20,50,100,20);
        add(l);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
    }
    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");
    }
    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
    }
    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed");
    }
    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released");
    }
    public void mouseDragged(MouseEvent e) {
        l.setText("X="+e.getX()+", Y="+e.getY());
        Graphics g = getGraphics();
        g.setColor(Color.RED);
        g.fillOval(e.getX(),e.getY(),20,20);
    }
    public void mouseMoved(MouseEvent e) {
        l.setText("X="+e.getX()+", Y="+e.getY()); }
    public static void main(String[] args)
    {
        new MouseListenerExample();
    }
}