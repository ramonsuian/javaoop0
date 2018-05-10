package 作业;

public class Java04 {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 100) {
			int k = i % 2; // i%2 !=0 奇数.
			int p = i % 10;
			if (k == 0) {
				System.out.print(i + "\t"); // t字表符

			}
			if (p == 0) {
				System.out.println("");
			}
			i++;// 增量 不输入就无限输出。
		}
		System.out.println("-------------------------------------");

		int c = 0;
		int u =0;
		while (c <= 100) {
			if (c % 2 == 0) {
				System.out.println(c);
				u+=c;
			}
			c++;
		}
            System.out.println(+u);
	}

}
