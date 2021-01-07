/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.filemanager.utils;

/**
 *
 * @author Cristian Maranje ESPE-DCCO
 */
public class FileManager {
    
    //read, edit, delete, find, save.
    //CRUD opretions: Create, Read, Update, Delete information (data) from a DB
    
    public static void save(String fileName, String data){
        
        System.out.println("saving -->"+data+"<-- in file -->"+ fileName);
        
    }
    
    public static String find(String fileName, String dataToFind){
        
        String results;
        
        results="Cristian Maranje";
        
        System.out.println("returning-->"+results);
        
        return results;
    }
    
    public static String findAll(String fileName){
        
      String results;
      
      results = "Cristian Maranje";
      
       System.out.println("returning-->"+results);

      return results;
    }
    
    public static boolean update(String fileName, String dataToFind, String dataToUpdate){
        
        boolean updated;
        
        updated= true;
        
         System.out.println("updating-->"+ dataToFind +"in-->"+ fileName);
        
        return updated;
        
    }
    
    public static boolean delete(String fileName, String dataToDelete){
        
        boolean deleted;
        
        deleted= true;
        
        System.out.println("deleting-->"+ dataToDelete +"from-->"+ fileName);
        
        return deleted;
    }
    
}
