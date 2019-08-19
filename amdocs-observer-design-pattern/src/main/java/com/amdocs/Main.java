package com.amdocs;

public class Main {
	public static void main(String[] args) {
		NewspaperAgency paperwala = new NewspaperAgency("Pune Papers Pvt. Ltd.");
		paperwala.addSubscriber(new Subscriber("Saurabh"));
		paperwala.addSubscriber(new Subscriber("ASDFG"));
		paperwala.addSubscriber(new Subscriber("QWERTY"));
		
		paperwala.notifyAllSubscribers("The Times Of India");
	}
}
