public class BeerSong {

  public static void main(String[] args) {
  
    ninety_nine_bottles_of_beer();
  
  }
  
  public ninety_nine_bottles_of_beer() {
    
    int x = 99;
    for (int i = 0; i < 99; i++) {
      System.out.println(x + " bottles of beer on the wall, " + x + " bottles of beer");
      System.out.println("take one down, pass it around, " + x-- + " bottles of beer on the wall.");
    }
    
    
  }

}
