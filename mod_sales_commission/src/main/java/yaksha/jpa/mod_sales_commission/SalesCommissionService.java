package yaksha.jpa.mod_sales_commission;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service 
@Transactional
@Component
public class SalesCommissionService {
	@Autowired
    SalesCommissionRepository repository;
   
	
	public List<SalesCommission> findAll() {
		return repository.findAll();
	}
	
	public  void save(SalesCommission salesCommission) {
		
		salesCommission=commissionCalculation(salesCommission);
		repository.save(salesCommission);
	}
	
	public SalesCommission findById(long id) {
		
		return repository.findById(id).get();
		
	}
	public SalesCommission commissionCalculation(SalesCommission salesCommission)
	{
		double salesValue=salesCommission.getSalesValue();
		double commission=0.0;
		if(salesValue>1000000.00)
			commission=salesValue*0.20;
		else if(salesValue>500000.00)
			commission=salesValue*0.15;
		else if(salesValue>100000.00)
			commission=salesValue*0.1;
		salesCommission.setCommissionValue(commission);
		return salesCommission;
	}
	public Long getLastId()
	{
		return repository.getMaxId();
	}
	
	
	

}
