package pta.Entity;

public class utilisateur {
	
	private String _username;
	private String _password;
	private String _surname;
	private String _name;
	private String _mail;
	private String _phone;
	private String _city;

	public utilisateur(String _username, String _password, String _surname,
			String _name, String _mail, String _phone, String _city) 
	{
		this._username = _username;
		this._password = _password;
		this._surname = _surname;
		this._name = _name;
		this._mail = _mail;
		this._phone = _phone;
		this._city = _city;
	}

	public String get_username() {
		return _username;
	}

	public void set_username(String _username) {
		this._username = _username;
	}

	public String get_password() {
		return _password;
	}

	public void set_password(String _password) {
		this._password = _password;
	}

	public String get_surname() {
		return _surname;
	}

	public void set_surname(String _surname) {
		this._surname = _surname;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public String get_mail() {
		return _mail;
	}

	public void set_mail(String _mail) {
		this._mail = _mail;
	}

	public String get_phone() {
		return _phone;
	}

	public void set_phone(String _phone) {
		this._phone = _phone;
	}

	public String get_city() {
		return _city;
	}

	public void set_city(String _city) {
		this._city = _city;
	}
	
	
	
}
