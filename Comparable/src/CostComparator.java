import java.util.Comparator;

public class CostComparator implements Comparator<Bus> {

	@Override
	public int compare(Bus b1, Bus b2) {
		Double d1=b1.getCost();
		Double d2=b2.getCost();
		return d1.compareTo(d2);
	}

}
