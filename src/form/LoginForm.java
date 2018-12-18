package form;

public class LoginForm {

	private String name; //ユーザ名
	private String pass; //パスワード

	public LoginForm() {	}
	public LoginForm(String name, String pass) {
		this.name = name;
		this.pass = pass;
	}
	public String getName() {	return name;}
	public String getPass() {	return pass;}
}
