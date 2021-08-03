import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		for(int i = 0; i < 10000; i++) {
			numbers.add(i + 1);
		}
		
		ArrayList<Integer> list1 = new ArrayList<>(numbers.subList(0, 2500));
		ArrayList<Integer> list2 = new ArrayList<>(numbers.subList(2500, 5000));
		ArrayList<Integer> list3 = new ArrayList<>(numbers.subList(5000, 7500));
		ArrayList<Integer> list4 = new ArrayList<>(numbers.subList(7500, 10000));
		
		ArrayList<Integer> oddList = new ArrayList<>();
		ArrayList<Integer> evenList = new ArrayList<>();
		
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i < list1.size(); i++) {
					System.out.println(Thread.currentThread().getName());
					if(list1.get(i) % 2 == 0)
						synchronized (evenList) {
							evenList.add(list1.get(i));							
						}
					else
						synchronized (oddList) {
							oddList.add(list1.get(i));
						}
				}
			}
		}, "Thread-1");
		
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i < list2.size(); i++) {
					System.out.println(Thread.currentThread().getName());
					if(list1.get(i) % 2 == 0)
						synchronized (evenList) {
							evenList.add(list1.get(i));							
						}
					else
						synchronized (oddList) {
							oddList.add(list1.get(i));
						}
				}
			}
		}, "Thread-2");
		
		Thread thread3 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i < list3.size(); i++) {
					System.out.println(Thread.currentThread().getName());
					if(list1.get(i) % 2 == 0)
						synchronized (evenList) {
							evenList.add(list1.get(i));							
						}
					else
						synchronized (oddList) {
							oddList.add(list1.get(i));
						}
				}
				
			}
		}, "Thread-3");
		
		Thread thread4 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i < list4.size(); i++) {
					System.out.println(Thread.currentThread().getName());
					if(list1.get(i) % 2 == 0)
						synchronized (evenList) {
							evenList.add(list1.get(i));							
						}
					else
						synchronized (oddList) {
							oddList.add(list1.get(i));
						}
				}
				
			}
		}, "Thread-4");
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("EvenList size: " + evenList.size());
		System.out.println(evenList);
		System.out.println("OddList size: " + oddList.size());
		System.out.println(oddList);
		System.out.println("Total size: " + (evenList.size() + oddList.size()));
	}
}
