package Main.seminar5.dip1.model.util;

import Main.seminar5.dip1.model.ReportItem;
import Main.seminar5.dip1.model.ReportManager;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ReportPrinter implements ReportManager {
    public void output(Collection<ReportItem> items) {
        System.err.println("Output to printer");
        for (ReportItem item : items) {
            System.out.format("printer %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}
