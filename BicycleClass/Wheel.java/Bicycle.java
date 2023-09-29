public class Bicycle {
    
    // instance variables 
    private String make; 
    private Wheel frontWheel; 
    private Wheel backWheel; 
    private Frame frame; 

    public Bicycle()
{
    this.make = "none"; 
    this.backWheel = new Wheel(); 
    this.frontWheel = new Wheel(); 
    this.frame = new Frame(); 
}
    public Bicycle(String aMake, Wheel aFront, Wheel aBack, Frame aFrame)
    {
        this.setMake(aMake);
        this.setFrontWheel(aFront);
        this.setBackWheel(aBack);
        this.setFrame(aFrame);
    }  

    public String getMake()
    {
        return this.make; 
    }
    public Wheel getFrontWheel()
    {
        return this.frontWheel; 
    }
    public Wheel getBackWheel()
    {
        return this.backWheel; 
    }
    public Frame getFrame()
    {
        return this.frame; 
    }

    public void setMake(String aMake)
    {
        if(aMake != null)
            this.make = aMake; 
        else 
            this.make = "none"; 
    }
    public void setFrontWheel(Wheel aFront)
    {
        if(aFront != null)
            this.frontWheel = aFront; 
        else 
            this.frontWheel = new Wheel(); 
    }
    public void setBackWheel(Wheel aBack)
    {
        if(aBack != null)
            this.backWheel = aBack; 
        else 
            this.backWheel = new Wheel(); 

    }
    public void setFrame(Frame aFrame)
    {
        if(aFrame != null)
            this.frame = aFrame; 
        else 
            this.frame = new Frame(); 
    }
    public boolean equals(Bicycle aBike)
    {
        return aBike != null &&
        this.make.equals(aBike.getMake()) 
        && this.frontWheel.equals(aBike.getFrontWheel())
        && this.backWheel.equals(aBike.getBackWheel())
        && this.frame.equals(aBike.getFrame());  
    }
    public String toString()
    {
        return "[Bicycle] Make:" + this.make + " Front Wheel: "+ this.frontWheel
        +" Back Wheel"+ this.backWheel+" Frame"+this.frame; 
    }
}



