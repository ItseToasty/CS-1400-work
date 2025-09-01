//Kayshawn Williams
//CS1400
//Assignment 3
//3/19/25

public class Demo{
    
    public static void main(String[] args) {
        //Create two people one that is unique and another that copies the first
        try{
            Person Joe = new Person("NotaHeroJoe", 32, "Electrical cables");
            System.out.println(Joe);
       
       
            Person Joe2 = new Person(Joe);
            System.out.println("Now there are two Joes.");
            System.out.println(Joe2);
       

            //Compare the two people, they should be the same, change one, then make sure it changed
            if(Joe.equals(Joe2)){
                System.out.println("They are the same. Joe is Joe.\n\n");
            }

            Joe2.setName("MaybeaHeroJoe");
            System.out.println(Joe2);
            if(!Joe.equals(Joe2)){
                System.out.println("Somehting has changed...\nThey are no longer the same...\n\n");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }


        try{
            //create a new SuperHero person with whatever fields you see fit.
            SuperHero JoeHero = new SuperHero("MaybeaHeroJoe", 32, "Electrical cables",
                                          "DefinitelyaHeroJoe", "Heroics", 
                                          "*Joe stands with his hands on his hips and his chest pushed out at a 9.37 degree angle from his body.*" + 
                                          "\n*He smirks and raises one eyebrow.*" + 
                                          "\n*The cape of his costume flows regardless of the direction or presence of wind." +
                                          "\n*Joe includes all this information when he gives his catchprhase despite not including speech.*" +
                                          "\n*He speaks.*" + 
                                          "\n\"Joe, definitely a hero, is here.\"");



            //Test the toString(), villainsCaught(), catchVillain(), and speak() methods from the SuperHero class                                
            System.out.println(JoeHero + "\n\n\n\n");

            System.out.println("Villains caught: " + SuperHero.villainsCaught());

            SuperHero.catchVillain();

            JoeHero.speak();

            System.out.println("Villains Caught: " + SuperHero.villainsCaught() + "\n\n");
        }
        catch(Exception e){
            System.out.println(e);
        }


        try{
        SuperHero postShadow = new SuperHero("Tardi", 26, "Stale Pizza", "PostShadow",
                                     "Seeing the very recent past", "Oh, they're already caught." );

        System.out.println(postShadow);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("DONEDONEDONE");
        //nfeiuwbdc9iwudbcwdc
    }
}
