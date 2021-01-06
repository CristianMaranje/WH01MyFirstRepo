/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antsimulator;

import ec.edu.espe.antsimulator.module.Area;
import ec.edu.espe.filemanager.utils.FileManager;


/**
 *
 * @author Cristian Maranje ESPE-DCCO
 */
public class AntSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Area area= new Area();
        Area area2;
        Area area1;
        
        System.out.println("area object -->" + area );
        
        area1 =new Area(80, 100, 5, 5000, "area51", false);
        area1.setBusy(true);
        System.out.println("area1 object--->" + area1);
        area1.setBusy(true);
        System.out.println("area1 object--->" + area1);
        
        area2 = new Area();
        
        area2.setName("area71");
        System.out.println("area2 object--->" + area2);
        area2.setHeight(50);
        System.out.println("area2 object--->" + area2);
        
        int height = 20;
        
        area.setHeight(10);
        area.setInitNumberOfFoodPiles(2);
        area.setTickDuration(1000);
        area.setWidth(20);
        
        FileManager.save("students.CSV", "Cristian Maranje");
        FileManager.find("students.CSV", "Cristian Maranje");
        FileManager.findAll("students.CSV");
        
    }
    
}
