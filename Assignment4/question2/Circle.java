package question2;

import javax.swing.JOptionPane;

class Circle {
    private double radius = 1.0;
    private String color = "red";
    
    public void getValue(){
        JOptionPane.showMessageDialog(null, "Radius = "+radius+"\nColor = "+color);
    }
    public void setValue(double d, String s){
        radius=d;
        color =s;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public String getColor() {
        return color;
    }
    
    public double getArea() {
        return Math.PI*radius*radius;
    }
    
}