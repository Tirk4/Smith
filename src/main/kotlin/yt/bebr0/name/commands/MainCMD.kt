package yt.bebr0.name.commands

import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.command.TabExecutor
import yt.bebr0.libs.config.ConfigManager
import yt.bebr0.libs.util.ChatUtil.sendConfigMessage
import yt.bebr0.name.Plugin

object MainCMD: TabExecutor {
    override fun onTabComplete(
        sender: CommandSender,
        command: Command,
        label: String,
        args: Array<out String>
    ): List<String> {
        if (args.size == 1 && sender.isOp) {
            return listOf("reload")
        }

        return listOf()
    }

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {

        if (args.isEmpty()) {
            sender.sendConfigMessage("not_enough_args", Plugin.instance)
            return true
        }

        if (args[0].equals("reload", true)) {
            ConfigManager.reloadAll()
            sender.sendConfigMessage("plugin_reloaded", Plugin.instance)
        }

        return true
    }


}