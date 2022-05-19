package N1;

public abstract class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void voice();

    public void seat() {
        System.out.println(name + " sidet");
    }

}
