/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula;

import javax.swing.JOptionPane;

/**
 *
 * @author bianc
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null,"Testando interface gráficas","Título", 3);
          
   String n1 = JOptionPane.showInputDialog("Digite um número inteiro:");

        int numero = Integer.parseInt(n1);

        if (numero % 2 == 0) {
            System.out.println("Numero digitado e par.");
        } else {
            System.out.println("Numero digitado e impar.");
        }
    }
}     
          
     
   
   

 
    