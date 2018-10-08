public class Waterbottle {

    public int volume;

    public Waterbottle(int volume) {
        this.volume = volume;

    }

    public int hasVolume() {
        return this.volume;
    }

    public int canDrink(){
      return this.volume -=10;
    }

    public int getEmpty() {
        this.volume = 0;
        return this.volume ;
    }

    public int getFilled() {
        this.volume = 100;
        return this.volume;
    }
}