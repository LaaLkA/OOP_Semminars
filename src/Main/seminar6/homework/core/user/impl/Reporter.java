package Main.seminar6.homework.core.user.impl;

import Main.seminar6.homework.core.user.Reportable;

public class Reporter implements Reportable {
    @Override
    public void reportUser(User user) {
        System.out.println("Report for user: " + user.getName());
    }
}
