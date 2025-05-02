public class dog extends pet{
    public void catchStick(){
        System.out.println("ok master, i do");
    }
    public void Move(){
        System.out.println("ok master, i do");
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("I speak whenever you want to");
    }
}
