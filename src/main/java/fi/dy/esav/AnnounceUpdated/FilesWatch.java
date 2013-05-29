package fi.dy.esav.AnnounceUpdated;

import java.io.File;
import java.util.HashMap;

public class FilesWatch implements Runnable {

	AnnounceUpdated plugin;
	
	public FilesWatch(AnnounceUpdated plugin) {
		this.plugin = plugin;
	}
	
	boolean running = true;
	
	@Override
	public void run() {
		HashMap<String, Integer> files = new HashMap<String, Integer>();
		
		while(running) {
			
			File folder = new File("./");
			for(File file : folder.listFiles()) {
				System.out.println(file.getAbsolutePath());
			}
			
			try {
				Thread.sleep(60000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void stop() {
		running = false;
	}

}
