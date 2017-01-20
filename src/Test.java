import java.util.*;
import java.math.*;

public class Test {
	
	public static void main(String[] args) {
		int[][] arrInt = {{1, 2, -3, 4, -5, 6}, {7, -8, 9}};
		for (int[] item : arrInt) {
			for (int item2 : item) {
				System.out.print(item2 + " ");
			}
			System.out.println();
		}
		System.out.println();
		invert(arrInt);
		for (int[] item : arrInt) {
			for (int item2 : item) {
				System.out.print(item2 + " ");
			}
			System.out.println();
		}
		System.out.println("-------------------------");
		// ---------------------------------------------------------------
		System.out.println(max(5, 10));
		System.out.println("-------------------------");
		// ---------------------------------------------------------------
		System.out.println(maxOfThree(12, 2, 45));
		System.out.println("-------------------------");
		// ---------------------------------------------------------------
		System.out.println(maxOfFive(2, 8, 12, -5, 0));
		System.out.println("-------------------------");
		// ---------------------------------------------------------------
		char[] arrCh = {'a', 'b', 'c', 'd', 'e', 'f'};
		System.out.println(toString(arrCh));
		System.out.println("-------------------------");
		// ---------------------------------------------------------------
		char[] targ = {'w', 'v', 't', 't', 'm', 'u', 'i', 'y', 'h', 'i', 'u', 'y'};
		char[] ser = {'t', 't'};
		System.out.println(isExist(targ, ser));
		System.out.println("-------------------------");
		// ---------------------------------------------------------------
		int[] arrInt2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(findFirst(arrInt2, 5));
		System.out.println("-------------------------");
		// ---------------------------------------------------------------
		System.out.println(findFirst(arrInt2, 8));
		System.out.println("-------------------------");
		// ---------------------------------------------------------------
		System.out.println(findFirstReverse(arrInt2, 8));
		System.out.println("-------------------------");
		// ---------------------------------------------------------------
		System.out.println("factor= " + factor(4));
		System.out.println("-------------------------");
		// ----------------------------------------------------------------
		System.out.println(isVis(2020));
		System.out.println("-------------------------");
		// ----------------------------------------------------------------
		System.out.println("--------Is Exist-----------------");
		String[] s1 = {"12345", "abcdef", "qwerty"};
		System.out.println(isExist(s1, "34"));
		System.out.println("-------------------------");
		// ----------------------------------------------------------------
		int[] a1 = {1, 12, 3, 4, 4, 90, 7, 32, 9};
		findMultiple(a1, 4);
		System.out.println("-------------------------");
		// ----------------------------------------------------------------
		print(4.45756758);
		System.out.println("-------------------------");
		// ----------------------------------------------------------------
		System.out.println("----------Sort desc---------------");
		sortDesc(a1);
		for (int i : a1) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("-------------------------");
		// ----------------------------------------------------------------
		System.out.println("----------Sort asc---------------");
		int[] a2 = {1, 12, 3, 4, 4, 90, 7, 32, 9};
		sortAsc(a2);
		for (int i : a2) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("-------------------------");
		// ----------------------------------------------------------------
		int[] a3 = {2, 55, 13, 567, 87, 9, 0, 345, 5};
		sortDirection(a3, false);
		for (int i : a3) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("-------------------------");
		// ----------------------------------------------------------------
		byte[] b1 = {1, 2, 3, 4, 5, 6, 8, 7, 8, 9};
		System.out.println(isDuplExist(b1));
		System.out.println("-------------------------");
		// ----------------------------------------------------------------
		int[] c = multiply(a1, a2);
		for (int i : c) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("-------------------------");
		// ----------------------------------------------------------------
		System.out.println("--------Reversing array-----------------");
		int[] c2 = {2, 55, 13, 567, 87, 9, 0, 345, 5};
		int[] c3;
		c3 = reverse(c2);
		for (int i : c3) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("-------------------------");
		// ----------------------------------------------------------------
		int[] ar = generate(4, 4);
		for (int i : ar) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("-------------------------");
		// ----------------------------------------------------------------
		int[] ar2 = generate(12, 4, 16);
		for (int i : ar2) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("-------------------------");
		// ----------------------------------------------------------------
		System.out.println(isContains("sabCJWBC@svfdvb.evgbaegbtr."));
		System.out.println("-------------------------");
		// ----------------------------------------------------------------
		System.out.println("--------String reversing-----------------");
		String s2 = "abcdefghj";
		System.out.println(s2);
		System.out.println(reverse(s2));
		System.out.println("-------------------------");
		// ----------------------------------------------------------------
		int[] a4 = {1, 2, 3, 4, 5, 6};
		int[] a5 = {7, 8, 9, 0};
		int[] ar3 = concat(a4, a5);
		for (int i : ar3) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("-------------------------");
		// ----------------------------------------------------------------
		System.out.println(max(a4));
		
		
	}
	
	public static void print(char[] c) {
		System.out.println(c);
	}
	
	public static void print(String[][] strArr) {
		for (String[] item : strArr) {
			for (String item2 : item) {
				System.out.println(item2);
			}
		}
	}
	
	public static char[][] toCharArr(int[][] numb) {
		
		char[][] outArr = new char[numb.length][];
		for (int i = 0; i < numb.length; i++) {
			for (int y = 0; y <= numb[i].length - 1; y++) {
				outArr[i][y] = (char) numb[i][y];
			}
		}
		return outArr;
	}
	
