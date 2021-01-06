/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.multiplicationtables.view;

/**
 *
 * @author Cristian Maranje ESPE-DCCO
 */
public class MultiplicationTable {

    public static void main(String[] args) {

        System.out.println("This is the Multiplication tables from 1 to 10");
        System.out.println("<=============================================>");

        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.println(i + "x " + j + " =" + (i * j));
            }
            System.out.println("<==========>");
        }
    }

}
