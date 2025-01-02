package finalTestJAVA.view;


import finalTestJAVA.view.commands.*;

import java.util.ArrayList;
import java.util.List;

public class MainMenu {
    private List<CommandMenu> commandsMenus;

    public MainMenu(ConsoleUI consoleUI) {
        commandsMenus = new ArrayList<>();
        commandsMenus.add(new AddAnimals(consoleUI));
        commandsMenus.add(new GetAnimalsListInfo(consoleUI));
        commandsMenus.add(new CountAnimals(consoleUI));
        commandsMenus.add(new SortByID(consoleUI));
        commandsMenus.add(new SortByName(consoleUI));
        commandsMenus.add(new SortByAge(consoleUI));
        commandsMenus.add(new SaveFileHandler(consoleUI));
        commandsMenus.add(new ReadFileHandler(consoleUI));
        commandsMenus.add(new Finish(consoleUI));
    }

    public String menu(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("************ МЕНЮ ************\n");
        for (int i = 0; i < commandsMenus.size(); i++) {
            stringBuilder.append(i + 1);
            stringBuilder.append(". ");
            stringBuilder.append(commandsMenus.get(i).getDescription());
            stringBuilder.append("\n");
        }
        stringBuilder.append("******************************\n");
        stringBuilder.append("Выберите необходимый пункт меню: ");
        return stringBuilder.toString();
    }

    public void execute(int choice) {
        CommandMenu commandMenu = commandsMenus.get(choice - 1);
        commandMenu.execute();
    }

    public int size(){
        return commandsMenus.size();
    }

}
