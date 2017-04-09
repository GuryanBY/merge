package com.es.kgd.test;

import java.util.ArrayList;

public class MergeForES {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();

		a.add(1);
		a.add(3);
		a.add(8);

		ArrayList<Integer> b = new ArrayList<>();
		b.add(1);
		b.add(6);
		b.add(7);

		for (Integer i : a) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
		for (Integer i : b) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
		merge(a, b);
		for (Integer i : a) {
			System.out.print(i + " ");
		}

	}

	public static void merge(ArrayList<Integer> a, ArrayList<Integer> b) {

		int n = a.size();
		int m = b.size();
		ArrayList<Integer> result = new ArrayList<>(n + m);

		int i = 0;
		int j = 0;
		int index = 0;

		while (i < n && j < m) {

			if (a.get(i).compareTo(b.get(j)) < 0) {
				result.add(index, a.get(i));
				i++;
			} else {
				result.add(index, b.get(j));
				j++;
			}

			index++;
		}

		while (i < n) {

			result.add(index, a.get(i));
			index++;
			i++;
		}

		while (j < m) {
			result.add(index, b.get(j));
			index++;
			j++;
		}
		a.clear();
		a.addAll(result);

	}

}
