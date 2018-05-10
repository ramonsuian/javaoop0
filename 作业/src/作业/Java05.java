package 作业;

public class Java05 {

	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {

			for (int j = 1; j <=i; j++) {
				int a = j * i;

				System.out.print(j + "*" + i + "=" + a + " ");
				if (j == i) {
					System.out.println(" ");
				}

			}

		}
	}

}
