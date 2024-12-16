package FinalCodingExam.src;
import java.util.List;

public class MinimumDataCalc extends AbstractDataCalc {
    public MinimumDataCalc(DataSet set) {
        super(set);
    }
    @Override
    public String getType() {
        return "MIN";
    }
    @Override
    public double calcLine(List<Double> line) {
        int min = 0;
        for (int i = 0; i < line.size(); i++) {
            if (line.get(min) > line.get(i)) {
                min = i;
            }
        }
        return line.get(min);
    }
}
