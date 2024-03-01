package Main.seminar6.homework.util;

import Main.seminar6.homework.core.user.impl.Persister;
import Main.seminar6.homework.core.user.impl.Reporter;
import Main.seminar6.homework.core.user.impl.User;


public class ProgramPunner {
    private static void ProgramPunner(){
        User user = new User("Bob");
        Persister persister = new Persister();
        Reporter reporter = new Reporter();

        System.out.println(user.getName() + " working...");
        reporter.reportUser(user);
        persister.saveUser(user);
    }
    public static void Run(){
        ProgramPunner();
    }
}
