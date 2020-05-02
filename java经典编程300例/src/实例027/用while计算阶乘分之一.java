package 实例027;

import java.math.BigDecimal;

public class 用while计算阶乘分之一 {

	public static void main(String[] args) {
		BigDecimal sum = new BigDecimal(0.0);
		BigDecimal factorial = new BigDecimal(1.0);
		int i = 1;
		while (i <= 20) {
			sum = sum.add(factorial);
			++i;
			factorial = factorial.multiply(new BigDecimal(1.0 / i));
		}
		System.out.println(sum);
	}
}
