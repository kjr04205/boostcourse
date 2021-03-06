
public class ExceptionApp {

	public static void main(String[] args) {
		System.out.println(1);
		
		int[] scores = {10,20,30};
		
		//Exception 으로 예외처리 할 경우 모든 예외처리의 부모, 하위 catch문들 오류
		try {
			System.out.println(2);
			System.out.println(scores[4]);
			System.out.println(3);
			System.out.println(2/0);
			System.out.println(4);
		}catch(ArithmeticException e) {
			System.out.println("잘못된 계산입니다. : "+e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("이 배열의 길이는 "+scores.length + "입니다. 수정해주세요.");
		}
		
		System.out.println(5);
	}

}
