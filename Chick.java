class Chick implements Animal 
{        
  private String mySound;        
  private String myType;

  public Chick (String type, String sound){
  myType = type;
  mySound = sound;
  } 
  public String getSound(){return mySound;}
  public String getType(){return myType;}
}


