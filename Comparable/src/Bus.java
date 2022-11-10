
public class Bus implements Comparable<Bus> {
	private int id;
	private String name;
	private double cost;
	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bus(int id, String name, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Bus [id=" + id + ", name=" + name + ", cost=" + cost + "]";
	}
	
	  @Override public int compareTo(Bus o) { 
		  Integer i1=this.id; 
		  Integer i2=o.id;
	  return i1.compareTo(i2); 
	  }
	
	
}
