package sh.ftp.schipao.schipaoMotd

import org.bukkit.plugin.java.JavaPlugin

class SchipaoMotd : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic

        server.pluginManager.registerEvents(JoinListener(), this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
