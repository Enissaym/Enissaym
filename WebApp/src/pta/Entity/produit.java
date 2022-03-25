package pta.Entity;

public class produit {
	
	private String _name;
	private String _stateProduct;
	private String _brand;
	private double _price;
	
	
	public produit(String _name, String _stateProduct, String _brand,
			double _price) {
		this._name = _name;
		this._stateProduct = _stateProduct;
		this._brand = _brand;
		this._price = _price;
	}


	public String get_name() {
		return _name;
	}


	public void set_name(String _name) {
		this._name = _name;
	}


	public String get_stateProduct() {
		return _stateProduct;
	}


	public void set_stateProduct(String _stateProduct) {
		this._stateProduct = _stateProduct;
	}


	public String get_brand() {
		return _brand;
	}


	public void set_brand(String _brand) {
		this._brand = _brand;
	}


	public double get_price() {
		return _price;
	}


	public void set_price(double _price) {
		this._price = _price;
	}
	
	

}
