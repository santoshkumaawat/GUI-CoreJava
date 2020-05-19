package GUIDesigning;


import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class GUITwo {

    public static void main(String[] args) {
        //create container
        Frame f = new Frame();
        f.setSize(300, 200);
        f.setVisible(true);

        //create components
        Label name = new Label("Name");
        TextField tf = new TextField(10);
        Button btn = new Button("Submit");

        //add component on container
        f.setLayout(null);

        //name.setSize(50,20);
        //name.setLocation(50, 50);
        name.setBounds(50, 50, 50, 20); //x, y , w ,h 
        f.add(name);

        //tf.setSize(100,25);
        //tf.setLocation(150, 50);
        tf.setBounds(150, 50, 100, 25); //x, y , w ,h 
        f.add(tf);

        //btn.setSize(70,25);
        //btn.setLocation(90, 100);
        btn.setBounds(90, 100, 70, 25); //x, y , w ,h 
        f.add(btn);
    }
}
