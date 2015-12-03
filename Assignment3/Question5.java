//Q#5)
//Input the marks of different courses for 5 students using two dimensional array (Where every student can take maximum 5 
//Courses and minimum 3 Courses at the same time) and find out which of the student has highest average marks in exam. 
//(For example if student is taking 5 courses Average marks= Subj1+Subj2+Subj3+Subj4+Subj5/5)
//

package thirdAssignment;

import javax.swing.JOptionPane;

public class Question5 {
    public static void main(String[] args) {
        int[][] student = new int[5][];
        float[] avgScore = new float[5];
        float sum;
        
        for (int i = 0; i < student.length; i++) {
            student[i] = new int[Integer.parseInt(JOptionPane.showInputDialog("Enter no of course taken by student "+(i+1)+" :"))];
        }
        for (int i = 0;  i< student.length; i++) {
            sum =0;
            for (int j = 0; j < student[i].length; j++) {
                 student[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Enter score of course "+(j+1)+" of student " +(i+1)));
                sum+=student[i][j];
            }
            avgScore[i]=sum/student[i].length;
        }
        for (int i = 0; i < avgScore.length; i++) {
            JOptionPane.showMessageDialog(null, "Average score of Student "+(i+1)+" is :"+avgScore[i]);
        }
    }
}