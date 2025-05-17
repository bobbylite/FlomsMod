
# JB's Custom Fabric 1.21 Minecraft Modpack: Flom's Mod

Welcome to the custom Minecraft Fabric 1.21 modpack designed specifically for JB's Minecraft server! This modpack brings exciting new gameplay elements, powerful gear, and a seamless experience for you and your friends.

---

## Compatability 
This modpack is for Minecraft 1.21.5 with fabric loader 0.16.14. More compatability found here: https://fabricmc.net/2025/03/24/1215.html

## Features

* **Dildo of Destiny**
  The most powerful, sought-after pickaxe of all time. Mine in style and with unmatched efficiency!

* Carefully curated mods optimized for Fabric 1.21 to ensure smooth gameplay and maximum fun.

* Easy deployment setup for quick installation on JB’s server.

---

## Setup for Usage Instructions
Prerequisites are that you must have the following instaslled:
- fabric loader 0.16.14
- minecraft version 1.21.5

---

1. **Download the Fabric API JAR**
   Navigate to the `setup` folder in this repository and download the `fabric-api` JAR file.

2. **Download the Floms Mod JAR**
   Go to the `build/libs` directory and download the `flomsmod` JAR file.

3. **Locate Your Minecraft Mods Folder**
   Find your `.minecraft/mods` folder.

   * On Windows: `C:\Users\<YourName>\AppData\Roaming\.minecraft\mods`
   * On macOS: `~/Library/Application Support/minecraft/mods`
   * On Linux: `~/.minecraft/mods`

4. **Move the Files**
   Place both the `fabric-api` JAR and the `flomsmod` JAR into the `mods` folder.

5. **Launch Minecraft with Fabric**
   Make sure you have the Fabric loader installed and selected in your Minecraft launcher. Then start the game — Floms Mod should now be active.

---

## Development Setup Instructions

All the necessary files to deploy the modpack are located in the `setup` folder. Follow these steps to get the modpack running on your server:

1. Download the entire `setup` folder.
2. Copy its contents to your Minecraft server directory.
3. Ensure you have Fabric Loader 1.21 installed on the server.
4. **(Optional) Run data generation**:
   If your mod uses generated data (e.g. recipes, block models, tags), you should run the `datagen` task to generate the required files.
   From the root of your project directory, use:

   ```bash
   ./gradlew runDatagen
   ```

   Make sure your `mods.toml`, `fabric.mod.json`, and data generator entrypoints are correctly set up.
   See the official guide for setup details:
   [https://docs.fabricmc.net/develop/data-generation/setup](https://docs.fabricmc.net/develop/data-generation/setup)
5. Start your server and enjoy the enhanced Minecraft experience.

---

## Notes

* This modpack is customized for JB’s server and friends, so please do not redistribute without permission.
* Make sure all players use the same version of the modpack to avoid compatibility issues.

---

Thanks for playing, and may the **Dildo of Destiny** bring you legendary mining adventures!

---

## Dev Setup

For development instructions, see the [Fabric documentation](https://docs.fabricmc.net/develop/getting-started/setting-up-a-development-environment) corresponding to your IDE (IntelliJ IDEA, Eclipse, VS Code, etc.).

## License

This template is available under the CC0 license. Feel free to learn from it and incorporate it in your own projects.

---

Let me know if you want to include an example `ModDataGenerator` class or a walkthrough for creating custom recipes or tags!
