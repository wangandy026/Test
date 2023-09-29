public class Wheel {


    //instance variables 
    private double diameter; 
    private double width; 

    public Wheel()
    {
        this.diameter = 16;
        this.width = 1; 
         
    }

    public Wheel(double aDiameter, double aWidth)
    {
        //TODO 
        this.setDiameter(aDiameter);
        this.setWidth(aWidth);
    }

    // accesstors (getters) 
    public double getWidth()
    {
        return this.width; 
    }
    public double getDiameter()
    {
        return this.diameter; 
    }

    public void setDiameter(double aDiameter)
    {
        if(aDiameter >= 16 && aDiameter <= 55)
            this.diameter = aDiameter; 
        else 
            this.diameter = 16; 
    }
    public void setWidth(double aWidth)
    {
        if(aWidth > 1 && aWidth < 2.5)
            this.width = aWidth; 
        else 
            this.width = 1; 
    }
    public boolean equals(Wheel aWheel)
    {
        return aWheel != null && 
                this.diameter == aWheel.getDiameter() && 
                this.width == aWheel.getWidth(); 
    }
    public String toString()
    {
        return "[Wheel] diameter is: "+ this.diameter+" and the width is: "+this.width; 
    }

}
