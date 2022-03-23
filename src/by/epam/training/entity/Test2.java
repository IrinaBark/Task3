package by.epam.training.entity;

public class Test2 {
	
	private int counter;
	private int[] range = new int[2];

	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		if (counter >= range[0] && counter <= range[1]) {
			this.counter = counter;
		} else {
			throw new RuntimeException ("Counter value is out of range!");
		}
	}
	public int[] getRange() {
		return range;
	}
	public void setRange(int[] range) {
		this.range = range;
	}
	public Test2 () {
		range[0] = 0;
		range[1] = 10;
		counter = (range[0] + range[1]) / 2;
	}
	public Test2 (int min, int max) {
		if (min > max) {
			range[0] = max;
			range[1] = min;
		} else if (min == max){
			throw new RuntimeException ("Range is zero!");
		} else {
			range[0] = min;
			range[1] = max;
		}
		counter = (range[0] + range[1]) / 2;
	}
	public void increase() {
		if (counter >= range[1]) {
			throw new RuntimeException("Ñounter value is out of range!");
		} 
		counter++;
	}
	public void decrease() {
		if (counter <= range[0]) {
			throw new RuntimeException("Ñounter value is out of range!");
		} 
		counter--;
	}
	public void print() {
		System.out.println("Current state of the counter - " + counter + "!");
	}

}
