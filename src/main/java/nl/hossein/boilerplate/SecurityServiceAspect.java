package nl.hossein.boilerplate;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created with IntelliJ IDEA.
 * User: hossein
 * Date: 5/20/13
 * Time: 9:21 PM
 * To change this template use File | Settings | File Templates.
 */
@Aspect
public class SecurityServiceAspect {

    private final static Logger LOG = LoggerFactory.getLogger(SecurityServiceAspect.class);

	private Counters counters;

    @Pointcut("@annotation(nl.hossein.boilerplate.Secured)")
    public void requireSecuredAccess(){
    }

    @Before("requireSecuredAccess() && execution(* *(..))")
    public void checkAuthorizedAccess(){
        System.out.println("Working");
	    counters.incrementAccessDeniedAccess();
        LOG.info("Aspect is working");
        //TODO: use the values of the annotation to decide what do to do with each security level
    }

	@After("requireSecuredAccess() && execution(* *(..))")
	public void printAccessDetails(){
		System.out.println(counters.getAccessDeniedAccess());
	}



	@Autowired
	public void setCounters(Counters counters){
		this.counters = counters;
	}
}
