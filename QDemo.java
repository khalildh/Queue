class Queue {
	private int[] arr;
	private int i, j;

	Queue(int size) {
		arr = new int[size];
	}

	public boolean push(int x) {
		return true;
	}

	public int pop() {
		return 0;
	}

	public void printer() {
		for (int x: arr) {
			System.out.print(x + " ");
		}
	}
	
}

class QDemo {
	public static void main(String[] args) {
		Queue array = new Queue(5); 

		array.printer();
	}
}