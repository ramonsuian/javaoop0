package 作业;

public class JieCheng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1;

		for (int i = 10; i >= 1; i--) {
			a *= i;
		}
		System.out.println(a);

		// 调用自己的方法：
		System.out.println("----------------递归----------------");
        System.out.println(fac(5));
	}
          public static long fac (int f) {
			if(f==1) {
				return 1;
			}else {
				return f*fac(f-1);
			}
		}
}
