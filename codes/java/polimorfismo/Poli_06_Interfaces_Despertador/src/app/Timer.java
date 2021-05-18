package app;

public class Timer {

	private static final int MAX_CAPACITY = 10;
	private static final int UNUSED = -1;
	private static final int NOROOM = -1;

	private Wakeable[] wakeables = new Wakeable[MAX_CAPACITY];
	private long[] howLong = new long[MAX_CAPACITY];

	public Timer() {
		for (int i = 0; i < MAX_CAPACITY; i++)
			howLong[i] = UNUSED;
	}

	public synchronized boolean letMeSleepFor(Wakeable wakeable, long timeInterval) {
		int index = findNextSlot();
		
		if (index == NOROOM) {
			return false;
		} else {
			System.out.println("Cadastrando: " + index);
			wakeables[index] = wakeable;
			howLong[index] = timeInterval;
			new TimerThread(index).start();
			return true;
		}
	}

	private synchronized int findNextSlot() {
		for (int i = 0; i < MAX_CAPACITY; i++) {
			if (howLong[i] == UNUSED)
				return i;
		}
		return NOROOM;
	}

	private synchronized void wakeUp(int index) {
		System.out.println("Acordando: " + index);
		wakeables[index].wakeUp();
		wakeables[index] = null;
		howLong[index] = UNUSED;
	}

	private class TimerThread extends Thread {
		int wakeableIndex;

		TimerThread(int index) {
			wakeableIndex = index;
		}

		
		public void run() {
			try {
				sleep(howLong[wakeableIndex]);
			} catch (InterruptedException e) {
			}
			wakeUp(wakeableIndex);
		}
	}
}


