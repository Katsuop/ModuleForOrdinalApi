package fr.katsuo.commands;

import fr.katsuo.BescherelleModule;
import fr.ordinalteam.bot.api.commands.Command;
import fr.ordinalteam.bot.api.utils.EmbedUtil;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.util.Random;

public class BescherelleCommand extends Command {
    private Random random = new Random();

    private BescherelleModule plugin;

    public BescherelleCommand(BescherelleModule plugin){
        super("bescherelle", "!bescherelle affiche un meme pour les boomer");
        this.plugin = plugin;
    }

    @Override
    public void run(final MessageReceivedEvent event, final String[] args) {
        int max = plugin.getListImg().size();
        int value = random.nextInt(0 + max);
        final EmbedBuilder embed = EmbedUtil.buildEmbed(EmbedUtil.EmbedEnum.ERROR, "Ouch sa pique mon coco");
        embed.setImage(plugin.getListImg().get(value));
        event.getMessage().replyEmbeds(embed.build()).queue();
    }
}