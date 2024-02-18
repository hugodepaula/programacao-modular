
public class Programa03 {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 20, 4, 0, 99, 45, 66, -9};
		int min = arr[0];
		
		for (int i = 1;  i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println("O menor número é: " + min);
	}

}
