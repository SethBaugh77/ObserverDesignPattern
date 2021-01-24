package GolfAssignment;

public class RoundScoreDisplay implements Observer{

    private Subject golfer;
    private int strokesTotal;
    private int parTotal;

    public RoundScoreDisplay(Subject _golfer)
    {
        golfer = _golfer;
        golfer.registerObserver(this);
    }
    public void update(int _strokes, int _par)
    {
        strokesTotal += _strokes;
        parTotal += _par;
        displayRoundScore();

    }
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
