import javax.swing.JOptionPane;

public class linear_system {
    public static void main(String[] args) {
        double a11, a12, b1, a21, a22, b2, D, Dx, Dy;
        String strnum1, strnum2, strnum3, strnum4, strnum5, strnum6, strNotification;
        strnum1 = JOptionPane.showInputDialog(null, "Please input a11:",
                "Input a11", JOptionPane.INFORMATION_MESSAGE);
        strnum2 = JOptionPane.showInputDialog(null, "Please input a12:",
                "Input a12", JOptionPane.INFORMATION_MESSAGE);
        strnum3 = JOptionPane.showInputDialog(null, "Please input b1:",
                "Input b1", JOptionPane.INFORMATION_MESSAGE);
        strnum4 = JOptionPane.showInputDialog(null, "Please input a21:",
                "Input a21", JOptionPane.INFORMATION_MESSAGE);
        strnum5 = JOptionPane.showInputDialog(null, "Please input a22:",
                "Input a22", JOptionPane.INFORMATION_MESSAGE);
        strnum6 = JOptionPane.showInputDialog(null, "Please input b2:",
                "Input b2", JOptionPane.INFORMATION_MESSAGE);
        a11 = Double.parseDouble(strnum1);
        a12 = Double.parseDouble(strnum2);
        b1 = Double.parseDouble(strnum3);
        a21 = Double.parseDouble(strnum4);
        a22 = Double.parseDouble(strnum5);
        b2 = Double.parseDouble(strnum6);
        D = a11 * a22 - a21 * a12;
        Dx = b1 * a22 - b2 * a12;
        Dy = a11 * b2 - a21 * b1;
        if (D == 0) {
            if (Dx + Dy == 0)
                strNotification = "Hệ phương trình có vô số nghiệm";
            else
                strNotification = "Hệ phương trình vô nghiệm";
        } else {
            Double x = Dx / D;
            Double y = Dy / D;
            strNotification = "Hệ phương trình có nghiệm (x, y) = (" + x + "; " + y + ").";
        }
        JOptionPane.showMessageDialog(null,  strNotification,
               "Display", JOptionPane.INFORMATION_MESSAGE);
    }
}