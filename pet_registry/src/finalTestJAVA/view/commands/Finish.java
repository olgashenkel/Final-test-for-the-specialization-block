package finalTestJAVA.view.commands;

import finalTestJAVA.view.ConsoleUI;

public class Finish extends CommandMenu {

    public Finish(ConsoleUI consoleUI) {
        super("Завершение работы", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().finish();
    }
}
