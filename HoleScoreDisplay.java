package GolfAssignment;

import javax.lang.model.util.ElementScanner6;

public class HoleScoreDisplay implements Observer{

private Subject golfer;
private int strokes;
private int par;

    public HoleScoreDisplay(Subject _golfer)
{
   // super();
    golfer = _golfer;
    golfer.registerObserver(this);
   
}

    @Override
    public void update(int _strokes, int _par) {
        strokes = _strokes;
        par = _par;
        displayCurrentScore();

    }




private void displayCurrentScore()
{
    System.out.println("Current Hole Stats:");
    System.out.println("Par: "+ par);
    System.out.println("Strokes: "+ strokes);
    if(strokes > par)
    System.out.println(strokes - par + " over par");
    else if(par > strokes)
    System.out.println(par - strokes + " under par");
    else
    System.out.println("Made par");
    System.out.println();
    
}




    
}
