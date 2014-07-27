package org.learn.ping.example;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class PingReachable {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String host = "www.google.com";
		InetAddress ipaddr = Inet4Address.getByName(host); ;
		
		System.out.println(ipaddr.isReachable(30));
		
	}

}
