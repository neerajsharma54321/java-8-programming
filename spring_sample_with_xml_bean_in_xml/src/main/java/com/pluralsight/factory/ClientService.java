package com.pluralsight.factory;
public class ClientService {
	
	private String message = "Hello data using static";
	
    private static ClientService clientService = new ClientService();
    private ClientService() {}

    public static ClientService createInstance() {
        return clientService;
    }
    
    public String getMessage() {
    	return this.message;
    }
}