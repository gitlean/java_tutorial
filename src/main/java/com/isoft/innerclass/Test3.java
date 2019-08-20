package com.isoft.innerclass;

/**
 * @author john
 * @createTime 2019年8月16日 下午1:11:02
 * @describe 静态内部类
 */
class BOuter {
	private String name = "test";
	public static int age = 20;

	static class BInner {
		public static int num = 10;

		public void fun() {
			// System.out.println(name);
			System.out.println(age);
		}
	}
}

public class Test3 {
	public static void main(String[] args) {

		BOuter.BInner in = new BOuter.BInner();
		in.fun();
	}
}

