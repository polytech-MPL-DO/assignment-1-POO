
public class Planets_v1 {

  public enum Planet { MERCURY, VENUS, EARTH, SATURN }

  public static void main(String[] args) {
    for (Planet p : Planet.values()) {
       System.out.printf("This is planet %s\n", p); 
       // also ok: System.out.println(p);
    }       
  }  
}