package com.example.naocontroller;


/**
 * @author WangHuan
 *set up to package message which is prepared to send to client
 */
public class MessagePack {
	
	public String moveToward(){
		String instruct ="ALMotion moveTo -p 1 0 0"; 
		return instruct;
	}
	
	public String moveRight(){
		String instruct = "ALMotion moveTo -p 0.5 -0.5 -1.5709";
		return instruct;
	}
	
	public String moveLeft(){
		String instruct = "ALMotion moveTo -p 0.5 0.5 1.5709";
		return instruct;
	}
	
	public String moveBack(){
		String instruct ="ALMotion moveTo -p -1 0 0"; 
		return instruct;
	}
	
	public String stop(){
		String instruct ="ALMotion stopMove -p 0 0 0"; 
		return instruct;
	}
	
	public String stretchRightHand(){
		String instruct ="ALMotion angleInterpolation -p ['RShoulderRoll'] [1,2,3,4] [1.0,2.0,3.0,4.0] True"; 
		return instruct;
	}
	
	public String putDownRightHand(){
		String instruct ="ALMotion angleInterpolation -p ['RShoulderRoll'] [0] [1.0] True"; 
		return instruct;
	}
	
	public String stretchLeftHand(){
		String instruct ="ALMotion angleInterpolation -p ['LShoulderRoll'] [1,2,3,4] [1.0,2.0,3.0,4.0] True"; 
		return instruct;
	}
	
	public String putDownLeftHand(){
		String instruct ="ALMotion angleInterpolation -p ['LShoulderRoll'] [0] [1.0] True"; 
		return instruct;
	}

}
