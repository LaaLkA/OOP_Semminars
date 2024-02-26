package Main.notebook.util.mapper;

import Main.notebook.model.User;

public interface Mapper {
    String toInput(User e);
    User toOutput(String str);
}
