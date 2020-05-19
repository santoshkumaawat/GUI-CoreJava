package GUIDesigning;


import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class GUIOne {

    public static void main(String[] args) {
        //create container
        Frame f = new Frame();
        f.setSize(500, 500);
        f.setVisible(true);

        //create components
        Label name = new Label("Name");
        TextField tf = new TextField(10);
        Button btn = new Button("Submit");

        //add component on container
        //f.setLayout(new FlowLayout());
        FlowLayout layout = new FlowLayout();
        //GridLayout layout = new GridLayout(3,1);
        f.setLayout(layout);
        f.add(name);
        f.add(tf);
        f.add(btn);
    }
}
