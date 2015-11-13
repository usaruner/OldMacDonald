public class NamedCow extends Cow
{
  private String named;
  NamedCow(String type, String nName, String sound)
  {
    named = nName;
    myType = type;
    mySound = sound;
  }
  public String getName()
  {
    return named;
  }

}
