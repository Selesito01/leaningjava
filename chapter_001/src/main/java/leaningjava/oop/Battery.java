package leaningjava.oop;

public class Battery {
    private int load;

    public Battery(int size) {
        this.load = size;
    }

    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(6);
        Battery second = new Battery(8);
        System.out.println("first : " + first.load + ". second : " + second.load);
        second.exchange(first);
        System.out.println("first : " + first.load + ". second : " + second.load);
    }
}