public class Frame {
    // instance variables 
    private double size; 
    private String type; 




    public Frame()
    {
        this.size = 18.5; 
        this.type = "diamond"; 
    }
    public Frame(double aSize, String aType)
    {  
        //TODO 
        this.setSize(aSize);
        this.setType(aType);
    }  

    public double getSize()
    {
        return this.size; 
    }
    public String getType()
    {
        return this.type; 
    }

    public void setSize(double aSize)
    {
        if(aSize >= 18.5 && aSize <= 60)
            this.size = aSize; 
        else 
            this.size = 18.5; 
    }
    public void setType(String aType)
    {
        if(aType.equalsIgnoreCase("diamond") || aType.equalsIgnoreCase("Step-Through") 
                                    || aType.equalsIgnoreCase("Truss") || aType.equalsIgnoreCase("Penny-Farthing"))
                                        this.type = aType; 
        else 
            this.type = "diamond"; 
    }
    public boolean equals(Frame aFream)
    {
        return aFream != null &&  
        this.size == aFream.getSize()
         && this.type.equalsIgnoreCase(aFream.getType()); 
    }
    public String toString()
    {
        return "[Frame] Size:" + this.size + " Type: "+ this.type; 
    }






}
