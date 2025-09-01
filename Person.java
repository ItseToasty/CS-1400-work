//Kayshawn Williams
//CS1400
//Assignment 3
//3/19/25



public class Person{

    private String name;
    private int age;
    private String favoriteFood;

    //constructor for the Person class
    public Person(String n, int a, String f) throws Exception{ 
        if(age<0 || age>120){throw new Exception("This is an invalid age");}

        name = n;
        age = a;
        favoriteFood = f;
    }
    //a method to make a copy of a given Person object
    public Person(Person p){
        name = p.getName();
        age = p.getAge();
        favoriteFood = p.getFood();
    }

    //the setters and getters for the Person class
    public void setName(String n ){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void setAge(int a ){
        age = a;
    }

    public int getAge(){
        return age;
    }

    public void setFood(String f ){
        favoriteFood = f;
    }

    public String getFood(){
        return favoriteFood;
    }


    //equals method returns true if all fields are the same
    public boolean equals(Person p){
        boolean fin = (name.equals(p.name) &&
                       age == p.age &&
                       favoriteFood.equals(this.favoriteFood));
        return fin;
    }

    //to String replacement for the Person class
    public String toString(){
        return "Name: " + name + 
               "\nAge: " + age + 
               "\nFavorite food: " + favoriteFood + "\n";
    }


}