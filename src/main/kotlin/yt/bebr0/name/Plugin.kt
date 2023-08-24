package yt.bebr0.name

import yt.bebr0.libs.main.AdvancedPlugin
import yt.bebr0.libs.main.data.CommandData
import yt.bebr0.name.commands.MainCMD

class Plugin: AdvancedPlugin(
    commands = listOf(
        CommandData("name", MainCMD)
    )
) {

    override fun whenPreEnabled() {
        instance = this
    }

    override fun whenEnabled() {

    }

    override fun whenDisabled() {

    }

    companion object {
        lateinit var instance: Plugin
    }
}