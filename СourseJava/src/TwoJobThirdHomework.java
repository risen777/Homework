/**
 * Created by user on 14.03.2017.
 */
public class TwoJobThirdHomework {
    public static void main(String[] args) {


        int min = 0;
        int max = 28800;
        int value = (int) (Math.random() * (max - min));
        int hour = value / 3600;
        System.out.println(value +"  Осталось " + hour+"  часов");

    }
}
