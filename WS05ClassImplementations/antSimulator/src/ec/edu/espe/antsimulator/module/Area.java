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
public class Area {

    private int height;
    private int width;
    private int tickDuration;
    private int initNumberOfFoodPiles;
    private String name;
    private boolean busy;

    
    public Area() {
        width = 20;
        height = 20;
        initNumberOfFoodPiles = 1;
        tickDuration = 1000;
        name = "area01";
        busy = true;
    }
    
    
    
    public Area(int height, int width, int tickDuration, int initNumberOfFoodPiles, String name, boolean busy) {
        this.height = height;
        this.width = width;
        this.tickDuration = tickDuration;
        this.initNumberOfFoodPiles = initNumberOfFoodPiles;
        this.name = name;
        this.busy = busy;
    }

    
    
    @Override
    public String toString() {
        return "Area{" + "height=" + height + ", width=" + width + ", tickDuration=" + tickDuration + ", initNumberOfFoodPiles=" + initNumberOfFoodPiles + ", name=" + name + ", busy=" + busy + '}';
    }

    public String getName() {
        return name;
    }

    public boolean isBusy() {
        return busy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBusy(boolean busy) {
        this.busy = busy;
    }

    public void setup() {

    }

    public void add(Colony colony) {

    }

    public void add(AntEater antEatr) {

    }

    public boolean isAnyFoodRemaining() {

        return true;
    }

    public Cell getCell(int row, int col) {
        Cell cell = new Cell();

        return cell;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @return the tickDuration
     */
    public int getTickDuration() {
        return tickDuration;
    }

    /**
     * @param tickDuration the tickDuration to set
     */
    public void setTickDuration(int tickDuration) {
        this.tickDuration = tickDuration;
    }

    /**
     * @return the initNumberOfFoodPiles
     */
    public int getInitNumberOfFoodPiles() {
        return initNumberOfFoodPiles;
    }

    /**
     * @param initNumberOfFoodPiles the initNumberOfFoodPiles to set
     */
    public void setInitNumberOfFoodPiles(int initNumberOfFoodPiles) {
        this.initNumberOfFoodPiles = initNumberOfFoodPiles;
    }

}
