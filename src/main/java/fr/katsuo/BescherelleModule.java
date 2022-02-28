package fr.katsuo;

import fr.katsuo.commands.BescherelleCommand;
import fr.ordinalteam.bot.api.plugin.Plugin;

import java.util.ArrayList;
import java.util.List;

public class BescherelleModule extends Plugin {

    private List<String> listImg = new ArrayList<String>();

    @Override
    public void onEnable() {
        getCommandRegistry().registerCommand(new BescherelleCommand(this), this);
        logger.log("Learn Fucking Bescherelle is loaded !");

        listImg.add("https://i.ibb.co/dtF9VD7/1.jpg");
        listImg.add("https://i.ibb.co/0V79Cgq/4.jpg");
        listImg.add("https://i.ibb.co/M9sHpXS/3.jpg");
        listImg.add("https://i.ibb.co/4SfkWnD/5.jpg");
        listImg.add("https://i.ibb.co/Wy99mLt/6.jpg");
        listImg.add("https://i.ibb.co/9Z2Rxjs/7.jpg");
        listImg.add("https://i.ibb.co/HXFMTW9/8.jpg");
        listImg.add("https://i.ibb.co/fqBqHgJ/9.jpg");
        listImg.add("https://i.ibb.co/6npdFG2/10.jpg");
        listImg.add("https://i.ibb.co/3m73CPX/11.jpg");
        listImg.add("https://i.ibb.co/6g9w5SB/12.jpg");
        listImg.add("https://i.ibb.co/RzngMZW/13.jpg");
        listImg.add("https://i.ibb.co/Z1vRCtL/14.jpg");
        listImg.add("https://i.ibb.co/n1RzNKR/15.png");
        listImg.add("https://i.ibb.co/Xx2dmMk/17.png");
        listImg.add("https://i.ibb.co/BymhwKG/16.jpg");
        listImg.add("https://i.ibb.co/XYdwhkK/18.jpg");
    }

    public List<String> getListImg() {
        return listImg;
    }
}