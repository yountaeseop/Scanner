package Java2021_10_19_Scannernote;

import java.util.Scanner;

public class Scanner_note {

	public static void main(String[] args) {
	
	// 아무것도 없을때 import문 만들려고 단축키 눌러도 안된다.
	// Scanner 클래스 객체를 생성한 뒤에 단축키를 누르자!
	// import문 단축키 ctrl+shift+O(영어 대문자O)
		
	Scanner sc = new Scanner(System.in);
	
//	int age = sc.nextInt();// 입력받은 정수를 변수
//	  					   // age에 저장!!!!
//	
//	// 문자로 받고 싶으면 nextLine()		
//    // 숫자로 받고 싶으면 nextInt()
//	// 입력받는 데이터 타입이 정수가 아니라 
//	// 실수형일 경우에는 nextDouble()
//
//    System.out.println(age+"살 입니다.");
	
//	System.out.println("---------------------------------");
//	
//	
//	
//	while(true) { // while()안에 true를 넣으면 무한반복
//		
//			System.out.println("원하는 단수를 입력해주세요(0을 누르면 종료):");
//			int dan = Integer.parseInt(sc.nextLine());
//			
//			// 여기서 왜 Integer.parseInt가 오는건지 모르겠다.
//	        		
	//      단은 스트링인데 넣을려는건 인트이기 때문에Integer.parseInt로
	// 		스트링을 인트로 변환해준다.
	//		String dan = sc.nextLine(); //변환이전 코드 
	//		
	//      분명 입력하는건 숫자인데 왜 Int로 쓰지않고 Line으로 
	//		쓰는 것이냐!! Int랑 Line이랑 섞어서 쓰면 오류가날수 있기 때문에
	// 		차라리 하나로 통일 Line으로 통일하고 Integer.parseInt으로 
	//  	형변환을 하는 것이다!!!!!!!!!! 
	
	
//			if (dan == 0) {
//				System.out.println("프로그램 종료");
//				break;
//			}
//			for(int gop = 1; gop <= 9; gop++) {
//				System.out.println(dan +"x"+ gop +"="+ dan*gop);
//				
//			}
//		}

	while(true) {
		
		System.out.println("원하는 기능을 선택해주세요.");
		System.out.println("(1. 더하기, 2. 빼기, 3. 곱하기, 4. 나누기, 5. 종료) :");
		int str = Integer.parseInt(sc.nextLine());
		
		if(str == 5) {
			System.out.println("프로그램 종료");
			break;
		}
		
		System.out.println("첫번째 숫자를 입력해주세요 :");
		int a = Integer.parseInt(sc.nextLine());
		
		System.out.println("두번째 숫자를 입력해주세요 :");
		int b = Integer.parseInt(sc.nextLine());
		
		
		if(str == 1) {
			System.out.println(a + b);
		}
		else if(str == 2) {
			System.out.println(a - b);
}
		else if(str == 3) {
			System.out.println(a * b);
}
		else if(str == 4) {
			System.out.println(a % b);
}
		
		
		
	}
	
	
	
	
	
	
	}

}
