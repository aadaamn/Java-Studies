public class Droid {
  // Instance Field
  int batteryLevel;
  String name;
  
  // Construstor Method
  public Droid(String droidName){
    batteryLevel = 100;
    name = droidName;
  }

  // Method
  public String toString(){
    return "Hi, my name is " + name + ". Have a nice day";
  }

  public void performTask(String task){
    System.out.println(name + " is performing task: " + task);
    batteryLevel -= 10;
  }

  public void energyReport(){
    System.out.println(name + "'s Battery Level: " + batteryLevel);
  }

  // Our main 
  public static void main(String [] args){
    // Instance
    Droid codey = new Droid("Codey");
    codey.performTask("Meowing");
    codey.energyReport();

    // Second droid
    Droid shey = new Droid("Shey");
  }
}
