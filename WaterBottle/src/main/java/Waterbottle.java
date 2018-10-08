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
        return this.volume - this.volume;
    }
}