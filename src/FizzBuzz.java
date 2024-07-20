
public class FizzBuzz {

	public static void main(String[] args) {
		// 1 ～ 100 までループ
		for (int i = 1; i <= 100; i++) {
            
			// 3 の余り、5 の余り を算出
			int a3 = i % 3;
			int a5 = i % 5;

			// 3、5 双方がゼロの場合、「FizzBuzz」を
			if ((a3 == 0) && (a5 == 0)) {
				System.out.println("FizzBuzz");
			} else if (a3 == 0) {
				// 3がゼロの場合、「Fizz」を
				System.out.println("Fizz");
			} else if (a5 == 0) {
				// 5がゼロの場合、「Buzz」を
				System.out.println("Buzz");
			} else {
				// 上記以外はそのまま出力
				System.out.println(i);
			}

		}

	}

}
