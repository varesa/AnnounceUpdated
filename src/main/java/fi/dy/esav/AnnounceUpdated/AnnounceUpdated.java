package fi.dy.esav.AnnounceUpdated;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class AnnounceUpdated extends JavaPlugin{
	
	
	Logger log = Logger.getLogger("Minecraft");

	FilesWatch watcher;
	Thread watcher_thread;
	
	public void onEnable() {		
		watcher = new FilesWatch(this);
		watcher_thread = new Thread(watcher);
		watcher_thread.start();
		
		log.info(this.getDescription().getName() + " version "
				+ this.getDescription().getVersion() + " started.");
	}

	public void onDisable() {

		watcher.stop();
		
		log.info(this.getDescription().getName() + " version "
				+ this.getDescription().getVersion() + " stopped.");

	}
	
}
