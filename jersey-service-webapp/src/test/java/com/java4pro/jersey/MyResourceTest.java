package com.java4pro.jersey;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class MyResourceTest {
	
	IMyResource resource;
	
	@Before
	public void init () {
		resource = new MyResource();
		
	}

	@Test
	public final void testGetIt() {
//		fail("Not yet implemented"); // TODO
		String it = resource.getIt();
		Assert.assertEquals("Not Equal", "Got it!", it);
	}
	
	@Test
	public final void testGetItSubResoruce (){
//		Assert.fail("Not yet implemented");
		String it = resource.getItSubResoruce();
		Assert.assertEquals("Not Equal", "Got it - subresource!", it);
	}
	
	@Test
	public final void testGetAccountDetails (){
//		Assert.fail("Not yet implemented");
		Integer accountid = 1;
		String it = resource.getAccountDetails(accountid);
		Assert.assertEquals("Not Equal", "Account details found for " + accountid, it);
	}

}
