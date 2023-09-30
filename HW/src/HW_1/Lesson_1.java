package HW_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Find the element that appears the most in the array.
 * (Tìm phần tử xuất hiện nhiều nhất trong mảng)
 * @author PC
 *
 */
public class Lesson_1 {

	public int Search(int[] arr) {//find large element
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		int[] brr = new int[max + 1];//create an array with length to max + 1

		for (int i = 0; i < arr.length; i++) {
//			System.out.println(Arrays.toString(arr) + "arr");
			brr[arr[i]] += 1;//tăng giá trị của mảng brr tại vị trí arr[i]
//			System.out.println(Arrays.toString(brr) + "brr");
		}
		int m = 0;
		int re = 0;
		for (int i = 0; i < brr.length; i++) {//find large element
			if (brr[i] > re) {
				re = brr[i];
				m = i;
			}
		}

		return m;
	}

	/*
	 * ======================================method
	 * 2==================================
	 */
	public int Searchz(int[] arr) {
		int count = 0;
		int key = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i : arr) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}
		//lưu vết bằng map
		for (Map.Entry<Integer, Integer> re : map.entrySet()) {
			if (re.getValue() >= count) {
				count = re.getValue();
				key = re.getKey();
			}
		}

		return key;

	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 1, 2, 3, 5, 1, 3, 5, 3 };
		int[] arr2 = { 1, 2, 3, 4, 1, 2, 4, 3, 5, 6, 5, 1 };
		Lesson_1 test = new Lesson_1();
		test.Search(arr);
		System.out.println(test.Search(arr));
		test.Searchz(arr2);
		System.out.println(test.Searchz(arr2));

	}
}