package nl.hossein.boilerplate;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created with IntelliJ IDEA.
 * User: hossein
 * Date: 5/27/13
 * Time: 4:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class SecurityCounter implements Counters {
	AtomicLong accessDeniedCnt = new AtomicLong(0);

	@Override
	public String getCounterName() {

		return "Security Counter";
	}

	@Override
	public long getAccessDeniedAccess(){
	   return accessDeniedCnt.get();
	}

	@Override
	public void incrementAccessDeniedAccess(){
		accessDeniedCnt.incrementAndGet();
	}
}
