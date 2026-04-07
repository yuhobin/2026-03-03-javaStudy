package com.sist.user;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import com.sist.service.FoodService;
import com.sist.vo.FoodVO;
public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		FoodService fService=new FoodService();
		while(true) {
			System.out.println("=======Menu========");
			System.out.println("1. 목록");
			System.out.println("2. 상세보기");
			System.out.println("3. 검색(음식종류)");
			System.out.println("4. 검색(주소)");
			System.out.println("5. 종료");
			System.out.println("====================");
			System.out.println("메뉴 선택:");
			int menu=scan.nextInt();
			switch(menu) {
				case 5 -> {
					System.out.println("프로그램 종료");
					System.exit(0);
			}
				case 1 -> {
					System.out.print("페이지 입력:");
					int page=scan.nextInt();
					List<Optional<FoodVO>> fList=fService.food_list(page);
//					String result=fList.stream()
//									.flatMap(Optional::stream)
//									.map(v->v.getNo()+"."+v.getName())
//									.findAny()
//									
//					System.out.println(result);
					List<FoodVO> foods=fList.stream()
										.flatMap(Optional::stream)
										.toList();
					// List<Optrional<FoodVO>> ==> List<FoodVO>
					if(foods.isEmpty()) {
						System.out.println("데이터 없음");
					}
					else {
						foods.forEach(f->System.out.println(f.getNo()+"."+f.getName()));
					}
					/*if(fList!=null) {
					fList.stream()
							.forEach(food->System.out.println(
									food.getNo()+"."+food.getName()));
					}
					else {
						System.out.println("데이터가 없습니다");
					}*/
				}
				case 2 -> {
					System.out.println("상세 볼 맛집 번호:");
					int no=scan.nextInt();
					FoodVO vo=fService.food_detail(no);
					System.out.println(vo);
				}
				case 3 -> {
					System.out.println("한식,중식,양식,일식,분식:");
					String type=scan.next();
					List<FoodVO> list=fService.food_type_find(type);
					// 출력
					list.stream()
						.forEach(food->System.out.println(
								food.getName()+"("+food.getType()+")"));
				}
				case 4 -> {
					System.out.println("주소 입력:");
					String type=scan.next();
					List<FoodVO> list=fService.food_address_find(type);
					// 출력
					list.stream()
						.forEach(food->System.out.println(
								food.getName()+"("+food.getAddress()+")"));
				}
				default -> System.out.println("메뉴가 없습니다");
			}
			
		}
	}

}
