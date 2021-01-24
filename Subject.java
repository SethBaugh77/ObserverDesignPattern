package GolfAssignment;
/**
 * Subject interface that contains three methods.
 * @author Seth Baugh
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers(int strokes, int par);  
}
