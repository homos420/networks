import java.util.Random;

public class Chamelleon extends pet {
    public boolean sleep() {
        Random random = new Random();
        return random.nextBoolean();
    }

    public String changeColor() {
        String color="not set";
        Random rand = new Random();
        int colorNum = rand.nextInt(3);
        if (colorNum == 0) {
            super.setColor("Red");
            color = "Red";
        } else if (colorNum == 1) {
            super.setColor("Green");
            color = "Green";
        } else if (colorNum == 2) {
            super.setColor("Yellow");
            color = "Green";
        } else if (colorNum == 3) {
            super.setColor("Blue");
            color = "Blue";
        }
        return color;
    }

    @Override
    public void speak() {
        System.out.println(" Silent all time");
    }

    @Override
    public void print() {
        if(!sleep()){
            System.out.println("im awake");
        }
        else {
            System.out.println("im asleep");
        }
    }
}
