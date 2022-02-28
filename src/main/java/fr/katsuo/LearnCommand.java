package fr.katsuo;

import fr.ordinalteam.bot.api.commands.Command;
import fr.ordinalteam.bot.api.utils.EmbedUtil;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LearnCommand extends Command {

    private List<String> listUrl = new ArrayList<String>();
    private Random random = new Random();
    public LearnCommand(){
        super("bescherelle", "!bescherelle affiche un meme pour les boomer");
        listUrl.add("https://i.ibb.co/dtF9VD7/1.jpg");
        listUrl.add("https://i.ibb.co/0V79Cgq/4.jpg");
        listUrl.add("https://i.ibb.co/M9sHpXS/3.jpg");
        listUrl.add("https://i.ibb.co/4SfkWnD/5.jpg");
        listUrl.add("https://i.ibb.co/Wy99mLt/6.jpg");
        listUrl.add("https://i.ibb.co/9Z2Rxjs/7.jpg");
        listUrl.add("https://i.ibb.co/HXFMTW9/8.jpg");
        listUrl.add("https://i.ibb.co/fqBqHgJ/9.jpg");
        listUrl.add("https://i.ibb.co/6npdFG2/10.jpg");
        listUrl.add("https://i.ibb.co/3m73CPX/11.jpg");
        listUrl.add("https://i.ibb.co/6g9w5SB/12.jpg");
        listUrl.add("https://i.ibb.co/RzngMZW/13.jpg");
        listUrl.add("https://i.ibb.co/Z1vRCtL/14.jpg");
        listUrl.add("https://i.ibb.co/n1RzNKR/15.png");
        listUrl.add("https://i.ibb.co/Xx2dmMk/17.png");
        listUrl.add("https://i.ibb.co/BymhwKG/16.jpg");
        listUrl.add("https://i.ibb.co/XYdwhkK/18.jpg");
    }

    @Override
    public void run(final MessageReceivedEvent event, final String[] args) {
        int max = listUrl.size();
        int value = random.nextInt(0 + max);
        final EmbedBuilder embed = EmbedUtil.buildEmbed(EmbedUtil.EmbedEnum.ERROR, "Ouch sa pique mon coco");
        embed.setImage(listUrl.get(value));
        event.getMessage().replyEmbeds(embed.build()).queue();
    }
}