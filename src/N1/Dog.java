package N1;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println(" gav gav");
    }

    @Override
    public void seat() {
        System.out.println(name + " sidet izdal golos");
        voice();
    }
    public void jump(){
        System.out.println(" prugaet");
    }
}
