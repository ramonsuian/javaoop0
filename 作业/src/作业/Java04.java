package 作业;

public class Java04 {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 100) {
			int k = i % 2;
			int p = i % 10;
			if (k == 0) {
				System.out.print(i + "\t"); // t字表符

			}
			if (p == 0) {
				System.out.println("");
			}
			i++;//增量 不输入就无限输出。
		}

	}
}
