package EventHandling;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AdapterEx extends Frame {

    TextField t1, t2;

    public AdapterEx() {
        initComponents();
    }

    public void initComponents() {
        setLayout(new FlowLayout());
        t1 = new TextField(10);
        t2 = new TextField(10);
        add(t1);
        add(t2);

        t1.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int code = e.getKeyCode();
                if (code == 112) {
                    t1.setText(t1.getText().toUpperCase());
                } else if (code == 113) {
                    t1.setText(t1.getText().toLowerCase());
                }
            }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String args[]) {
        AdapterEx ob = new AdapterEx();
        ob.setSize(500, 500);
        ob.setVisible(true);
    }

    /*
    class MyKeyHandler extends KeyAdapter {
        public void keyPressed(KeyEvent e){
            int code=e.getKeyCode();
            if(code==112){
                t1.setText(t1.getText().toUpperCase());
            }else if(code==113){
                t1.setText(t1.getText().toLowerCase());
            }
        }
    }
     */
}
