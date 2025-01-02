package finalTestJAVA.view.commands;

import finalTestJAVA.view.ConsoleUI;

public class AddAnimals extends CommandMenu {

    public AddAnimals(ConsoleUI consoleUI) {
        super("Добавить животное", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().addAnimals();
    }
}
