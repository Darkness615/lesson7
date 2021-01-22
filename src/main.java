import java.util.Scanner;

public class main {

    static public void main (String[] Args)
    {
        task();

    }


    static public void task()
    {
        int n=0;
        int m=0;
        int g=0;
        Scanner scanner=new Scanner(System.in);
        Scanner scan=new Scanner(System.in);

        do {
            System.out.println("Укажите глубилну тарелки");
            n = scanner.nextInt();

            System.out.println("Укажите кол-во еды");
            m = scan.nextInt();
        } while (n<m);


        Plate plate=new Plate(n,m);


        Cat cats []=
        {       new Cat("Barsik"),
                new Cat("Snow"),
                new Cat("Devil"),
        };


        for (int i=0;i < cats.length;i++)
        {
                cats[i].eat(plate);
            System.out.println(cats[i]);
        }

        System.out.println(plate);

        System.out.println("Сколько еды вы хотите добавить?");
        g = scan.nextInt();

        plate.isMaxfood(g);
        System.out.println(plate);

    }



}
