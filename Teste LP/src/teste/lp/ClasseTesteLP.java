/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste.lp;

import javax.swing.JOptionPane;

/**
 *
 * @author bianc
 */
public class ClasseTesteLP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //JOptionPane.showMessageDialog(null,"Testando interface gráficas","Título", 3);
          String n1=JOptionPane.showInputDialog("Digite um Número:");
          String n2=JOptionPane.showInputDialog("Digite outro Número:");
      int num1=Integer.parseInt(n1);
      int num2=Integer.parseInt(n2);
      StringBuilder sb=new StringBuilder();
      sb.append("Soma dos dois Numeros:");
      sb.append(num1+num2);
      JOptionPane.showMessageDialog(null, sb.toString());
  
      int soma = num1+num2;
      
        if (soma == 42) {
            JOptionPane.showMessageDialog(null, "A RESPOSTA PRA TUDO É:" + soma,"", 1);
            
        }
      
        }
            
        }
 
 
 
      
      
      
    
    

