package pta.Entity;

public class Livraison {
	
	private String _deliveryCompany;
	private String _deliveryType;
	private boolean _isTracked;
	private double _priceDelivery;
	private String _numDelivery;
	
	
	public Livraison(String _deliveryCompany, String _deliveryType,
			boolean _isTracked, double _priceDelivery, String _numDelivery) {
		this._deliveryCompany = _deliveryCompany;
		this._deliveryType = _deliveryType;
		this._isTracked = _isTracked;
		this._priceDelivery = _priceDelivery;
		this._numDelivery = _numDelivery;
	}


	public String get_deliveryCompany() {
		return _deliveryCompany;
	}


	public void set_deliveryCompany(String _deliveryCompany) {
		this._deliveryCompany = _deliveryCompany;
	}


	public String get_deliveryType() {
		return _deliveryType;
	}


	public void set_deliveryType(String _deliveryType) {
		this._deliveryType = _deliveryType;
	}


	public boolean is_isTracked() {
		return _isTracked;
	}


	public void set_isTracked(boolean _isTracked) {
		this._isTracked = _isTracked;
	}


	public double get_priceDelivery() {
		return _priceDelivery;
	}


	public void set_priceDelivery(double _priceDelivery) {
		this._priceDelivery = _priceDelivery;
	}


	public String get_numDelivery() {
		return _numDelivery;
	}


	public void set_numDelivery(String _numDelivery) {
		this._numDelivery = _numDelivery;
	}
	
	
	
	
	

}
