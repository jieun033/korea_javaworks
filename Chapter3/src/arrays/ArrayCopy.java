package arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		int arr1[] = {10, 20, 30, 40};
		int arr2[] = new int[4];
		
		// arr1 출력
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		// arr1을 arr2에 복사 후 출력
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		// arr1을 arr2에 역순으로 복사 후 출력
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[3-i];
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}

}
