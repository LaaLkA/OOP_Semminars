package Main.notebook;

import Main.notebook.controller.UserController;
import Main.notebook.model.dao.impl.FileOperation;
import Main.notebook.model.repository.GBRepository;
import Main.notebook.model.repository.impl.UserRepository;
import Main.notebook.view.UserView;

import static Main.notebook.util.DBConnector.DB_PATH;
import static Main.notebook.util.DBConnector.createDB;

public class Main {
    public static void main(String[] args) {
        createDB();
        FileOperation fileOperation = new FileOperation(DB_PATH);
        GBRepository repository = new UserRepository(fileOperation);
        UserController controller = new UserController(repository);
        UserView view = new UserView(controller);
        view.run();

    }
}
