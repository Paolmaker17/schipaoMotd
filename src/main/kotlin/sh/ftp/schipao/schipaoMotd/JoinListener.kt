package sh.ftp.schipao.schipaoMotd

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.event.ClickEvent
import net.kyori.adventure.text.format.Style
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.EventPriority
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

class JoinListener : Listener {
    @EventHandler (priority = EventPriority.HIGHEST)
    fun onPlayerJoin(event: PlayerJoinEvent) {
        event.joinMessage(
            Component.text("Stronzo")
                .style(
                    Style.style(ClickEvent.openUrl(""))
                )
        )
    }
}