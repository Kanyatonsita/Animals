public class Lion extends Animal{

    public Lion (String name){
        super(name, " eating banana");
    }

    public void roar(){
        System.out.println(this.name +this.food);
    }
}
