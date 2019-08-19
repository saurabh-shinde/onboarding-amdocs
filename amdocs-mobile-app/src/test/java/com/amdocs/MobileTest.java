package com.amdocs;

import static org.junit.Assert.*;
import org.mockito.Mockito;
import org.junit.Test;

public class MobileTest {

	@Test
	public void testStartPhotoAppWhenCameraOnFunctionsNormally() {
		
		//mocking
		Camera mockedCamera = Mockito.mock(Camera.class);
		
		//stubbing
		Mockito.when( mockedCamera.on() ).thenReturn(true);
		
		//Dependency injection
		Mobile mobile = new Mobile(mockedCamera);
		
		boolean actualResponse = mobile.startPhotoApp();
		boolean expectedResponse = true;
		
		assertEquals( expectedResponse, actualResponse);
		
		
	}

}
