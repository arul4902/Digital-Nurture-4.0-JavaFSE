package com.example.junitdemo;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;;


public class MyServiceTest {

    @Test
    public void testFetchData() {
    	ExternalAPI api = Mockito.mock(ExternalAPI.class);
    	Mockito.when(api.getData()).thenReturn("Mock Data");


        // Inject mock into MyService
        MyService service = new MyService(api);

        // Test fetchData()
        String result = service.fetchData();

        // Assert result
        assertEquals("Mock Data", result);
    }
}
