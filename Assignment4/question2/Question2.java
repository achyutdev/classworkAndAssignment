package question2;

import javax.swing.JOptionPane;

public class Question2 {

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        
        circle1.setValue(2.2,"blue");
        circle1.getValue();
        circle1.getRadius();
        double area =circle1.getArea();
        JOptionPane.showMessageDialog(null, "Area is : "+ area );

    }

}