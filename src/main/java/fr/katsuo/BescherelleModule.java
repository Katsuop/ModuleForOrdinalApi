package fr.katsuo;

import fr.ordinalteam.bot.api.plugin.Plugin;

public class BescherelleModule extends Plugin {

    @Override
    public void onEnable() {
        getCommandRegistry().registerCommand(new LearnCommand(), this);
        logger.log("Learn Fucking Bescherelle is loaded !");
    }
}