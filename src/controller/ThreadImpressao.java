package controller;

public class ThreadImpressao extends Thread {

	public ThreadImpressao() {

	}

	@Override
	public void run() {
		int id = (int) getId();
		System.out.println("TID #" + id);
	}
}
