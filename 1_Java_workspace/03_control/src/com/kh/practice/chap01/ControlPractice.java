package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);

		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("입력 메뉴입니다.");
			break;
		case 2:
			System.out.println("수정 메뉴입니다.");
			break;
		case 3:
			System.out.println("조회 메뉴입니다.");
			break;
		case 4:
			System.out.println("삭제 메뉴입니다.");
			break;
		case 7:
			System.out.println("종료 메뉴입니다.");
			break;

		default:
			System.out.println("입력 오류");
			break;
		}

		sc.close();
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();

		if (num > 0) {
			if (num % 2 == 0) {
				System.out.print("짝수다");
			} else {
				System.out.print("홀수다");
			}
		} else {
			System.out.print("양수만 입력해주세요.");
		}
		sc.close();
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("국어점수 : ");
		int num1 = sc.nextInt();
		System.out.print("수학점수 : ");
		int num2 = sc.nextInt();
		System.out.print("영어점수 : ");
		int num3 = sc.nextInt();

		int hap = num1 + num2 + num3;
		double result = hap / 3;

		if (num1 >= 40 && num2 >= 40 && num3 >= 40 && result >= 60) {
			System.out.println("국어 : " + num1);
			System.out.println("수학 : " + num2);
			System.out.println("영어 : " + num3);
			System.out.println("합계 : " + hap);
			System.out.println("평균 : " + result);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}

		sc.close();
	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);

		System.out.print("1~12 사이의 정수 입력 : ");
		int num = sc.nextInt();

		switch (num) {
		case 3:
		case 4:
		case 5:
			System.out.println(num + "월은 봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(num + "월은 여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(num + "월은 가을입니다.");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println(num + "월은 겨울입니다.");
			break;
		default:
			System.out.println(num + "월은 잘못 입력된 달입니다.");
			break;
		}

		sc.close();
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();

		String mid = "myId";
		String mpw = "myPassword12";

		if (id.equals(mid) && pw.equals(mpw)) {
			System.out.println("로그인 성공");
		} else {
			if (!id.equals(mid) && !pw.equals(mpw)) {
				System.out.println("아이디와 비밀번호가 틀렸습니다.");
			} else if (!id.equals(mid)) {
				System.out.println("아이디가 틀렸습니다.");
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}

		sc.close();
	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);

		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String level = sc.nextLine();

		if (level.equals("비회원")) {
			System.out.println("게시글 조회");
		} else if (level.equals("회원")) {
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
		} else if (level.equals("관리자")) {
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성, 게시글 조회");
		} else {
			System.out.println("입력 오류");
		}

		sc.close();
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);

		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();

		double bmi = weight / (height * height);
		System.out.println("BMI 지수 : " + bmi);
		if (bmi >= 30) {
			System.out.println("고도 비만");
		} else if (bmi >= 25) {
			System.out.println("비만");
		} else if (bmi >= 23) {
			System.out.println("과체중");
		} else if (bmi >= 18.5) {
			System.out.println("정상체중");
		} else {
			System.out.println("저체중");
		}

		sc.close();

	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);

		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.print("연산자를 입력(+, -, *, /, %) : ");
		char op = sc.nextLine().charAt(0);
		double result = 0.0;

		if (num1 > 0 && num2 > 0) {
			switch (op) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = (double) num1 / num2;
				break;
			case '%':
				result = num1 % num2;
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
				break;
			}
			System.out.printf("%d %c %d = %.6f\n", num1, op, num2, result);
		} else {
			System.out.println("양수만 계산 가능합니다. 프로그램을 종료합니다.");
		}

		sc.close();
	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);

		System.out.print("중간 고사 점수 : ");
		int num1 = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int num2 = sc.nextInt();
		System.out.print("과제 점수 : ");
		int num3 = sc.nextInt();
		System.out.print("출석 회수 : ");
		int num4 = sc.nextInt();

		double inum1 = num1 * 0.2;
		double inum2 = num2 * 0.3;
		double inum3 = num3 * 0.3;
		double inum4 = num4 * 1.0;

		double result = inum1 + inum2 + inum3 + inum4;

		System.out.println("============ 결과 ============");
		if (inum4 > (20 * 0.7)) {
			System.out.println("중간 고사 점수(20) : " + inum1);
			System.out.println("기말 고사 점수(30) : " + inum2);
			System.out.println("과제 점수      (30) : " + inum3);
			System.out.println("출석 점수      (20) : " + inum4);
			System.out.println("총점 : " + result);

			if (result >= 70) {
				System.out.println("PASS");
			} else {
				System.out.println("Fail [점수 미달]");
			}
		} else {
			System.out.println("Fail [출석 회수 부족 (" + num4 + "/" + 20 + ")]");
		}

		sc.close();
	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);

		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		System.out.print("선택 : ");
		int select = sc.nextInt();

		switch (select) {
		case 1:
			practice1();
			break;
		case 2:
			practice2();
			break;
		case 3:
			practice3();
			break;
		case 4:
			practice4();
			break;
		case 5:
			practice5();
			break;
		case 6:
			practice6();
			break;
		case 7:
			practice7();
			break;
		case 8:
			practice8();
			break;
		case 9:
			practice9();
			break;
		default:
			System.out.println("입력 오류");
			break;
		}

		sc.close();
	}

	public void practice11() {
		Scanner sc = new Scanner(System.in);

		System.out.print("비밀번호 입력(1000~9999) : ");
		int pw = sc.nextInt();

		int a, b, c, d;

		if (pw >= 1000 && pw <= 9999) {
			a = pw / 1000;
			b = pw % 1000 / 100;
			c = pw % 100 / 10;
			d = pw % 10;

			if (a != b && b != c && c != d && d != a) {
				System.out.println("성공");
			} else {
				System.out.println("실패");
			}
		} else {
			System.out.println("자리수 안맞음");
		}

		sc.close();
	}

}
