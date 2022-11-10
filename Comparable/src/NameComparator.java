import java.util.Comparator;

public class NameComparator implements Comparator<Bus>{

	@Override
	public int compare(Bus o1, Bus o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
