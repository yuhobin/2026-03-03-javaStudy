package com.sist.lang;
import java.util.*;
public class 날짜_시간_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 년도 / 월 / 일 => 입력 => 요일
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:");
		int year=scan.nextInt();
		
		System.out.print("월 입력:");
		int month=scan.nextInt();

		System.out.print("일 입력:");
		int day=scan.nextInt();
		
		// setting
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1); // month는 처음에 0부터 시작이라 -1해줘야함
		cal.set(Calendar.DATE, day);
		
		String[] strWeek= {"","일","월","화","수","목","금","토"}; // week는 1번부터 시작이라 ""처음에 넣어줘야함
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(strWeek[week]+"요일");
		
	}

}
