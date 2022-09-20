import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

      Hyena h1 = new Hyena("Sita");
      Hyena h2 = new Hyena("Sara");

      Lion l1 = new Lion("Jan");
      Lion l2 = new Lion("Emil");

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(h1);
        animals.add(h2);
        animals.add(l1);
        animals.add(l2);


        for (Animal a : animals){
            System.out.println("Name: " + a.getName() + " eating banana.");
        }

       h1.laugh();
       h2.laugh();

       l1.setName("rooar");
       l1.roar();
       l2.roar();

    }
}