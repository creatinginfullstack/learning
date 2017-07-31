package com.concurrency;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	protected BlockingQueue queue = null;
	
	public Producer(BlockingQueue blockingQueue) {
		this.queue = blockingQueue;
	}
	
	@Override
	public void run() {
		try {
			queue.put("1");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
