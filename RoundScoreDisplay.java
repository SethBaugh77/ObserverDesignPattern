package GolfAssignment;

/**
 * Class that holds and displays strokes and par for each round.
 * @author Seth Baugh
 */
public class RoundScoreDisplay implements Observer{

    private Subject golfer;
    private int strokesTotal;
    private int parTotal;

/**
 * Creates RoundScoreDisplay instance with parameter golfer.
 * @param _golfer Golfer that specifies which observer this instance refers to.
 */
    public RoundScoreDisplay(Subject _golfer)
    {
        golfer = _golfer;
        golfer.registerObserver(this);
    }

/**
 * Method that takes in strokes and par for each hole and updates the instance variables. Also calls displayCurrentScore method. 
 * @param _strokes Parameter for strokes for each hole.
 * @param _par Parameter for the par of each hole. 
    */
    public void update(int _strokes, int _par)
    {
     strokesTotal += _strokes;
     parTotal += _par;
     displayRoundScore();
    }

     /**
    * Method that prints out all data related to the hole.
    */
    private void displayRoundScore()
    {
        System.out.println("Current Round Stats:");
        System.out.println("Par: "+ parTotal);
        System.out.println("Strokes: "+ strokesTotal);
        if(strokesTotal > parTotal)
        System.out.println(strokesTotal - parTotal + " over par");
        else if(parTotal > strokesTotal)
        System.out.println(parTotal - strokesTotal + " under par");
        else
        System.out.println("Made par");
        System.out.println();
    }
    
}
