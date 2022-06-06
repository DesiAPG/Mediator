package Duvan.marin;


import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author web_hap
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        BaseDatosProductos bd=new BaseDatosProductos();
        Scanner lee=new Scanner(System.in);
        bd.base();
        int op=0;
        do{
            System.out.println("1. Actualizar");
            System.out.println("2. Borrar");
            System.out.println("3. agregar");
            System.out.println("4. listar");
            System.out.println("5. salir");
            System.out.println("Haga su seleccion");
            op=lee.nextInt();
            if(op==1){
                bd.actualiza();
            }
            if(op==2){
                bd.borrar();
            }
            if(op==3){
                bd.agregar();
            }
            if(op==4){
                bd.listar();
            }
            if (op==5){
                op=5;
            }
        }while(op!=0);

    }

}