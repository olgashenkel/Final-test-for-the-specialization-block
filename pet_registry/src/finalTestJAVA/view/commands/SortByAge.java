package finalTestJAVA.view.commands;

import finalTestJAVA.view.ConsoleUI;

public class SortByAge extends CommandMenu {

    public SortByAge(ConsoleUI consoleUI) {
        super("Отсортировать список животных по возрасту", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().sortByAge();
    }

}