	public static void invert(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] *= -1;
			}
		}
	}
	
	public static int max(int a, int b) {
		return (a >= b) ? a : b;
	}
	
	public static int maxOfThree(int a, int b, int c) {
		return max(max(a, b), c);
	}
	
	public static int maxOfFive(int a, int b, int c, int x, int y) {
		return max(max(max(max(a, b), c), x), y);
	}
	
	public static String toString(char[] arr) {
		String temp = "";
		for (char c : arr) {
			temp += c;
		}
		return temp;
	}
	
	public static boolean isExist(char[] target, char[] search) {
		String targetS = toString(target);
		String searchS = toString(search);
		return targetS.contains(searchS);
	}
	
	public static int findFirst(int[] target, int find) {
		int temp = -1;
		for (int i = 0; i < target.length; i++) {
			if (find == target[i]) {
				temp = i;
				break;
			}
		}
		return temp;
	}
	
	public static int findFirstReverse(int[] target, int find) {
		int temp = -1;
		for (int i = target.length - 1; i >= 0; i--) {
			if (find == target[i]) {
				temp = i + 1;
				break;
			}
		}
		return temp;
	}
	
	public static int factor(int a) {
		return (a == 1) ? 1 : a * factor(a - 1);
	}
	
	//	Другими словами, год является високосным в двух случаях: либо он кратен 4, но при этом не кратен 100, либо кратен 400. 
	// Год не является високосным, если он не кратен 4, либо он кратен 100, но при этом не кратен 400
	public static boolean isVis(int year) {
		boolean res = false;
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 != 0)) {
			res = true;
		}
		if ((year % 4 != 0) || ((year % 100 == 0) && (year % 400 != 0))) {
			res = false;
		}
		return res;
	}
	
	public static boolean isExist(String[] target, String search) {
		boolean cond = false;
		for (int i = 0; i < target.length; i++) {
			if (target[i].length() == search.length()) {
				char[] chars1 = target[i].toCharArray();
				char[] chars2 = search.toCharArray();
				for (int j = 0; j < target[i].length(); j++) {
					if (chars1[j] == chars2[j]) {
						cond = true;
					}
					else {
						cond = false;
						break;
					}
				}
				if (cond) {
					break;
				}
			}
		}
		return cond;
	}
	
	public static void findMultiple(int[] target, int divider) {
		for (int elem : target) {
			if ((elem % divider) == 0) {
				System.out.print(elem + " ");
			}
		}
		System.out.println();
	}
	
	public static void print(double d) {
		System.out.printf("%.3f%n", d);
	}
	
	public static void sortAsc(int[] array) {
		boolean cond = false;
		int max;
		int iMax = 0;
		int tMax;
		int last = array.length - 1;
		
		do {
			max = array[0];
			tMax = max;
			for (int i = 0; i <= last; i++) {
				max = max(array[i], max);
				//Finding index of max value
				if (tMax != max) {
					iMax = i;
					tMax = max;
				}
			}
			array[iMax] = array[last];
			array[last] = max;
			last--;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] <= array[i + 1]) {
					cond = true;
				}
				else {
					cond = false;
					break;
				}
			}
		}
		while (cond == false);
	}
	
	public static void sortDesc(int[] array) {
		boolean cond = false;
		int max;
		int tMax;
		int iMax = 0;
		int first = 0;
		do {
			max = array[first];
			tMax = max;
			for (int i = first; i < array.length; i++) {
				max = max(array[i], max);
				//Finding index of max value
				if (tMax != max) {
					iMax = i;
					tMax = max;
				}
			}
			array[iMax] = array[first];
			array[first] = max;
			first++;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] >= array[i + 1]) {
					cond = true;
				}
				else {
					cond = false;
					break;
				}
			}
		}
		while (cond == false);
	}
	
	public static void sortDirection(int[] array, boolean direction) {
		if (direction) {
			sortDesc(array);
		}
		else {
			sortAsc(array);
		}
	}
	
	public static boolean isDuplExist(byte[] array) {
		boolean cond = false;
		
		for (int i = 1; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if ((array[i] == array[j]) && (i != j)) {
					cond = true;
					break;
				}
			}
			if (cond) {
				break;
			}
		}
		return cond;
	}
	
	public static int[] multiply(int[] a, int[] b) {
		int[] res = new int[a.length];
		for (int i = 0; i < res.length; i++) {
			res[i] = a[i] * b[i];
		}
		return res;
	}
	
	public static int[] reverse(int[] array) {
		int temp;
		int first = 0;
		int last = array.length - 1;
		
		do {
			temp = array[last];
			array[last] = array[first];
			array[first] = temp;
			first++;
			last--;
		}
		while (first <= last);
		
		return array;
	}
	
	public static int[] generate(int size, int hlimit) {
		int[] array = new int[size];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(hlimit);
		}
		return array;
	}
	
	public static int[] generate(int size, int llimit, int hlimit) {
		int[] array = new int[size];
		Random rand = new Random();
		array = rand.ints(size, llimit, hlimit).toArray();
		return array;
	}
	
	public static boolean isContains(String str) {
		int countAt = 0;
		int countPoint = 0;
		
		char[] temp = str.toCharArray();
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] == '@') {
				countAt++;
			}
			if (temp[i] == '.') {
				countPoint++;
			}
		}
		
		return ((countAt == 1) && (countPoint > 0));
	}
	
	public static String reverse(String str) {
		char[] tempArr = str.toCharArray();
		char temp;
		int first = 0;
		int last = tempArr.length - 1;
		
		do {
			temp = tempArr[last];
			tempArr[last] = tempArr[first];
			tempArr[first] = temp;
			first++;
			last--;
		}
		while (first <= last);
		
		return new String(tempArr);
	}
	
	public static int[] concat(int[] a, int[] b) {
		int[] c = new int[a.length + b.length - 1];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			c[a.length - 1 + i] = b[i];
		}
		return c;
	}
	
	public static int max(int[] array) {
		int temp = array[0];
		for (int i = 0; i < array.length; i++) {
			temp = max(temp, array[i]);
		}
		return temp;
	}
	
	
}
