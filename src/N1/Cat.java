package N1;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println(" my my");
    }

    @Override
    public void seat() {
        super.seat();
    }
}
