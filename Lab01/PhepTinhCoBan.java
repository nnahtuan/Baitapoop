import javax.swing.JOptionPane;
public class PhepTinhCoBan {
    public static void main(String[] args) {
        double num1, num2;
        String strnum1, strnum2;
        String strSum, strDiff, strProd, strDiv;
        strnum1 = JOptionPane.showInputDialog(null, "Please input the first number:", 
        "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strnum2 = JOptionPane.showInputDialog(null, "Please input the second number:", 
        "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        num1 = Double.parseDouble(strnum1);
        num2 = Double.parseDouble(strnum2);
        strSum = strnum1 + " + " + strnum2 + " = " + (num1 + num2) + "\n";
        strDiff = strnum1 + " - " + strnum2 + " = " + (num1 - num2) + "\n";
        strProd = strnum1 + " * " + strnum2 + " = " + (num1 * num2) + "\n";
        if (num2 != 0) {
            strDiv = strnum1 + " / " + strnum2 + " = " + (num1 / num2) + "\n";
        }
        else
        {
            strDiv = "Khong ton tai phep chia cho 0";
        }
        JOptionPane.showMessageDialog(null, strSum + strDiff + strProd + strDiv, "Display", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}