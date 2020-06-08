package test1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class UseDay {

	public static void main(String[] args) {
		Map<Integer, Day> map = new HashMap<Integer, Day>();
		map.put(1000, new Day(1000, 1, 1));
		map.put(2000, new Day(2000, 2, 2));

		List<Day> list = new LinkedList<Day>();
		list.add(new Day(1000, 1, 1));
		list.add(new Day(2000, 2, 2));

		//		//Day d = (Day) list; これはできない
		//		for (int i = 0; i < list.size(); i++) {
		//			//if (list.year == 2000) { listはオブジェクトのフィールドを操作できない。
		//			if (d.year == 2000) {
		//				System.out.println("month:" + d.month + " date:" + d.date);
		//			}
		//		}

		//指定のデータを参照_拡張for文でlistを使う場合
		for (Day dlist : list) {
			if (dlist.year == 2000) {
				System.out.println("month:" + dlist.month + " date:" + dlist.date);
			}
		}

		//指定のデータを参照_for文でlistを使う場合
		for (int i = 0; i < list.size(); i++) {
			Day dlist;
			dlist = list.get(i);
			if (dlist.year == 2000) {
				System.out.println("month:" + dlist.month + " date:" + dlist.date);
			}
		}

		//指定のデータを参照_mapを使う場合
		Day dmap = map.get(2000);
		System.out.println("month:" + dmap.month + " date:" + dmap.date);
	}

}
