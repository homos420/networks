public class PoliceDog extends dog{
    private String taskTrained;
    private String Type;

    @Override
    public void speak() {
        System.out.println("Always ready for work");
    }

    @Override
    public void print() {
        super.print();
        System.out.println(" i'm training in this task "+taskTrained+" and my type is ");
    }
}
