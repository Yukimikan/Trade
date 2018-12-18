package model;

public class StockTradeFile {

	/* "約定日","受渡日","口座","商品","取引",
	 "銘柄コード","銘柄名","数量（株/口）/返済数量","単価/返済約定単価","手数料",
	 "税金(手数料消費税及び譲渡益税)","利金・分配金・償還金","受渡金額(円)","建約定日","建単価",
	 "建約定金額","建手数料","建手数料消費税","事務管理費","名義書換料",
	 "順日歩","逆日歩","貸株料","諸経費","備考" */

	final static String delimiter = "\",\"";
	final int array_max=25;

	private String r1_contract_date;
	private String r2_past_date;
	private String r3_balance_type;
	private String r4_shop_type;
	private String r5_transact_type;
	private String r6_brand_code;
	private String r7_brand_name;
	private String r8_trade_ammount;
	private String r9_trade_price;
	private String r10_additional_price;
	private String r11_tax;
	private String r13_turnover;

	public String getR1_contract_date() {
		return r1_contract_date;
	}
	public String getR2_past_date() {
		return r2_past_date;
	}
	public String getR3_balance_type() {
		return r3_balance_type;
	}
	public String getR4_shop_type() {
		return r4_shop_type;
	}
	public String getR5_transact_type() {
		return r5_transact_type;
	}
	public String getR6_brand_code() {
		return r6_brand_code;
	}
	public String getR7_brand_name() {
		return r7_brand_name;
	}
	public String getR8_trade_ammount() {
		return r8_trade_ammount;
	}
	public String getR9_trade_price() {
		return r9_trade_price;
	}
	public String getR10_additional_price() {
		return r10_additional_price;
	}
	public String getR11_tax() {
		return r11_tax;
	}
	public String getR13_turnover() {
		return r13_turnover;
	}
	public void setR1_contract_date(String r1_contract_date) {
		this.r1_contract_date = r1_contract_date;
	}
	public void setR2_past_date(String r2_past_date) {
		this.r2_past_date = r2_past_date;
	}
	public void setR3_balance_type(String r3_balance_type) {
		this.r3_balance_type = r3_balance_type;
	}
	public void setR4_shop_type(String r4_shop_type) {
		this.r4_shop_type = r4_shop_type;
	}
	public void setR5_transact_type(String r5_transact_type) {
		this.r5_transact_type = r5_transact_type;
	}
	public void setR6_brand_code(String r6_brand_code) {
		this.r6_brand_code = r6_brand_code;
	}
	public void setR7_brand_name(String r7_brand_name) {
		this.r7_brand_name = r7_brand_name;
	}
	public void setR8_trade_ammount(String r8_trade_ammount) {
		this.r8_trade_ammount = r8_trade_ammount;
	}
	public void setR9_trade_price(String r9_trade_price) {
		this.r9_trade_price = r9_trade_price;
	}
	public void setR10_additional_price(String r10_additional_price) {
		this.r10_additional_price = r10_additional_price;
	}
	public void setR11_tax(String r11_tax) {
		this.r11_tax = r11_tax;
	}
	public void setR13_turnover(String r13_turnover) {
		this.r13_turnover = r13_turnover;
	}

	public StockTradeFile setParam(String line) {

		String[] temp_line = new String[array_max];
		StockTradeFile stockTradefile = new StockTradeFile();

		try {

			temp_line = line.split(delimiter);

			//一つ目の要素は二重カンマを取得しない
			stockTradefile.setR1_contract_date(temp_line[0].replaceAll("\"", ""));

			stockTradefile.setR2_past_date(temp_line[1]);
			stockTradefile.setR3_balance_type(temp_line[2]);
			stockTradefile.setR4_shop_type(temp_line[3]);
			stockTradefile.setR5_transact_type(temp_line[4]);
			stockTradefile.setR6_brand_code(temp_line[5]);
			stockTradefile.setR7_brand_name(temp_line[6]);
			stockTradefile.setR8_trade_ammount(temp_line[7]);
			stockTradefile.setR9_trade_price(temp_line[8]);
			stockTradefile.setR10_additional_price(temp_line[9]);
			stockTradefile.setR11_tax(temp_line[10]);

			//一つ目の要素は二重カンマを取得しない
			stockTradefile.setR13_turnover(temp_line[12].replaceAll("\"", ""));
			//UTF-8で保存しないとエラー
			//System.out.println(stockTradefile.getR1_contract_date() + " " + stockTradefile.getR7_brand_name());

		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		return stockTradefile;
	}


}
