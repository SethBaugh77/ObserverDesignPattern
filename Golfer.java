package GolfAssignment;

import java.util.ArrayList;

public class Golfer implements Subject {
   
   ArrayList<Observer> list=new ArrayList<Observer>();
    String name;

    Golfer(String _name)
    {
        name = _name;

    }

    public void registerObserver(Observer observer)
    {

    }

    public void removeObserver(Observer observer)
    {

    }

    public void notifyObservers(int strokes, int par)
    {
        
    }

    public void enterScore(int strokes, int par)
    {
    
    
    }

    public String getName()
    {
        return "name";
    }



    
}
