package customMethods;

public interface Queueable<T> {
	T [] increase(T [] t);
	boolean add(T o);
	boolean offer(T o);
	T remove();
	T poll();
	T element();
	T peek();
	int size();
	T get(int a);
	T remove(int index);
	
}
