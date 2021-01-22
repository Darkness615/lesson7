public class Dog extends Animal {

    private String Name;
    public Dog(String Name)
    {
        super(500, 10);
        this.Name=Name;
    }
    @Override
    public void swim(int distance)
    {
        if(distance<getMaxSwimdistance()) {
            System.out.println(String.format("Dog %s  swam ",Name) + distance);
        }
        else
        {
            System.out.println(String.format("Dog %s can't swim more than: ",Name) + getMaxRundistance());
        }
    }
    @Override
    public void run(int distance)
    {
        if(distance<getMaxRundistance()) {
            System.out.println(String.format("Dog %s swam ",Name) + distance);
        }
        else
        {
            System.out.println(String.format("Dog %s can't run more than: ",Name) + getMaxRundistance());
        }
    }
}