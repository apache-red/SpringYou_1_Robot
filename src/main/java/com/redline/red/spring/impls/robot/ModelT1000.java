package com.redline.red.spring.impls.robot;

import com.redline.red.spring.interfaces.Hand;
import com.redline.red.spring.interfaces.Head;
import com.redline.red.spring.interfaces.Leg;
import com.redline.red.spring.interfaces.Robot;

public class ModelT1000 implements Robot {

	private Hand hand;
	private Leg leg;
	private Head head;

	public ModelT1000() {
	}

	public ModelT1000(Hand hand, Leg leg, Head head) {
		super();
		this.hand = hand;
		this.leg = leg;
		this.head = head;
	}


	public void fire() {
		head.calc();
		hand.catchSomething();
		leg.go();
	}


	public void dance() {
		System.out.println("T1000 is dancing!");
	}
}
