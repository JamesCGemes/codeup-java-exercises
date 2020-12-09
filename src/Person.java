public class Person {
    private String name;

    public  Person(String name){
        this.name = name;
    }

//    return the persons name
    public String getName(){
        return this.name;
    }
//   change the name property to the passed value
    public void setName(String name){
        this.name = name;
    }
//   print a message to the console using the persons name
    public void sayHello(){
        System.out.printf("%s says hello", this.name);
    }



}
