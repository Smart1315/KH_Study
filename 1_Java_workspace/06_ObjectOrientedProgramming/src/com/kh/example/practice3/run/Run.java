package com.kh.example.practice3.run;

import com.kh.example.practice3.model.vo.Circle;

public class Run {

	public static void main(String[] args) {
		Circle c = new Circle();
		
		System.out.println("������ 1 ���� ���� ���� �� �ѷ�");
		c.getAreaOfCircle();
		c.getSizeOfCircle();
		
		c.incrementRadius();
		
		System.out.println("������ 1 ���� ���� ���� �� �ѷ�");
		c.getAreaOfCircle();
		c.getSizeOfCircle();
		
	}

}
