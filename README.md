# SchiPaoMotd

A lightweight Minecraft plugin written in Kotlin that automatically sends a private welcome message to players when they join the server.

The message includes a greeting and customizable clickable links.

---

## Features

- Sends a **private chat message** on join  
- Message is **only visible to the player**  
- Supports **clickable links**  
- Lightweight and fast  
- Written in **Kotlin**

---

## Installation
### Prerequisites

  - PaperMC 1.20+
  - Java 17+

### Setup
1. Install PaperMC
2. Download the latest release from the **Releases** tab
3. Place the `.jar` file into your `plugins/` folder
4. Start your server

---

## Configuration

Currently, messages are configured directly in the source code.

Example:

```kotlin
event.player.sendMessage(
    Component.text("Welcome to the server! \n")
        .append(Component.text("Your Text"))
        .append(Component.text("Your Clickable Text")
                        .clickEvent(ClickEvent.openUrl("https://example.com"))
)
