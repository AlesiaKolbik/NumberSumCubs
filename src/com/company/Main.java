package com.company;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите число: ");
		int M = in.nextInt();
		int Sum = 0;
		int s = 0;
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				for (int k = 1; k < 10; k++) {
					Sum = i * i * i + j * j * j + k * k * k;
					if (M == Sum && s == 0) {
						s++;
						System.out.println(" " + i + j + k);
					}
				}
			}
		}
		if (s == 0) {
			System.out.println("Число не может быть выражено как сумма отдельных положительных кубов ");
		}
	}
}