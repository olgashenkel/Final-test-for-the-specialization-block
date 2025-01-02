package finalTestJAVA.view.commands;

import finalTestJAVA.view.ConsoleUI;

public class SortByID extends CommandMenu {

    public SortByID(ConsoleUI consoleUI) {
        super("Отсортировать список животных по ID", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().sortByID();
    }

}
