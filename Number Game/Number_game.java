import java.util.Scanner;
import java.lang.Math;

class Number_game
{   
    public static int getRandNum(int min, int max) 
    {
        return (int) ((Math.random() * (max - min)) + min);
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int chance=10;
        int chanceTime = 0;
        System.out.println();
        System.out.println("^^........Welcome to the game...!!! you have "+ chance +"chance to win the game .........^^ ");
        System.out.println();
        while(true)
        {
            int randNum = getRandNum(1,100);
            boolean guess=false;
            for(int i=1;i<=chance;i++)
            {
               
                System.out.println();
                System.out.print("Chance "+ i +" Enter the number you guess : " );
                int userNum = input.nextInt();

                chanceTime = chanceTime+1;
            
                if(userNum == randNum)
                {
                    guess=true;
                    {
                        System.out.println("You win the game  . The random number is : " + randNum);    
                        System.out.println("Execution time is : " + chanceTime);
                        break;
                    }
                }
                else if(userNum > randNum)
                {
                    System.out.println("too High");
                }
                else if (userNum < randNum)
                {
                    System.out.println("too Low");
                }
                
            }
            if(guess==false)
                {
                    System.out.println();
                    System.out.println("Sorry you lost the chance . The random number is : " + randNum);   
                }
            System.out.println();
            System.out.print("Do you want the play again. Enter (Y/N) : ");
            String choice = input.next();
            while(!(choice.equals("Y")||choice.equals("N")))
            {
                System.out.print("Unrecoqnized input. Enter (Y/N) : ");
                choice=input.next();
            }
            if(choice.equals("N"))
            {
                break;
            }
            else if(choice.equals("Y"))
            {
                System.out.println("\n----------------------------------------------------------------------------------------------\n");
            }
        }
        

    }
    
}
