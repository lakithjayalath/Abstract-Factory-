
public class Query {
	
	public String SELECT;
	public String FROM;
	public String WHERE;
	public String ORDER_BY;
	
	public void printQuery() {
		System.out.println("SELECT "+SELECT);
		System.out.println("FROM "+FROM);
		System.out.println("WHERE "+WHERE);
		System.out.println("ORDER BY "+ORDER_BY);
	}
	
}
