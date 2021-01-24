package GolfAssignment;

import java.util.ArrayList;

public class Golfer implements Subject {
   
  private ArrayList<Observer> list=new ArrayList<Observer>();
   private String name;

   public Golfer(String _name)
    {
        name = _name;

    }

    public void registerObserver(Observer observer)
    {
        list.add(observer);
    }

    public void removeObserver(Observer observer)
    {
        list.remove(observer);
    }

    public void notifyObservers(int strokes, int par)
    {
        for(int i = 0 ; i < list.size(); i++)
        {
            list.get(i).update(strokes, par);
        }
    }

    public void enterScore(int strokes, int par)
    {
        notifyObservers(strokes, par);
    
    }

    public String getName()
    {
        return name;
    }



    
}
