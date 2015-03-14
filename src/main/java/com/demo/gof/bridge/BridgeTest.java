package com.demo.gof.bridge;

public class BridgeTest {
	public static void main(String[] args) {
		Telephone t = new Nokia();

		t.setSoft(new MusicPlayer());
		t.run();
	}
}
