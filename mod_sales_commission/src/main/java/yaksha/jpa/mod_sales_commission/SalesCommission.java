package yaksha.jpa.mod_sales_commission;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SalesCommission {
@Id
@GeneratedValue
 private Long id;
private String name;

private Double salesValue;
private Double commissionValue;
public SalesCommission() {
	super();
	// TODO Auto-generated constructor stub
}
public SalesCommission(Long id, String name, Double salesValue, Double commissionValue) {
	super();
	this.id = id;
	this.name = name;
	this.salesValue = salesValue;
	this.commissionValue = commissionValue;
}
public SalesCommission(String name, Double salesValue) {
	super();
	this.name = name;
	this.salesValue = salesValue;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Double getSalesValue() {
	return salesValue;
}
public void setSalesValue(Double salesValue) {
	this.salesValue = salesValue;
}
public Double getCommissionValue() {
	return commissionValue;
}
public void setCommissionValue(Double commissionValue) {
	this.commissionValue = commissionValue;
}


 
}
