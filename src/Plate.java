import java.lang.reflect.Constructor;

public class Plate
{
        private int Maxfood;
        private int size;


        public Plate (int Maxfood,int size)
        {
            this.Maxfood=Maxfood;
            this.size=size;
        }


    public int getMaxfood() {
        return Maxfood;
    }


    public void isMaxfood(int food)
    {
        if(food <= Maxfood)
        {
            int eat=this.size + food;
            if (eat >= Maxfood)
            {
                this.size=Maxfood;
                System.out.println("Вы не можете добавить еду больше " + Maxfood);
            }
            else {
                size = eat;
                System.out.println("Вы добавили еду");
            }
        }

    }

        public boolean decrease(int eatSize)
        {
            if (eatSize > size) return false;
            else
                size-=eatSize;
            return true;
        }

    @Override
    public String toString() {
        return "Plate{" +
                "Maxfood=" + Maxfood +
                ", size=" + size +
                '}';
    }




}
