package study.jeanwang2dev;

public class Main {

    public static void main(String[] args) {

//        double myValue1 = 20.00d;
//        double myValue2 = 80.00d;
//        double result = (myValue1 + myValue2) * 100.00d;
//        System.out.println("Total value is " + result);
//        double remainder = result % 40.00d;
//        System.out.println("The remainder is " + remainder);
//        boolean isRemainderZero = (remainder == 0) ? true : false;
//        System.out.println("The boolean variable is " + isRemainderZero);
//        if (!isRemainderZero) {
//            System.out.println("Got some remainder.");
//        }

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your second final score was " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your second final score was " + highScore);

        // Calculate Score Postion
        displayHighScorePosition("Jean", calculateHighScorePosition(1500));
        displayHighScorePosition( "Kate", calculateHighScorePosition(900));
        displayHighScorePosition( "Smith", calculateHighScorePosition(400));
        displayHighScorePosition( "Yoda", calculateHighScorePosition(50));
        displayHighScorePosition( "Yoda", calculateHighScorePosition(1000));
        displayHighScorePosition( "Yoda", calculateHighScorePosition(500));
        displayHighScorePosition( "Yoda", calculateHighScorePosition(100));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;

            return finalScore;
        }
        return  -1;
    }

    public static void displayHighScorePosition(String playerName, int position){
        System.out.println( playerName + " managed to get into position " + position
                            + " on the high score table") ;
    }

    public static int calculateHighScorePosition(int finalScore){
        int position = 4;

        if( finalScore >= 1000 ){
            position = 1;
        } else if( finalScore >= 500 ) {
            position = 2;
        } else if ( finalScore >= 100 ); {
            position = 3;
        }

        return position;


//        if( finalScore < 1000 ){
//              if( finalScore < 500 ) {
//                  if( finalScore >= 100 ){
//                      return 3;
//                  } else {
//                      return 4;
//                  }
//              } else {
//                  return 2;
//              }
//          } else {
//              return 1;
//        }

    }
}
