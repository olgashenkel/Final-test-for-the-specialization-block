package finalTestJAVA.view.commands;

import finalTestJAVA.view.ConsoleUI;

public class ReadFileHandler extends CommandMenu {

    public ReadFileHandler(ConsoleUI consoleUI) {
        super("Восстановить сохраненный файл", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().readFileHandler();
    }
}
