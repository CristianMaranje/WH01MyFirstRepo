/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.antsimulator.module;

/**
 *
 * @author Cristian Maranje ESPE-DCCO
 */
public class AntEater {
    private Cell position;
    private int antEaterCounter;
    private int runCounter;
    enum state{};
            
    public void run(){
        
    }

    /**
     * @return the position
     */
    public Cell getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(Cell position) {
        this.position = position;
    }

    /**
     * @return the antEaterCounter
     */
    public int getAntEaterCounter() {
        return antEaterCounter;
    }

    /**
     * @param antEaterCounter the antEaterCounter to set
     */
    public void setAntEaterCounter(int antEaterCounter) {
        this.antEaterCounter = antEaterCounter;
    }

    /**
     * @return the runCounter
     */
    public int getRunCounter() {
        return runCounter;
    }

    /**
     * @param runCounter the runCounter to set
     */
    public void setRunCounter(int runCounter) {
        this.runCounter = runCounter;
    }
    
    
}
