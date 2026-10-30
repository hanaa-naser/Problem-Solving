package edu.zuj.vp.week2.lecture2;

import javax.swing.JOptionPane;

public class JOptio {

    public static void main(String[] args) {
        String sn1 = JOptionPane.showInputDialog("enter num 1");
        int n1 = Integer.parseInt(sn1);

        String sn2 = JOptionPane.showInputDialog("enter num2");
        int n2 = Integer.parseInt(sn2);

        StringBuffer Agg = new StringBuffer();
        Agg.append("====================================");
        Agg.append("1-add \n");//بنحطه بدال هاي ->sout("1-add \n) بنستخدمها لانها  اقل في السبيس 
        Agg.append("2-sup \n");
        Agg.append("3-mul \n");
        Agg.append("4-div \n");
        Agg.append("5-quit \n");
        Agg.append("====================================");
        Agg.append("Enter your choos : ");
        String choos = JOptionPane.showInputDialog(Agg.toString());
        int nch = Integer.parseInt(choos);
        int rus =0 ;
        switch (nch) {
            case 1:
                rus = n1 + n2;
                
                break;
            case 2:
                rus = n1 - n2;
                break;
            case 3:
                rus = n1 * n2;
                break;
            case 4:
                if (n2 != 0) {
                    rus = n1 / n2;
                } else {
                    JOptionPane.showMessageDialog(null, " no div in zero");
                }

                break;
            case 5:
                JOptionPane.showInternalMessageDialog(null, "goodBay");
                break;
            default:
                JOptionPane.showMessageDialog(null, "not valed");
        }
        if (nch > 0 && nch <= 4) {
            JOptionPane.showMessageDialog(null, "the rus = " + rus);
        }

    }

}
