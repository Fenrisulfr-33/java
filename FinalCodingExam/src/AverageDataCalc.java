package FinalCodingExam.src;
import java.util.List;

public class AverageDataCalc extends AbstractDataCalc {
    public AverageDataCalc(DataSet set) {
        super(set);
    }
    @Override
    public String getType() {
        return "AVERAGE";
    }
    @Override
    public double calcLine(List<Double> line) {
        double total = 0;
        for (int i = 0; i < line.size(); i++) {
            total += line.get(i);
        }
        return total / line.size();
    }
}
