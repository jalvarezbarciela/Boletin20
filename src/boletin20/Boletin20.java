/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin20;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author ceque
 */
public class Boletin20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Libreria>lista=new ArrayList();
        ArrayListMetodos obx=new ArrayListMetodos();
        int opcion;        
         do{
            opcion= Integer.parseInt(JOptionPane.showInputDialog("     Menu      "
                                                             + "\n1.Crear Librp"
                                                             + "\n2.Amosar"                            
                                                             + "\n3.Amosar libro Buscado Por  ISBN"
                                                             + "\n4.Dar de baixa"
                                                             + "\n5.Sair"));
            switch(opcion){                
                case 1:lista.add(obx.crearLibro());break;
                case 2:obx.amosar(lista);break;
                case 3:obx.buscarElementoISBN(lista);break;
                case 4:obx.darBaixa(lista);break;
                case 5:;break;
                
            }
        }while(opcion!=6);
    }
    
}
