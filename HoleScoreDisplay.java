package GolfAssignment;

public class HoleScoreDisplay implements Observer{

private Subject golfer;
private int strokes;
private int par;

    public HoleScoreDisplay(Subject _golfer)
{
    golfer = _golfer;
   
}

    @Override
    public void update(int strokes, int par) {
        

    }




private void displayCurrentScore()
{

}




    
}
