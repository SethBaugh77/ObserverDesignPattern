package GolfAssignment;

import java.util.ArrayList;

/**
 * Class that holds the methods and attributes for a golfer.
 * @author Seth Baugh
 */
public class Golfer implements Subject {
   
  private ArrayList<Observer> list=new ArrayList<Observer>();
   private String name;

   /**
    * Creates a golfer with the intended name.
    * @param _name Parameter used to name the golfer.
    */
   public Golfer(String _name)
    {
        name = _name;
    }

    /**
     * Method that takes in an observer and registers that observer into the arrayList of observers.
     * @param observer Parameter that goes into the arrayList for that golfer.
     */
    public void registerObserver(Observer observer)
    {
        list.add(observer);
    }

    /**
     * Method that removes an observer from the golfer arrayList of observers.
     * @param observer Intended observer to be removed from arrayList.
     */
    public void removeObserver(Observer observer)
    {
        list.remove(observer);
    }

    /**
     * Method that takes in strokes the golfer took and the par of the hole and updates the observers.
     * @param strokes The number of strokes that it took the golfer on specified hole.
     * @param par The par for the specified hole.
     */
    public void notifyObservers(int strokes, int par)
    {
        for(int i = 0 ; i < list.size(); i++)
        {
            list.get(i).update(strokes, par);
        }
    }

    /**
     * Method that takes in the strokes and par for each hole then sends them to notifyObservers method.
     * @param strokes Number of strokes for specified hole.
     * @param par Par for the specified hole.
     */
    public void enterScore(int strokes, int par)
    {
        notifyObservers(strokes, par);
    
    }

    /**
     * Getter that returns name of golfer.
     * @return Returns name of golfer. 
     */
    public String getName()
    {
        return name;
    }
  
}
