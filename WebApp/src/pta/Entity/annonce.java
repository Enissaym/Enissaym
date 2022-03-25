package pta.Entity;

public class annonce {
	private String _announceTitle;
	private String _description;
	private String _datePublished;
	private String _city;
	private int _likesNumber;
	
	public annonce(String _announceTitle, String _description,
			String _datePublished, String _city, int _likesNumber) {
		this._announceTitle = _announceTitle;
		this._description = _description;
		this._datePublished = _datePublished;
		this._city = _city;
		this._likesNumber = _likesNumber;
	}

	public String get_announceTitle() {
		return _announceTitle;
	}

	public void set_announceTitle(String _announceTitle) {
		this._announceTitle = _announceTitle;
	}

	public String get_description() {
		return _description;
	}

	public void set_description(String _description) {
		this._description = _description;
	}

	public String get_datePublished() {
		return _datePublished;
	}

	public void set_datePublished(String _datePublished) {
		this._datePublished = _datePublished;
	}

	public String get_city() {
		return _city;
	}

	public void set_city(String _city) {
		this._city = _city;
	}

	public int get_likesNumber() {
		return _likesNumber;
	}

	public void set_likesNumber(int _likesNumber) {
		this._likesNumber = _likesNumber;
	}
	
	

}
