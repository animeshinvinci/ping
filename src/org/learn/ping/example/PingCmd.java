package org.learn.ping.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.sun.corba.se.spi.orbutil.fsm.InputImpl;

public class PingCmd {
	public static void main(String[] args) {
		String cmd = "ping -c 1  www.google.com";
		
		String out = executeCommand(cmd);
		
		System.out.println(out);
		
	}

	private static String executeCommand(String cmd) {
		// TODO Auto-generated method stub
		StringBuffer strbuff = new StringBuffer();
		Process process;
		try {
			process = Runtime.getRuntime().exec(cmd);
			process.waitFor();
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String line = "";
			while ((line = reader.readLine()) != null){
				strbuff.append(line);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return strbuff.toString();
	}

}
