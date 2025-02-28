import javax.swing.JOptionPane;

public class second_degree_equation {
    public static void main(String[] args) {
        double a, b, c;
        String strnum1, strnum2, strnum3, strNotification;
        strnum1 = JOptionPane.showInputDialog(null, "Please input a:",
                "Input a", JOptionPane.INFORMATION_MESSAGE);
        strnum2 = JOptionPane.showInputDialog(null, "Please input b:",
                "Input b", JOptionPane.INFORMATION_MESSAGE);
        strnum3 = JOptionPane.showInputDialog(null, "Please input c:",
                "Input c", JOptionPane.INFORMATION_MESSAGE);
        a = Double.parseDouble(strnum1);
        b = Double.parseDouble(strnum2);
        c = Double.parseDouble(strnum3);
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    strNotification = "Phuong trinh vo so nghiem.";
                } else {
                    strNotification = "Phuong trinh vo nghiem.";
                }
            } else {
                strNotification = "Phuong trinh co mot nghiem: " + "x = " + (-c / b);
            }
            JOptionPane.showMessageDialog(null,  strNotification,
                    "Display", JOptionPane.INFORMATION_MESSAGE);
        } else {
            Double delta = b * b - 4 * a * c;
            Double x1, x2;
            if (delta > 0) {
                x1 = ((-b + Math.sqrt(delta)) / (2 * a));
                x2 = ((-b - Math.sqrt(delta)) / (2 * a));
                strNotification = "Phuong trinh co 2 nghiem: " + "x1 = " + x1 + " và x2 = " + x2;
            } else if (delta == 0) {
                x1 = (-b / (2 * a));
                strNotification = "Phuong trinh co nghiem kep: " + "x1 = x2 = " + x1;
            } else {
                strNotification = "Phuong trinh vo nghiem!";
            }
            JOptionPane.showMessageDialog(null, strNotification,
                    "Display", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
