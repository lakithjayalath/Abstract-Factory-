
public class QueryBuilder {
	
	Query query;
	
	public void queryBuilder() {
		query = new Query();
	}
	
	public QueryBuilder select(String select) {
		query.SELECT = select;
		return this;
	}
	
	public QueryBuilder from(String from) {
		query.FROM = from;
		return this;
	}
	
	public QueryBuilder where(String where) {
		query.WHERE = where;
		return this;
	}
	
	public QueryBuilder orderBy(String orderBy) {
		query.ORDER_BY = orderBy;
		return this;
	}
	
	public Query build() {
		System.out.println("select "+query.SELECT);
		return query;
	}
}
