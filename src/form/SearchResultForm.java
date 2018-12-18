package form;

public class SearchResultForm {
	//パラメタ名
	public static final String PRM_cntr_date_lst = "cntr_date_lst";
	public static final String PRM_brandname_lst = "brandname_lst";

	private String cntr_date;
	private String brandname;

	public String getCntr_date() {
		return cntr_date;
	}
	public void setCntr_date(String cntr_date) {
		this.cntr_date = cntr_date;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

}
