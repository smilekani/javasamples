package in.co.kani;

import java.io.IOException;

public class LaunchExternalApp 
{
	public static void main(String[] args) 
	{
		Runtime runtime = Runtime.getRuntime();
		try {
			Process exec = runtime.exec("gedit");
			Thread.sleep(1000);
			exec.destroy();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
