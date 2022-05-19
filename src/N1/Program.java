package N1;

public class Program {
    public static void main(String[] args) {
        Cat nana = new Cat("nana");
        Dog bob = new Dog("bob");
        nana.seat();
        nana.voice();
        bob.seat();
        bob.voice();
        Animal[] ttt = {nana, bob};
        eVoiceForAllAnimals(ttt);
    }


    public static void eVoiceForAllAnimals(Animal[] animals) {
        for (int i = 0; i < animals.length; i++) {
            animals[i].voice();
            if (animals[i] instanceof Dog){
                ((Dog) animals[i]).jump();

            }
        }
    }
}

