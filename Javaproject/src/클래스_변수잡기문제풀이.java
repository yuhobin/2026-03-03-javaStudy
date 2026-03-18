
class Movie {
	String title;
	String regDate;
	String genre;
	String grade;
	String runningTime;
	String starPoint;
	String ranking;
}
class News {
	int no;
	String title;
	String reporterName;
	String Date;
	static String compony;
	
}
class Restraunt {
	String name;
	String address;
	String phonenumber;
	String categori;
	String price;
	boolean parking;
	String time;
	String[] menu;
	
}
class Recipe{
	String title;
	String name;
	String starScore;
	int reviewCount;
	int view;
	
}
class MusicRanking{
	int no;
	String title;
	String singer;
	String album;
	int like;
}

class Market {
	int discountRate;
	String[] product;
	int price;
}
class Theater {
	String title;
	String genre;
	String date;
	String place;
	String[] cast;
	String grade;
	int runningTime;
	
}
public class 클래스_변수잡기문제풀이 {
	private static final boolean flase = false;

	public static void main(String[] args) {
		News n1 = new News();
		System.out.println("n1:"+n1);
		n1.no=1;
		n1.title="올해 최고의 블록버스터...";
		n1.reporterName="조지영";
		n1.Date="2022.05.19";
		n1.compony="sportChosun";
		
		System.out.println(n1.no);
		System.out.println(n1.title);
		System.out.println(n1.reporterName);
		System.out.println(n1.Date);
		System.out.println(n1.compony);
		
		News n2 = new News();
		System.out.println("n2:"+n2);
		n2.no=2;
		n2.title="헤어질결심...";
		n2.reporterName="조지영";
		n2.Date="2022.05.19";
		n2.compony="sportChosun";
		
		System.out.println(n2.no);
		System.out.println(n2.title);
		System.out.println(n2.reporterName);
		System.out.println(n2.Date);
		System.out.println(n2.compony);
		
		Restraunt r = new Restraunt();
		r.name = "미라이";
		r.address = "서울특별시 강남구 논현로153길 24 끌레르빌 1F";
		r.phonenumber = "02-540-0934";
		r.categori = "이자카야/오뎅/꼬치";
		r.price = "3만원~4만원";
		r.parking = (flase);
		r.time = "18:00-01:00";
		
		
		System.out.println(r.name);
		System.out.println(r.address);
		System.out.println(r.phonenumber);
		System.out.println(r.categori);
		System.out.println(r.price);
		System.out.println(r.parking);
		System.out.println(r.time);
		
		
		
	}
}
