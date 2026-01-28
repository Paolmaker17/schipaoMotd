package sh.ftp.schipao.schipaoMotd

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.event.ClickEvent
import net.kyori.adventure.text.format.NamedTextColor
import net.kyori.adventure.text.format.TextDecoration
import org.bukkit.event.EventHandler
import org.bukkit.event.EventPriority
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

class JoinListener : Listener {

    @EventHandler(priority = EventPriority.HIGHEST)
    fun onPlayerJoin(event: PlayerJoinEvent) {
        event.player.sendMessage (
            Component.text()
                .append(
                    Component.text("----------------------------------------------")
                        .color(NamedTextColor.AQUA)
                )
                .append(
                    Component.text("\nWelcome, ")
                        .color(NamedTextColor.GOLD)
                )
                .append(
                    Component.text(event.player.name)
                        .color(NamedTextColor.DARK_RED)
                )
                .append(
                    Component.text("!\n")
                        .color(NamedTextColor.GOLD)
                )
                .append(
                    Component.text("▶ Mod Survival Moddata\n")
                        .color(NamedTextColor.DARK_GREEN)
                        .clickEvent(ClickEvent.openUrl("https://example.com/modpack"))
                )
                .append(
                    Component.text("▶ Discord\n")
                        .color(NamedTextColor.LIGHT_PURPLE)
                        .clickEvent(ClickEvent.openUrl("https://discord.gg/example"))
                )
                .append(
                    Component.text("----------------------------------------------")
                        .color(NamedTextColor.AQUA)
                )
                .build()
        )
    }
}
