package com.example.junit_Mockito_assignment;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;


public class MyserviceTest {
	@Test
    void testExternalApi() {
        
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        when(mockApi.getdata()).thenReturn("Mock Data");

        Myservice service = new Myservice(mockApi);

        
        String result = service.fetchdata();

        // Assert
        assertEquals("Mock Data", result);
    }
}
