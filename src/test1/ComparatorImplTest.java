package test1;

import org.junit.jupiter.api.Test;

class ComparatorImplTest /*extends ComparatorImpl*/ {

	@Test
	void test() {
		//		Comparator<String> c = (s1, s2) -> s1.compareTo(s2);
		//		System.out.println(c.compare("ABC", "DEF")); // → -1が表示される

		//		static void lambdaMethod(Comparator<String> c) {
		//	        System.out.println(c.compare("ABC", "DEF"));
		//	    }

		//順を追って、ComparatorImplクラスをラムダ式にしていく
		//ローカルクラスの段階
		//		class ComparatorImpl implements Comparator<String> {
		//			public int compare(String s1, String s2) {
		//				return s1.compareTo(s2);
		//			}
		//		}
		//
		//		Comparator<String> c = new ComparatorImpl();
		//		System.out.println(c.compare("a", "b"));

		//匿名クラスの段階
		//		Comparator<String> c = new Comparator<String>(){
		//			public int compare(String s1, String s2) {
		//				return s1.compareTo(s2);
		//			}
		//		};
		//
		//		System.out.println(c.compare("a", "b"));

		//最後、匿名クラスからラムダ式へ
		//		Comparator<String> c = /*new*/ /*Comparator<String>()*/ /*{*/
		//			/*public*/ /*int*/ /*compare*/(/*String*/ s1, /*String*/ s2) /*{*/
		//				/*return*/ s1.compareTo(s2)/*;*/
		//			/*}*/
		//		/*}*/;

		//「->」引数と抽象メソッドの間に入れれば完成！
		//		Comparator<String> c = (s1, s2) -> s1.compareTo(s2);
		//
		//		System.out.println(c.compare("a", "b"));

		//ラムダ式の使い方
		//１．引数に関数型インターフェースを持つメソッドに入れられる
		lamdaMethod((s1, s2) -> s1.compareTo(s2));

	}

	static void lamdaMethod(Comparator<String> c) {
		System.out.println(c.compare("a", "b"));
	}

}
