package com.example.junitdemo;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class MyServiceTest1 {

    @Test
    public void testVerifyInteraction() {
        // Step 1: Create mock
        ExternalAPI mockApi = mock(ExternalAPI.class);

        // Step 2: Call the method
        MyService service = new MyService(mockApi);
        service.fetchData();

        // Step 3: Verify that getData() was called
        verify(mockApi).getData();
    }
}
