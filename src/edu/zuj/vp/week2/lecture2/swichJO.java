
package edu.zuj.vp.week2.lecture2;

import javax.swing.JOptionPane;

public class swichJO {
    public static void main(String[] args) {
        //عشان يدخل القيم ب صيغة GUI و دايما بوخذها ك string
      String n1=  JOptionPane.showInputDialog("input n1");
//      هون عشان بدنا نول من string to int for input int numpur
      int nn1=Integer.parseInt(n1);
      String n2=  JOptionPane.showInputDialog("input n2");
      int nn2=Integer.parseInt(n2);
      
//      هاي بدل ما نخليه يطبع soutكثير و بوخذ مساحه كبيرة بلموموري بنكتب هاي و بتكون نصي string dيعني بس بتعرض 
      StringBuffer app= new StringBuffer();
      app.append("==========================");
      app.append("1-add \n");
      app.append("2-sup \n");
      app.append("3-mult \n");
      app.append("4-div \n ");
      app.append("5-guit \n");
      app.append("==========================");
//      هون لانو محوة نص لازم نخليه ك نص  toString و عشان يدخل قيمة من اليستا 
      String napp = JOptionPane.showInputDialog(app.toString());
//      هون لانو بدو يدحل رقم ف حولناه ل int
      int nnapp=Integer.parseInt(napp);
        switch (nnapp) {
            case 1:
//                هون عشان يعرض و يحسب حسب النص لحالو و بسرعه 
                JOptionPane.showMessageDialog(null,"the add ="+(nn1+nn2));
                break;
                case 2:
                    JOptionPane.showMessageDialog(null,"the sup = "+(nn1-nn2));
                    break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "the mult = "+(nn1*nn2));
                        break;
                        case 4:
                            if(nn2!=0)
                            JOptionPane.showMessageDialog(null,"the div ="+(nn1/nn2));
                            else 
                            JOptionPane.showMessageDialog(null, "risk");
                            
                            break;
                        case 5:
                                JOptionPane.showMessageDialog(null,"good bay");
            default:
                JOptionPane.showMessageDialog(null,"not avaylapal ");
        }
      
    }
}
