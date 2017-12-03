package me.synconix.broadcast ;
 
 import java.util.Arrays;
 import java.util.Random;
 
 import org.bukkit.Bukkit;
 import org.bukkit.ChatColor;
 import org.bukkit.event.Listener;
 import org.bukkit.plugin.java.JavaPlugin;
 
 public class Broadcast extends JavaPlugin implements Listener {
 
 	public void onEnable() {
 		getServer().getPluginManager().registerEvents(this, this);
 		broadcast();
 	}
 	public void broadcast() {
 		final String[] messages = {
 				ChatColor.AQUA + "\n\n\nJoin our community discord on the website!\n\n\n ",
 				ChatColor.AQUA + "\n\n\nPurchase ranks, and more all on the website!\n\n\n "
 		};
 		Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable(){
 			public void run(){
 				Bukkit.broadcastMessage(Arrays.asList(messages).get(new Random().nextInt(messages.length)));
 			}
 
   }, 0, 4800);
 	}
 }
