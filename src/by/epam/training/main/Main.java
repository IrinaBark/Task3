package by.epam.training.main;

import by.epam.training.entity.Test2;

public class Main {
	public static void main(String[] args) {

		Test2 test2 = new Test2(50, 20);

		for (int i = test2.getCounter(); i < test2.getRange()[1]; i++) {
			test2.increase();
			test2.print();
		}

		System.out.println();

		for (int i = test2.getCounter(); i > test2.getRange()[0]; i--) {
			test2.decrease();
			test2.print();
		}

	}

}


