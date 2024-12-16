package FinalCodingExam.src;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractDataCalc {
    private DataSet dataSet;
    private List<Double> finalList = new ArrayList<Double>();

    public AbstractDataCalc(DataSet set) {
        if (set != null) {
            setAndRun(set);
        }

    }

    public void setAndRun(DataSet set) {
        dataSet = set;
        if (dataSet != null) {
            runCalculations();
        }
    }

    private void runCalculations() {
        for (int i = 0; i < dataSet.rowCount(); i++) {
            finalList.add(calcLine(dataSet.getRow(i)));
        }
    }

    public String toString() {
        String response = "Dataset Results (Method: " + getType() + ")\n";
        for (int i = 0; i < finalList.size(); i++) {
            response += "Row " + (i + 1) + ": " + String.format("%.1f", finalList.get(i)) + "\n";
        }
        return response;
    }

    public abstract String getType();

    public abstract double calcLine(List<Double> line);
}
