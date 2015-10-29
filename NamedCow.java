class NamedCow extends Cow
{
  private String pname;
  public NamedCow(String type, String name, String sound)
  {
    pname=name;
    myType = type;         
    mySound = sound;   
  }
  public String getName()
  {
    return pname;
  }
}

