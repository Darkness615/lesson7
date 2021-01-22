
import javax.naming.Name;


public class Cat extends Animal
{
    private boolean notHungry;
    private String Name;


    public Cat(String Name)
    {
        super(200, 0);
        this.Name=Name;
    }

    public boolean notHungry() {
        return notHungry;
    }


    @Override
    public void swim(int distance)
    {
        System.out.println(String.format("Cat %s no swimming ",Name));
    }


    @Override
    public void run(int distance)
    {
        if(distance<=getMaxRundistance()) {
            System.out.println(String.format("Cat %s is running ", Name) + distance);
        }
        else
        {
            System.out.println(String.format("Cat %s no running more than:  ",Name) + getMaxRundistance());
        }
    }

   public void eat (Plate plate)
    {
        notHungry= plate.decrease(10);

    }



    @Override
    public String toString() {
        return "Cat{" +
                "notHungry=" + notHungry +
                ", Name='" + Name + '\'' +
                '}';
    }

}