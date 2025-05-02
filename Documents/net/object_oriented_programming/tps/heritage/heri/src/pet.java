public class pet {
    private String name;
    private String Color;
    private String Breed;

    public pet() {
        this.name = "unknown";
        this.Color = "unknown";
        this.Breed = "unknown";

    }

    public pet(String name, String Color, String Breed) {
        this.name = name;
        this.Color = Color;
        this.Breed = Breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getBreed() {
        return Breed;
    }

    public void setBreed(String breed) {
        Breed = breed;
    }

    public void speak() {
        System.out.println("im your cuddly little pet");
    }

    public void print() {
        System.out.println("your pet name is " + getName() + ", the colour is " + getColor() + " and the breed is " + this.Breed);
    }

}
