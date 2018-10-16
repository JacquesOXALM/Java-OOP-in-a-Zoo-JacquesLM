public class Runner {
    public static void main(String[] args) {
        Tiger tigger =new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");
        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("cheese");
        Unicorn rarity= new Unicorn("Rarity");
        rarity.eat("marshmallows");
        rarity.eat("tobaccco");
        Giraffe gemma = new Giraffe("Gemma");
        gemma.eat("leaves");
        gemma.eat("hot dog");
        Bee stinger= new Bee("Stinger");
        stinger.eat("pollen");
        stinger.eat("fructose");
        Animal[] animals = new Animal[]{tigger,pooh, rarity,gemma,stinger};
        Zookeeper zoebot=new Zookeeper("Zoebot");
        zoebot.feedAnimals(animals,"meat");
    }
}
