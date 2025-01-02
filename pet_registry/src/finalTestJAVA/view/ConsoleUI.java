package finalTestJAVA.view;

import finalTestJAVA.model.animal.pets.TypePets;
import finalTestJAVA.presenter.Presenter;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsoleUI implements View {

    private Scanner scanner;
    private boolean work;
    private Presenter presenter;
    private MainMenu mainMenu;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
        work = true;
        presenter = new Presenter(this);
        mainMenu = new MainMenu(this);
    }

    @Override
    public void start() {
        greetings();
        while (work) {
            System.out.println(mainMenu.menu());
            menuExecute();
        }

    }

    private void menuExecute() {
        // метод выбора пункта меню с проверкой на валидность!!!
        try {
            String choiceStr = scanner.nextLine();
            int choice = Integer.parseInt(choiceStr);
            if (choice <= mainMenu.size() && choice > 0) {
                mainMenu.execute(choice);
            } else {
                System.out.println("Введено некорректное значение! Повторите ввод:");
            }
        } catch (Exception exception) {
            System.out.println("Введено некорректное значение! Повторите ввод");
        }

    }

    public void addAnimals() {
        // метод добавления животного
            System.out.println("Введите имя (кличку) животного:");
            String name = scanner.nextLine();

            System.out.print("Укажите тип животного (Cat, Dog, Hamster):\n");
            TypePets typePets = inputTypePets();

            System.out.print("Введите дату рождения (формат ввода через пробел - ГГГГ ММ ДД):\n");
            LocalDate birthDate = inputLocalDate();

            System.out.print("Укажите команды, которые умеет выполнять животное\n " +
                    "(Bark, Fetch, Hide, Jump, Meow, Paw, Pounce, Roll, Scratch, Sit, Spin, Stay):\n");
            String commands = scanner.nextLine();

            presenter.addAnimals(name, typePets, birthDate, commands);
    }


    public TypePets inputTypePets() {
        while (true) {
            String typeStr = scanner.nextLine().trim();

            if (typeStr.equalsIgnoreCase("Cat")) {
                return TypePets.Cat;
            } else if (typeStr.equalsIgnoreCase("Dog")) {
                return TypePets.Dog;
            } else if (typeStr.equalsIgnoreCase("Hamster")) {
                return TypePets.Hamster;
            } else {
                System.out.println("Введен неправильный тип, попробуйте заново (Cat, Dog, Hamster):");
            }
        }
    }

    private LocalDate inputLocalDate() {
        try {
            String date = scanner.nextLine();

            return LocalDate.of(parseInt(date.split(" ")[0]),
                    parseInt(date.split(" ")[1]), parseInt(date.split(" ")[2]));
        } catch (Exception e){
            System.out.println("Введено некорректное значение! Повторите ввод");
            return inputLocalDate();
        }
    }

    public void getAnimalsListInfo() {
        presenter.getAnimalsListInfo();
    }

    public void countAnimals() {
        presenter.countAnimals();
    }

    public void sortByID() {
        presenter.sortByID();
    }

    public void sortByAge() {
        presenter.sortByAge();
    }

    public void sortByName() {
        presenter.sortByName();
    }

    public void saveFileHandler() {
        presenter.saveFileHandler();
    }

    public void readFileHandler() {
        presenter.readFileHandler();
    }

    public void finish() {
        work = false;
        scanner.close();
        parting();
    }

    @Override
    public void printAnswer(String answer) {
        System.out.println(answer);
    }

    public void greetings() {
// Метод для приветствия пользователя
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("HH");
        int time = parseInt(formatForDateNow.format(dateNow));
        if (time >= 22 && time <= 23 || time >= 0 && time < 4) {
            System.out.println("Доброй ночи, уважаемый гость!");
        } else if (time >= 4 && time < 12) {
            System.out.println("Доброе утро, уважаемый гость!");
        } else if (time >= 12 && time < 18) {
            System.out.println("Добрый день, уважаемый гость!");
        } else {
            System.out.println("Добрый вечер, уважаемый гость!");
        }
        System.out.println("Мы рады приветствовать Вас в нашем приложении.");
    }

    public void parting() {
// Метод прощания с пользователем
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("HH");
        int time = parseInt(formatForDateNow.format(dateNow));
        if (time >= 21 && time <= 23 || time >= 0 && time < 4) {
            System.out.println("Доброй ночи и до новой встречи!");
        } else {
            System.out.println("Хорошего дня и до новой встречи!");
        }
    }


}
