package Main.seminar6.dip1.model;

import java.util.Collection;

public class Report{
    private Collection<ReportItem> items;	// report data


    public Report (Collection<ReportItem> items){
        this.items = items;
    }

    // calculate report data
//    public void calculate(){
//        items.add(new ReportItem("First", (float)5));
//        items.add(new ReportItem("Second", (float)6));
//    }

    public void output(ReportManager reportManager){
        reportManager.output(items);
    }
}
