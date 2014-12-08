package stringBufferTest;

public class StringBufferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * StringBuffer4种构造函数
		 * StringBuffer()
		 * StringBuffer(int size)
		 * StringBuffer(String str)
		 * StringBuffer(CharSequence chars)
		 */
		/**
		 * change
		 */
		StringBuffer sb=new StringBuffer("hello");
		
		int capacity=sb.length();
		System.out.println(sb.substring(1));
	}

}
