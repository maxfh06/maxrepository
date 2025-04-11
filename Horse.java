
/**
 * Write a description of class Horse here.
 * 
 * @author Maximo Fahey Hidalgo
 * @version
 */
public class Horse
{
    //Fields of class Horse
    private char horseSymbol;
    private final String horseName;
    private double horseConfidence;
    private int distanceTravelled;
    private boolean horseFlag;


    public static final char deadHorse = '✗';

      
    //Constructor of class Horse
   
    public Horse(char horseSymbol, String horseName, double horseConfidence)
    {
       this.horseSymbol = horseSymbol;
       this.horseName = horseName;
       this.horseConfidence = horseConfidence;
       this.distanceTravelled = 0;
        this.horseFlag = false; 
    }
    
    
    //Other methods of class Horse
    public void fall()
    {
        horseFlag = true;
        this.horseSymbol = deadHorse;
        
    }
    
    public double getConfidence()
    {
        return horseConfidence;
    }
    
    public int getDistanceTravelled()
    {
        return distanceTravelled;   
    }
    
    public String getName()
    {
        return horseName;
    }
    
    public char getSymbol()
    {
        return horseSymbol;
    }
    
    public void goBackToStart()
    {
        distanceTravelled = 0;
        horseFlag = false;
    }
    
    public boolean hasFallen()
    {
        return horseFlag;
    }

    public void moveForward()
    {
        distanceTravelled++;
    }

    public void setConfidence(double newConfidence)
    {
        if(newConfidence >= 0 && newConfidence <= 1){
            this.horseConfidence = newConfidence;
        }
    }
    
    public void setSymbol(char newSymbol)
    {
        this.horseSymbol = newSymbol;
    }
    
}
