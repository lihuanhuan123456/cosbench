package com.inspur.ratelimit;

import java.util.HashMap;

public class RateLimiterFactory {

	// private Jedis jedis = new Jedis("10.180.210.55");
	// private ReentrantLock lock = new ReentrantLock();

	private HashMap<String, RateLimiter> rateLimiterMap = new HashMap<String, RateLimiter>();

	/**
	 * ����RateLimiter
	 * 
	 * @param key
	 *            Redis key
	 * @param permitsPerSecond
	 *            ÿ������������
	 * @param maxBurstSeconds
	 *            ���洢maxBurstSeconds�����ɵ�����
	 * 
	 * @return RateLimiter
	 */

	public synchronized RateLimiter build(String key, Double permitsPerSecond,
			int maxBurstSeconds) {
		if (!rateLimiterMap.containsKey(key)) {
			rateLimiterMap.put(key, new RateLimiter(key, permitsPerSecond,
					maxBurstSeconds));
		}
		return (RateLimiter) rateLimiterMap.get(key);
	}

}