package Main.seminar6.dip1;

import Main.seminar6.dip1.model.Report;
import Main.seminar6.dip1.model.ReportItem;
import Main.seminar6.dip1.model.util.DisplayPrinter;
import Main.seminar6.dip1.model.util.ReportPrinter;
import Main.seminar6.logger.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger log = Log.log(Main.class.getName());
    public static void main(String[] args) {
        log.log(Level.INFO, "Method main in model package started");
        List<ReportItem> items = new ArrayList<>();

        items.add(new ReportItem("First", (float)5));
        items.add(new ReportItem("Second", (float)6));

        Report report = new Report(items);
        report.output(new ReportPrinter());
        report.output(new DisplayPrinter());
    }
}
