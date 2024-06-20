import model.group.AllMembers;
import model.user.HumanUser;
import model.user.BotUser;
import view.ConsoleUI;
import view.View;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        AllMembers g = testItem();
//        System.out.println(g);

        View view = new ConsoleUI();
        view.start();

    }


//    static AllMembers testItem(){
//                AllMembers g = new AllMembers();
//
//
//        HumanUser user1 = new HumanUser("Виктор");
//        HumanUser user2 = new HumanUser("Володя");
//        HumanUser user3 = new HumanUser("Николай");
//        BotUser user4 = new BotUser("Виктор");
//        BotUser user5 = new BotUser("Володя");
//        BotUser user6 = new BotUser("Николай");
//
//        g.addUser(user1);
//        g.addUser(user2);
//        g.addUser(user3);
//        g.addUser(user4);
//        g.addUser(user5);
//        g.addUser(user6);
//
//        return g;
//    }
}