/**
 * Created by Gunnik on 11.03.2017.
 */
public class FourthHomework {

    public static void main(String[] args) {
        int n = 103;
        int one = n % 10;
        int two = (n / 10) % 10;
        int three = (n / 100) % 10;
        System.out.print(one + two + three);


    }
}

/*
        //Ввести натуральное трехзначное число
        int n;
        int result = 0;
        n = 123;
        for (int i = 1; i <= n; i++) {
            result += i;

        }
        System.out.println(result);
    }

}
*/