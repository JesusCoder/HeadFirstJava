package miscClasses.headFirstJava;
/**

 * This is small fun program that I wrote to help myself to refresh things I learned in Head First in Java, chapter 16.*/
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class SortGirlfriends {
	
	LinkedList<Girlfriend> girfriendList = new LinkedList<Girlfriend>();

	class Girlfriend {
		String name;
		int order;
		public String toString(){
			return name + " is the number " + order + " that entered my life.\t";
		}
		public Girlfriend(String name, int order) {
			this.name = name;
			this.order = order;
		}
	}
	
	class NameComparator implements Comparator<Girlfriend>{
		@Override
		public int compare(Girlfriend o1, Girlfriend o2) {
			return o1.name.compareTo(o2.name);
		}
	}
	
	class OrderComparator implements Comparator<Girlfriend>{
		@Override
		public int compare(Girlfriend o1, Girlfriend o2) {
			return o1.order - o2.order;
		}
	}
	
	public void go(){
		Girlfriend jiangBei = new Girlfriend("jiangBei", 0);
		Girlfriend chengMT = new Girlfriend("chengMT", 1);
		Girlfriend qiangWY = new Girlfriend("qiangWY", 2);
		girfriendList.add(chengMT);
		girfriendList.add(jiangBei);
		girfriendList.add(qiangWY);
		
		System.out.println("As entered: " + girfriendList);
		
		NameComparator nc = new NameComparator();
		Collections.sort(girfriendList, nc);
		System.out.println("After sorting by name: " + girfriendList);
		
		OrderComparator oc = new OrderComparator();
		Collections.sort(girfriendList, oc);
		System.out.println("After sorting by order: " + girfriendList);
	}
	
	public static void main(String[] args) {
		new SortGirlfriends().go();
	}
}
