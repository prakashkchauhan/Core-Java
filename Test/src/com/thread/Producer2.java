/* Decompiler 6ms, total 259ms, lines 24 */
package com.thread;

class Producer2 implements Runnable {
	private final SharedBuffer2 sharedBuffer2;

	public Producer2(SharedBuffer2 sharedBuffer2) {
		this.sharedBuffer2 = sharedBuffer2;
	}

	public void run() {
		byte value = 0;

		try {
			byte var10001 = value;
			this.sharedBuffer2.produce(var10001);
			Thread.sleep(500L);
		} catch (InterruptedException var3) {
			System.out.println("Producer is interrupted");
		}

	}
}
