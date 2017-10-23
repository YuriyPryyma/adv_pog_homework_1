import java.util.*;

interface Command {
    void runCommand();
}
public class Task1 {

    public static void main(String[] args) throws Exception {
        Map<String, Command> methodMap = new HashMap<String, Command>();

        if (args.length == 0)
        {
            System.out.println("Set command line option ");
            return;
        }

        methodMap.put("h", new Command() {
            public void runCommand() { System.out.println("This application is an example of switch replacement "); };
        });

        methodMap.put("d", new Command() {
            public void runCommand() { System.out.println("This is dummy option for test purposes"); };
        });

        Command defaultCommand = new Command() {
            public void runCommand() { System.out.println("Unknown option. Only \"h\" and \"d\" is available "); };
        };


        String cmd = args[0];
        methodMap.getOrDefault(cmd, defaultCommand).runCommand();

    }
}