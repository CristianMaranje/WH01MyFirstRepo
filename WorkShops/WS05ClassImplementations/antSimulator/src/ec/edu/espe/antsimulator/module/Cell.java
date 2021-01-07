/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.antsimulator.module;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cristian Maranje ESPE-DCCO
 */
public class Cell {
    private int cell;
    private int col;

    Cell() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void recievePheromone(PheromoneDrop pheromoneDrop){
        
    }
    
    public List<Ant> getAnts(){
        List<Ant> ants=new ArrayList<>();
        //TDOO code to read the ants
        return ants;
    }

    /**
     * @return the cell
     */
    public int getCell() {
        return cell;
    }

    /**
     * @param cell the cell to set
     */
    public void setCell(int cell) {
        this.cell = cell;
    }

    /**
     * @return the col
     */
    public int getCol() {
        return col;
    }

    /**
     * @param col the col to set
     */
    public void setCol(int col) {
        this.col = col;
    }

    public Cell(int cell, int col) {
        this.cell = cell;
        this.col = col;
    }

    @Override
    public String toString() {
        return "Cell{" + "cell=" + cell + ", col=" + col + '}';
    }
   
    
}
