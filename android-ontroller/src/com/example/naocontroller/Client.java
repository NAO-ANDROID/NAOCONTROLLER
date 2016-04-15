package com.example.naocontroller;

import java.io.Serializable;

public class Client implements Serializable {
	public String ip;
	public String host;
	public Client(String ip,String host){
		this.ip  = ip;
		this.host = host;
	}

}
