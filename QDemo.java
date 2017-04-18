class Queue {
	private int[] arr;
	public int length;
	// the i variable keeps track of the number of pushes, 
	// j keeps track of the number of pops
	private int i, j;

	Queue(int size) {
		arr = new int[size];
		length = size;
		i = j = 0;
	}

	public boolean push(int x) {
		if (i < length) {
			arr[i] = x;
			i += 1;
			printer();
			return true;
		}
		return false;
	}

	public int pop() {
		if (i > 0 && j < i) {
			return arr[j++];
		}
		return -1;
	}

	public void printer() {
		for (int x: arr) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
}

class QDemo {
	public static void main(String[] args) {
		Queue array = new Queue(5); 
		array.printer();
		array.push(4);
		array.push(5);
		array.push(6);
		// array.push(7);
		// array.push(8);
		// array.push(9);

		System.out.println(array.pop());
		System.out.println(array.pop());
		System.out.println(array.pop());
		System.out.println(array.pop());
		System.out.println(array.pop());
		System.out.println(array.pop());

		array.push(7);
		array.push(8);
		array.push(9);

		System.out.println(array.pop());
		System.out.println(array.pop());
		System.out.println(array.pop());
		System.out.println(array.pop());
		System.out.println(array.pop());
		System.out.println(array.pop());

	}
}