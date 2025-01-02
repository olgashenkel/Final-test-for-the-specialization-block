package finalTestJAVA.view.commands;

import finalTestJAVA.view.ConsoleUI;

public abstract class CommandMenu {
    private final String description;


    private ConsoleUI consoleUI;

    public CommandMenu(String description, ConsoleUI consoleUI) {
        this.description = description;
        this.consoleUI = consoleUI;
    }


    public ConsoleUI getConsoleUI() {
        return consoleUI;
    }

    public String getDescription() {
        return description;
    }

    public abstract void execute();
}
