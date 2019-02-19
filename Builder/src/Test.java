
public class Test {

	public static void main(String[] args) {
			Query query1 = new QueryBuilder().select("name").from("student").build();
			
			Query query2 = new QueryBuilder().select("name").from("student").where("name = 'Name'").build();}

}
