package com.amdocs;

public class Mobile {
	
	private Camera camera;
	
	public Mobile() {
		camera = new Camera();
	}
	
	public Mobile(Camera camera) {
		this.camera = camera;
	}

	public boolean startPhotoApp() {
		// TODO Auto-generated method stub
		System.out.println("Inside start Photo app");
		
		if( camera.on() ) {
			System.out.println("Positive code path");
			System.out.println("Assume some hardware interactions..");
			return true;
		}
		System.out.println("Negative code path!");
		System.out.println("Error occurred!");
		return false;
	}

}
