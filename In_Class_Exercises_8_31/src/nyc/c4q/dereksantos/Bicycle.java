package nyc.c4q.dereksantos;

public class Bicycle implements Vehicle, WheelieAble {

    int speed;

    public Bicycle(int speed) {
        this.speed = speed;
    }

    @Override
    public void applyBrakes(int delta) {
        int startingSpeed = delta;
        while (delta > 0) {
            delta--;
        }
        this.speed = delta;
        System.out.println("Is that a Sonic? You were going " + startingSpeed + " mph, but now you're going " + speed + " mph because you're hungry.");
    }

    @Override
    public void speedUp(int delta) {
        int startingSpeed = delta;
        while (delta < 13) {
                delta++;
        }
        this.speed = delta;
        System.out.println("You were going " + startingSpeed + " mph, but now you're going " + speed + " mph.");
    }

    @Override
    public void slowDown(int delta) {
        int startingSpeed = delta;
        while (delta > 10) {
            delta--;
        }
        this.speed = delta;
        System.out.println("Whoa, you almost killed someone. You were going " + startingSpeed + " mph, but now you're going " + speed + " mph.");
    }

    @Override
    public boolean popAWheelie(int duration) {
        while (duration != 0) {
            System.out.println("I'm popping a wheelie!");
            duration--;
        }
        return true;
    }

}