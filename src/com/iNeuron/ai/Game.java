package com.iNeuron.ai;

import java.util.Arrays;
import java.util.Scanner;

class Guesser {

	int gNum;

	int guessNum() {

		System.out.println("Guesser, guess the number b/w 1 to 10.");
		Scanner scan = new Scanner(System.in);
		gNum = scan.nextInt();

		if (gNum > 10) {
			System.out.println("Oops!,Please enter a valid number");
			gNum = scan.nextInt();
		}

		return gNum;

	}

}

class Players {

	String name;
	int gNum;

	String playerName() {
		System.out.println("Hey Player!,Enter your name");
		Scanner scan = new Scanner(System.in);
		name = scan.next();

		return name;
	}

	int guessNum() {
		System.out.println("Players guess the number b/w 1 to 10.");
		Scanner scan = new Scanner(System.in);
		gNum = scan.nextInt();
		if (gNum > 10) {
			System.out.println("Oops!,Please enter a valid number");
			gNum = scan.nextInt();
		}
		return gNum;
	}

}

class Umpire {

	int numFromGuesser;
	int guessNumFromPlayer1;
	int guessNumFromPlayer2;
	int guessNumFromPlayer3;
	int tiedPlayerA;
	int tiedPlayerB;

	String nameOfPlayer1;
	String nameOfPlayer2;
	String nameOfPlayer3;

	void collectGnum() {

		Guesser g = new Guesser();
		numFromGuesser = g.guessNum();

	}

	void CollectNamesFromPlayers() {
		Players p1 = new Players();
		Players p2 = new Players();
		Players p3 = new Players();

		nameOfPlayer1 = p1.playerName();
		nameOfPlayer2 = p2.playerName();
		nameOfPlayer3 = p2.playerName();

	}

	void collectGnumFromPlayers() {
		Players p1 = new Players();
		Players p2 = new Players();
		Players p3 = new Players();

		guessNumFromPlayer1 = p1.guessNum();
		guessNumFromPlayer2 = p2.guessNum();
		guessNumFromPlayer3 = p3.guessNum();

	}

	void tied() {
		Guesser g = new Guesser();
		numFromGuesser = g.guessNum();

		Players pA = new Players();
		Players pB = new Players();

		tiedPlayerA = pA.guessNum();
		tiedPlayerB = pA.guessNum();
	}

	void compare() {
		if (numFromGuesser == guessNumFromPlayer1) {
			if (numFromGuesser == guessNumFromPlayer2 && numFromGuesser == guessNumFromPlayer3) {
				System.out.println("Hurray, All player won the game *-*");
			} else if (numFromGuesser == guessNumFromPlayer2) {
				System.out.println("Game is tied b/w " + nameOfPlayer1 + " & " + nameOfPlayer2);
				System.out.println("Let's start the Final");
				System.out.println("---------------------");

				tied();

				if (tiedPlayerA == numFromGuesser) {
					System.out.println("Congratulations " + nameOfPlayer1 + ", you won the game");
				} else if (tiedPlayerB == numFromGuesser) {
					System.out.println("Congratulations " + nameOfPlayer2 + ", you won the game");
				} else {
					System.out.println("Lost the Game, Guesser number was " + numFromGuesser);
				}

			} else if (numFromGuesser == guessNumFromPlayer3) {
				System.out.println("Game is tied b/w " + nameOfPlayer1 + " & " + nameOfPlayer3);
				System.out.println("Let's start the Final");
				System.out.println("---------------------");

				tied();

				if (tiedPlayerA == numFromGuesser) {
					System.out.println("Congratulations " + nameOfPlayer1 + ", you won the game");
				} else if (tiedPlayerB == numFromGuesser) {
					System.out.println("Congratulations " + nameOfPlayer3 + ", you won the game");
				} else {
					System.out.println("Lost the Game, Guesser number was " + numFromGuesser);
				}

			} else {
				System.out.println("Congratulations " + nameOfPlayer1 + ", you won the game");
			}

		} else if (numFromGuesser == guessNumFromPlayer2) {
			if (numFromGuesser == guessNumFromPlayer3) {

				System.out.println("Game is tied b/w " + nameOfPlayer2 + " & " + nameOfPlayer3);
				System.out.println("Let's start the Final");
				System.out.println("---------------------");

				tied();

				if (tiedPlayerA == numFromGuesser) {
					System.out.println("Congratulations " + nameOfPlayer2 + ", you won the game");
				} else if (tiedPlayerB == numFromGuesser) {
					System.out.println("Congratulations " + nameOfPlayer3 + ", you won the game");
				} else {
					System.out.println("Lost the Game, Guesser number was " + numFromGuesser);
				}

			} else {
				System.out.println("Congratulation " + nameOfPlayer2 + ", you won the game");
			}
		} else if (numFromGuesser == guessNumFromPlayer3) {
			System.out.println("Congratulations " + nameOfPlayer3 + ", you won the game");
		} else {
			System.out.println("Lost the Game, Guesser number was " + numFromGuesser);
		}

	}
}

public class Game {

	public static void main(String[] args) {

		System.out.println("Welcome to GuesserGame.");

		System.out.println();

		Scanner scan = new Scanner(System.in);

		Umpire um = new Umpire();

		um.collectGnum();
		um.CollectNamesFromPlayers();
		um.collectGnumFromPlayers();
		um.compare();

	}

}
