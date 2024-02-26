package Main.notebook.util;

import Main.notebook.controller.UserController;
import Main.notebook.model.repository.GBRepository;
import Main.notebook.model.repository.impl.UserRepository;
import Main.notebook.view.UserView;

import static Main.notebook.util.DBConnector.createDB;
import static Main.notebook.util.DBConnector.DB_PATH;

public class ProgramRun {
        private static void ProgramRun() {
            createDB();
            GBRepository repository = new  UserRepository(DB_PATH);
            UserController controller = new UserController(repository);
            UserView view = new UserView(controller);
            view.run();
        }

        public static void Run() {
            ProgramRun();
        }
}
