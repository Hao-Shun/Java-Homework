//哲學二 03113041 劉浩萱
import java.util.Scanner;

public class C1_03113041 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 請使用者輸入停車小時
		System.out.println("輸入停車小時數:");
		int hr = input.nextInt();
		int expense = 0;
		// 判斷小時數和費用
		if (hr == 1) {
			expense = +30;
			System.out.printf("停車費用 =%d元", expense);
		} else if (hr == 2 || hr == 3) {
			expense = 30;
			for (int i = 2; i <= hr; i++) {
				expense = +40;
			}
			System.out.printf("停車費用 =%d元", expense);
		} else if (hr == 4 || hr == 5) {
			expense = 110;
			for (int i = 4; i <= hr; i++) {
				expense = +50;
			}
			System.out.printf("停車費用 =%d元", expense);
		} else if (hr >= 6) {
			expense = 210;
			for (int i = 6; i <= hr; i++) {
				expense = +60;
			}
			System.out.printf("停車費用 =%d元", expense);
		}
	}
}

// 下面寫錯了Q_Q
/*
 * if(hr >= 1){ expense =+ 30; if(hr >= 2 && hr <= 3){ for(int i = 2; i <= hr;
 * i++){ expense =+ 40; } if(hr >= 4 && hr <= 5){ for(int i = 4; i <= hr; i++){
 * expense =+ 50; } if(hr >= 6){ for(int i = 6; i <= hr; i++){ expense =+ 60; }
 * } } }
 * 
 * } System.out.println("停車費用:" +expense); } }
 */

