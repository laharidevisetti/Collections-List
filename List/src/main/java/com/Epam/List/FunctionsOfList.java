package com.Epam.List;

import java.util.ArrayList;

public class FunctionsOfList {
	ArrayList<Integer> list;
	FunctionsOfList(){
		list = new ArrayList<Integer>();
		int TempElements[] = {100,200, 300, 400, 500, 600, 700, 800, 900, 1000};
		for(int i = 0;i < 10; i++)
			list.add(TempElements[i]);
	}
	public ArrayList<Integer> addElement(int number){
		 list.add(number);
		 return list;
	}
	public ArrayList<Integer> deleteElement(int pos){
		list.remove(pos+1);
		return list;
	}
	public int fetchElement(int ind) {
		return list.get(ind+1);
	}
	public void print(){
		for(int i = 0;i < list.size(); i++)
			System.out.print(list.get(i)+" ");
		System.out.println();
	}

}
