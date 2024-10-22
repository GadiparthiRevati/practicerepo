package stringsConcept;

public class ReverseANumUsingStringBuffer {
	public static void main(String[] args) {
		int num=123456;
		System.out.println(new StringBuffer(String.valueOf(num)).reverse());
	}

}
