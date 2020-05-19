package GUIDesigning;


import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class GUIThree {

    public static void main(String[] args) {
        //create container
        Frame f = new Frame();
        f.setSize(400, 400);
        f.setVisible(true);

        //create components
        Label name = new Label("Name");
        Label age = new Label("Age");
        TextField t1 = new TextField(10);
        TextField t2 = new TextField(10);
        Button btn1 = new Button("Submit");
        Button btn2 = new Button("Cancel");
        Button btn3 = new Button("Exit");

        //add component on container
        Panel p1 = new Panel();
        Panel p2 = new Panel();
        p1.setLayout(new GridLayout(2, 2));
        p2.setLayout(new FlowLayout());

        p1.add(name);
        p1.add(t1);
        p1.add(age);
        p1.add(t2);

        p2.add(btn1);
        p2.add(btn2);
        p2.add(btn3);

        f.add("North", p1);
        f.add("South", p2);
    }
}
