package finalTestJAVA.view.commands;

import finalTestJAVA.view.ConsoleUI;

public class GetAnimalsListInfo extends CommandMenu {

    public GetAnimalsListInfo(ConsoleUI consoleUI) {
        super("Получить список животных", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().getAnimalsListInfo();
    }
}
