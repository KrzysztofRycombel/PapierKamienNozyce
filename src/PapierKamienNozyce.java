/*
Gra Papier, kamień, nożyce.
*/

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class PapierKamienNozyce {


static int random(){
    Random random = new Random();
    return random.nextInt(3)+1;
}

static int input(){
    Scanner input = new Scanner(System.in);
    int r = 0;
    try{
        r = input.nextInt();
    }catch (InputMismatchException e){
        System.out.println("Podaj dane w odpowiednim formacie.");
    }finally {
        return r;
    }

}

static void checkResult(int playerSelection, int computerSelection){

    if(playerSelection==computerSelection) {
        System.out.println("Komputer wybrał to samo. Remis!\n");
    }

    else if((playerSelection==1 && computerSelection==2) ||
            (playerSelection==2 && computerSelection==3) ||
            (playerSelection==3 && computerSelection==1)) {
        System.out.println("Komputer wybrał "+computerSelection+". Brawo, wygrałeś!\n");
    }

    else {
        System.out.println(("Komputer wybrał "+computerSelection+". Niestety, ale przegrałeś.\n"));
    }
}
    public static void main(String[] args){

        System.out.print("Ile chcesz zagrać rozgrywek? \n");

        int playerChoice;
        int computerChoice;
        int howManyGames = input();

        for( int i = 1; i <= howManyGames; i++){
            System.out.println("Podaj liczbę: 1.Papier 2.Kamień 3.Nożyce");
            playerChoice = input();
            computerChoice = random();
            checkResult(playerChoice, computerChoice);
        }
    }
}
