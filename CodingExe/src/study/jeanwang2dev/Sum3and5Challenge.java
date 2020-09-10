package study.jeanwang2dev;

public class Sum3and5Challenge {

    public static void challengeResult(){
        int sum = 0;
        int count = 0;
        for(int i=1; i <= 1000; i++){
            if( i % 3 == 0 && i % 5 == 0 ){
                System.out.println("Found number: " + i);
                sum += i;
                count++;
                if( count == 5 ){
                    break;
                }
            }
        }
        System.out.println("Sum = " + sum);
    }
}
