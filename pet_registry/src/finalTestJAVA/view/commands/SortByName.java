package finalTestJAVA.view.commands;

import finalTestJAVA.view.ConsoleUI;

public class SortByName extends CommandMenu {

    public SortByName(ConsoleUI consoleUI) {
        super("Отсортировать список животных по имени", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().sortByName();
    }

}
