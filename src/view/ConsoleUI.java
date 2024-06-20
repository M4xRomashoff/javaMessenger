package view;


import model.group.AllMembers;
import model.user.BotUser;
import model.user.HumanUser;
import model.writer.FileHandler;
import presenter.Presenter;

import java.util.Scanner;


public class ConsoleUI implements View {
    private Scanner scanner;
    private Presenter presenter;
    private boolean work;
    AllMembers g = new AllMembers();

    public ConsoleUI() {
        this.scanner = new Scanner(System.in);
        this.presenter = new Presenter(this);
        this.work = true;
    }

    public void start() {
        System.out.println("Welcome to the FamTree view");

        while(this.work) {
            System.out.println(g);
            System.out.println("Введите команду: ");
            System.out.println("save. Сохранить список");
            System.out.println("load. Загрузить список");
            System.out.println("1. Добавить Пользователя");
            System.out.println("11. Добавить Робота Пользователя");
            System.out.println("2. Получить список");
            System.out.println("3. Сортировать по имени");
            System.out.println("4. Сортировать по возрасту");
            System.out.println("5. Завершить работу ");
            switch (this.scanner.nextLine()) {
                case "save":
                    this.saveItems();
                    break;
                case "load":
                    this.loadItems();
                    break;
                case "1":
                    this.addItem();
                    break;
                case "11":
                    this.addBotItem();
                    break;
                case "2":
                    this.getItemsList();
                    break;
                case "3":
                    this.getItemsListName();
                    break;
                case "4":
                    this.getItemsListAge();
                    break;
                case "5":
                    this.finish();
                    break;
                default:
                    System.out.println("не правильно что-то");
            }
        }

    }

    public void saveItems() {
        String filePath = "userList.txt";
        FileHandler  fileHandler = new FileHandler();
        fileHandler.save(g, filePath);

    }
    public void loadItems() {
        String filePath = "userList.txt";
        FileHandler fileHandler = new FileHandler();
        System.out.println(fileHandler.read(filePath));
        g = (AllMembers) fileHandler.read(filePath);

    }



    public void addItem() {
        System.out.println("Введите имя:");
        String name = this.scanner.nextLine();
        HumanUser newUser = new HumanUser(name);
        g.addUser(newUser);
    }
    public void addBotItem() {
        System.out.println("Введите имя:");
        String name = this.scanner.nextLine();
        BotUser newUser = new BotUser(name);
        g.addUser(newUser);
    }

    public void getItemsList() {
        System.out.println("getItemsList");
    }

    public void getItemsListName() {
        System.out.println("getItemsListName");
    }

    public void getItemsListAge() {
        System.out.println("getItemsListAge");
    }

    public void finish() {
        System.out.println("Все !!!");
        this.work = false;
    }

    public void printAnswer(String answer) {
        System.out.println(answer);
    }

    public void stop() {
    }
}
