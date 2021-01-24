package GolfAssignment;

import javax.lang.model.util.ElementScanner6;

/**
 * Class that holds and displays strokes and par for each hole.
 * @author Seth Baugh
 */
public class HoleScoreDisplay implements Observer{

private Subject golfer;
private int strokes;
private int par;

/**
 * Creates HoleScoreDisplay instance with parameter _golfer.
 * @param _golfer Golfer that specifies which observer this instance refers to.
 */
public HoleScoreDisplay(Subject _golfer)
{
    golfer = _golfer;
    golfer.registerObserver(this);
}
    
 @Override
 /**
 * Method that takes in strokes and par for each hole and updates the instance variables. Also calls displayCurrentScore method. 
 * @param _strokes Parameter for strokes for each hole.
 * @param _par Parameter for the par of each hole. 
 */
public void update(int _strokes, int _par) 
{
    strokes = _strokes;
    par = _par;
    displayCurrentScore();
}

/**
 * Method that prints out all data related to the hole.
 */
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
