package com.wsq.webprj.chat;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientProgram {

	public ClientProgram() throws IOException {
		
		
		ClientSocket client=new ClientSocket("211.238.142.115", 10009);
		
		client.setReceiveListener(new ReceiveListener() {
			
			@Override
			public void OnReceive(String echo) {
				System.out.println("data echo: "+echo);
			}
		});
		
		Scanner scan=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("msg:");
			String msg=scan.nextLine();  // ���ξ�����
			//������ ���??
			client.send(msg);  // ����
			
			if(msg.equals("bye"))
			{
				client.close();
				break;
			}
				
		}
	}
	
}
