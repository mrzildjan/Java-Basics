package introduce;

public class Introduce {
    String name = "Zildjan Leenor C. Luvindino";
    int age = 19;
    String address = "216 V. Rama Avenue, Cebu City, Cebu, 6000, Philippines";
    
    public static void main(String[] args) {
        Introduce objname = new Introduce();
        Introduce objage = new Introduce();
        Introduce objaddress = new Introduce();
        
        System.out.println("Hello Java, my name is: " + objname.name);
        System.out.println("My age is: " + objage.age);
        System.out.println("I live in: " + objaddress.address);
    }
}
