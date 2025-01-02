package finalTestJAVA.view.commands;

import finalTestJAVA.view.ConsoleUI;

public class CountAnimals extends CommandMenu {

    public CountAnimals(ConsoleUI consoleUI) {
        super("Количество зарегистрированных животных", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().countAnimals();
    }
}
