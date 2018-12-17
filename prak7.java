import java.lang.String;
import java.util.*;

public class prak7 {
    public static int play(List<String> f, List<String> s){
        int i = 0;
        int cardNumbF = 5;
        int cardNumbS = 5;
        Queue < Integer > first = new LinkedList < Integer > ();
        Queue < Integer > second = new LinkedList < Integer > ();
        for (int k = 0; k < 5; k++){
            first.add( Integer.parseInt(f.get(k)) );
            second.add( Integer.parseInt(s.get(k)) );
        }
        while (i <= 106) {
            i++;
            System.out.println(first);
            System.out.println(second);
            System.out.println("---------");
            int fCard = first.poll();
            int sCard = second.poll();
            if (fCard == 0 && sCard == 9){
                first.add(fCard);
                first.add(sCard);
                cardNumbF++;
                cardNumbS--;
            }
            else if (fCard == 9 && sCard == 0){
                second.add(sCard);
                second.add(fCard);
                cardNumbF--;
                cardNumbS++;
            }
            else if ( fCard > sCard ) {
                first.add(fCard);
                first.add(sCard);
                cardNumbF++;
                cardNumbS--;
            }
            else if ( sCard > fCard ) {
                second.add(sCard);
                second.add(fCard);
                cardNumbF--;
                cardNumbS++;
            }
            if (cardNumbF == 0){
                System.out.println("First "+ i);
                return 0;
            }
            else if (cardNumbS == 0){
                System.out.println("Second "+ i);
                return 0;
            }
        }
        System.out.println("botva");
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line_1 = scanner.nextLine();
        String line_2 = scanner.nextLine();
        List<String> arr_1 = Arrays.asList(line_1.split(" "));
        List<String> arr_2 = Arrays.asList(line_2.split(" "));
        play (arr_1, arr_2);
    }
}
