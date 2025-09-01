//Kayshawn Williams
//CS1400
//Assignment 3
//3/19/25

public class SuperHero extends Person{
    
    private String superheroName;
    private String superPower;
    private String catchphrase;
    private static int totalVillainsCaught;


    public SuperHero(String name, int age, String favFood, String inputSuperName, 
    String inputPower, String inputCatchphrase) throws Exception{
        super(name, age, favFood);
        superheroName = inputSuperName;
        superPower = inputPower;
        catchphrase = inputCatchphrase;

    }

    //the setters and getters for the Superhero class
    public void setSuperName(String n ){
        superheroName = n;
    }

    public String getSuperName(){
        return superheroName;
    }

    public void setPower(String p){
        superPower = p;
    }

    public String getPower(){
        return superPower;
    }

    public void setPhrase(String c ){
        catchphrase = c;
    }

    public String getPhrase(){
        return catchphrase;
    }

    //makes a superhero print out their catchphrase
    public void speak(){
        System.out.println(catchphrase);
    }

    //toString that lists all fields
    public String toString(){
       return  super.toString() +
               "Hero Name: " + superheroName +
               "\nSuperpower: " + superPower +
               "\n Catchphrase: " + catchphrase;
        
    }

    //A method that simulates a villain being caught and tallying up the total villains caught
    public static void catchVillain(){
        totalVillainsCaught++;
    }

    public static int villainsCaught(){
        return totalVillainsCaught;
    }
}
