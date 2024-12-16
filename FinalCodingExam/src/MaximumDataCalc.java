package FinalCodingExam.src;
import java.util.List;

public class MaximumDataCalc extends AbstractDataCalc {
    public MaximumDataCalc(DataSet set) {
        super(set);
    }
    @Override
    public String getType() {
        return "MAX";
    }
    @Override
    public double calcLine(List<Double> line) {
        int max = 0;
        for (int i = 0; i < line.size(); i++) {
            if (line.get(max) < line.get(i)) {
                max = i;
            }
        }
        return line.get(max);
    }
}
