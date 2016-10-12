/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author omphemetse
 */
public class Fruit implements Comparable<Fruit>{
    protected String colour, name;
    protected String mass;
    
    public Fruit(String name, String colour, String mass){
        this.name = name;
        this.colour = colour;
        this.mass = mass;
    }
    
    public String toString(){
        return name +" "+ colour +" "+ mass;
    }

    public int compareTo(Fruit o) {
        int comp;
        comp = name.compareTo(o.name);
        if(comp == 0){
            comp = colour.compareTo(o.colour);
            if(comp == 0)
                comp = mass.compareTo(o.mass);
        }
        return comp;
    }
    
    
    
    
}
