package finalTestJAVA.view.commands;

import finalTestJAVA.view.ConsoleUI;

public class SaveFileHandler extends CommandMenu {

    public SaveFileHandler(ConsoleUI consoleUI) {
        super("Сохранить список в файл", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().saveFileHandler();
    }
}
