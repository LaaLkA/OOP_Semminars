package Main.seminar6.homework.util;

import Main.seminar6.homework.core.user.impl.User;

public class ProgramPunner {
    private static void ProgramPunner(){
        User user = new User("Bob");
        user.report();
        user.save();
    }
    public static void Run(){
        ProgramPunner();
    }
}
