package oop;

class Counter {
	private int value;

	public Counter() {
		this.value = 0;
	}

	public Counter(int value) {
		this.value = value;
	}

	public void increment() {
		this.value++;
	}

	public void increment(int step) {
		this.value += step;
	}

	public void decrement() {
		this.value--;
	}

	public void decrement(int step) {
		this.value -= step;
	}

	public int getValue() {
		return this.value;
	}
}

public class TestCounter {

	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter(100);

		c1.increment();
		c2.increment(5);

		System.out.println(c1.getValue());
		System.out.println(c2.getValue());

	}

}
