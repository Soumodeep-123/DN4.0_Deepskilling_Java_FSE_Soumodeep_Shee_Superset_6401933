package com.example.junit_Mockito_assignment;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;




public class MyserviceTest2 {
	@Test
    void testVerifyExternalApi() {
        
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        Myservice service = new Myservice(mockApi);

        
        service.fetchdata();

        
        verify(mockApi).getdata();
    }
}
