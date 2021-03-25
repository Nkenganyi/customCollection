package customMethods;

import java.util.Arrays;

public class JtQueue<T> implements Queueable<T> {

	private T[] myArr;
	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public JtQueue() {
		myArr = (T[]) new Object[1];
	}

	@Override
	public boolean add(T o) {
		// TODO Auto-generated method stub

		for (int a = 0; a < myArr.length; a++) {
			if (myArr[a] == null) {
				myArr[a] = o;
				break;
			}

			if (a == myArr.length - 1) {
				myArr = increase(myArr);

				myArr[a + 1] = o;
				myArr[a + 1] = null;

			}

		}

		return o == null ? false : true;
	}

	@Override
	public String toString() {
		return "JtQueue [arrays=" + Arrays.toString(myArr) + "]";
	}

	@Override
	public boolean offer(T o) {
		// TODO Auto-generated method stub
		return add(o);
	}

	@Override
	public T remove() {
		// TODO Auto-generated method stub
		T retrieve = null;

		if (myArr[0] != null) {
			T[] temp = (T[]) new Object[myArr.length - 1];
			this.setSize(temp.length);
			retrieve = myArr[0];
			for (int r = 0; r < myArr.length - 1; r++) {
				temp[r] = myArr[r + 1];
			}
			myArr = temp;
		}

		return retrieve;
	}

	public T remove(int index) {

		T retrieve = null;
		if (myArr[index] != null) {
			T[] temp = (T[]) new Object[myArr.length - 1];
			this.setSize(temp.length);
			retrieve = myArr[index];
			for (int r = index; r < myArr.length - 1; r++) {
				temp[r] = myArr[r + 1];
			}
			myArr = temp;
		}
		

		return retrieve;
	}

	@Override
	public T poll() {
		// TODO Auto-generated method stub
		T retrieve = null;
		if (myArr[0] != null) {

			retrieve = myArr[0];
			remove();
		}
		return retrieve;
	}

	@Override
	public T element() {
		// TODO Auto-generated method stub
		return myArr[0];
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return myArr[0] == null ? null : myArr[0];
	}

	public int size() {

		return myArr.length;
	}

	public T get(int index) {

		if (myArr[index] != null)
			return myArr[index];

		return null;
	}

	@Override
	public T[] increase(T[] t) {
		// TODO Auto-generated method stub
		T[] newArr = (T[]) new Object[myArr.length + 1];
		this.setSize(newArr.length);
		for (int a = 0; a < myArr.length; a++) {
			newArr[a] = myArr[a];
		}

		return newArr;
	}

}
