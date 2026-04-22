# SchiPaoMotd

A lightweight Minecraft plugin written in Kotlin that automatically sends a private welcome message to players when they join the server.

<p>
  <!-- Badges -->
  <img src="https://img.shields.io/badge/Minecraft-1.21.11-brightgreen" />
  <img src="https://img.shields.io/badge/Paper-Plugin-blue" />
</p>

>The message includes a greeting and customizable clickable links.

---

## Features

- Sends a **private chat message** on join  
- Message is **only visible to the player**  
- Supports **clickable links**  
- Lightweight and fast  
- Written in **Kotlin**


## Installation
### Prerequisites

  - [PaperMC 1.21.11](https://papermc.io/)
  - Java 21

### Setup
-Download the latest release from the **Releases** tab
   
-Place the `.jar` file into your `plugins/` folder
   
-Start your server

## Configuration

Currently, messages are configured directly in the source code.

```kotlin
event.player.sendMessage(
    Component.text("Welcome to the server! \n")
        .append(Component.text("Your Text"))
        .append(Component.text("Your Clickable Text")
                        .clickEvent(ClickEvent.openUrl("https://example.com"))
)
