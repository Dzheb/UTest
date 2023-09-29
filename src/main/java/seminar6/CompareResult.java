package seminar6;

public class CompareResult {
    double l1Average;
    double l2Average;

    public CompareResult(double l1Average, double l2Average) {
        this.l1Average = l1Average;
        this.l2Average = l2Average;
    }
    public String compareResult() {
        String compareResult = "Средние значения равны";
        if(this.l1Average > this.l2Average) compareResult = "Первый список имеет большее среднее значение";
        else if (this.l1Average < this.l2Average) {
            compareResult = "Второй список имеет большее среднее значение";
        };
        return compareResult;
    }
}
