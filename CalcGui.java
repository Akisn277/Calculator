import javax.swing.JOptionPane;
public class CalcGui {
public static void main(String[] args) {
    String oper=JOptionPane.showInputDialog("Operation?");
    int num1=Integer.parseInt(JOptionPane.showInputDialog("Num1= "));
    int num2=Integer.parseInt(JOptionPane.showInputDialog("Num2= "));
    if(oper.equals("+")){
        JOptionPane.showMessageDialog(null, "Ans is " +(num1+num2));
    }
    else if(oper.equals("-")){
        JOptionPane.showMessageDialog(null,"Ans is "+(num1-num2));
    }
    else if(oper.equals("*")){
        JOptionPane.showMessageDialog(null,"Ans is "+(num1*num2));
    }
    else{
        JOptionPane.showMessageDialog(null,"Ans is "+(num1/num2));
    }
}
}
