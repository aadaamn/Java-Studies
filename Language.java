public class Language {
    // Instance variables
    protected String name, regionsSpoken, wordOrder;
    protected int numSpeakers;
  
    // Our language constructor
    Language (String name, int numSpeakers, String regionsSpoken, String wordOrder){
      this.name = name;
      this.numSpeakers = numSpeakers;
      this.regionsSpoken = regionsSpoken;
      this.wordOrder = wordOrder;
    }
  
    // Get info method
    public void getInfo() {
      System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".\n" + "The language follows the word order: " + this.wordOrder + ".");
    }
  
    // Our main
    public static void main(String[] args){
      // Language superclass
      Language malay = new Language("Malay" , 33871431, "Malaysia and sometimes Singapore" , "Subject-verb-object" );
      malay.getInfo();
  
      // Subclass 1
      Mayan tojolabal = new Mayan("Tojolabʼal" , 324533);
      tojolabal.getInfo();
  
      // Subclass 2
      SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 996672);
      SinoTibetan burmese = new SinoTibetan("Burmese", 59432);
      mandarin.getInfo();
      burmese.getInfo();
  
    }
  }