class Chick implements Animal 
{     
  private String myType;     
  private String mySound;      
  public Chick(String type, String sound, String sound2) 
  {         
    myType = type;         
    if(Math.random()*1<0.5)
    {
      mySound=sound2;
    }
    else
    mySound=sound;
  }     
  public Chick() 
  {         
    myType = "unknown";         
    mySound = "unknown";
  }      
  public String getSound() {
    return mySound;
  }     
  public String getType() {
    return myType;
  }
}

