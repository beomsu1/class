package chapter1;

import java.util.Scanner;

public class Member {

	public static void main(String[] args) {

		System.out.println("안녕하세요 이범수입니다.");
		
		Scanner in= new Scanner(System.in);
		
		System.out.println("태어난 년도를 입력해주세요 : ");
		int year = in.nextInt();
		FreeVaccine(year);
		PrintMedical(year);
		
		
	}

	static void FreeVaccine(int year) {
		int age;
		age = 2023 - year + 1;

		if (age < 15 && age >= 65) {
			System.out.println("무료 예방 접종이 가능합니다");
		} else {
			System.out.println("무료 접종 대상이 아닙니다.");
		}
	}

	static void PrintMedical(int year) {
		int age=0;
		age = 2023 - year + 1;
		
		if ( age >=20 && (2023+year)%2==0) {
			System.out.println("무료 대상입니다.");
		} if(age>=40) {
			System.out.println("암 검사 무료 대상입니다.");
		}else {
			System.out.println("대상이 아닙니다.");
		}
	}
}
