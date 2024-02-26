package Main.notebook.util;

import Main.notebook.model.User;

public class UserValidData {

    public User validDate(User user) {
        if (!isValid(user.getFirstName())) throw new IllegalStateException("Введены некорректные данные");
        if (!isValid(user.getLastName())) throw new IllegalStateException("Введены некорректные данные");
        if (!isValid(user.getPhone())) throw new IllegalStateException("Введены некорректные данные");
        user.setFirstName(user.getFirstName().replace(" ", "").trim());
        user.setLastName(user.getLastName().replace(" ", "").trim());
        user.setPhone(user.getPhone().replace(" ", "").trim());
        return user;
    }

    private boolean isValid(String user) {
        return !user.isEmpty();
    }
}
