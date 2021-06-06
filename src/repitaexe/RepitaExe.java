/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repitaexe;
 import javax.swing.JOptionPane;
/**
 *
 * @author Michael Coitim 
 */
public class RepitaExe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "ola mundo"," Boas Vindas", JOptionPane.INFORMATION_MESSAGE);
        int n , s = 0 , c = 0,  im=0, par=0, ac =0;
        float m =0;
        do {
            
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
            
                  "<html>Infome um numero <br> <em>(Digite 0 para interromper)</em></html>" ));
            if(n>100){
                ac++;
            }
            if(n%2 ==0){
                par++;
            }else{
                im++;
            }
            c++;
            s+=n;
           
        } while(n != 0);
          c= c-1; 
          m = s / c;
        JOptionPane.showMessageDialog(null, 
                "<html> Resultado Final <br><hr>"+
                        "Foram digitados  "+ c +" Numeros<br>"+
                         " A soma é = " + s +"<br/>"+ 
                         "A media é = " +m + "<br/>"+
                         "Foram  "+im +" impares<br/>"+
                         "Foram  "  + par +" pares <br/>"+
                         "A cima de 100 foram "+ ac+         
                                   
                        "</html>");
    }
    
}
