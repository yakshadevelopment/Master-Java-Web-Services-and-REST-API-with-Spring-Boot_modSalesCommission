package yaksha.jpa.mod_sales_commission;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import edu.yaksha.salesapp.GetAllSalespersonRequest;
import edu.yaksha.salesapp.GetAllSalespersonResponse;
import edu.yaksha.salesapp.GetSalespersonRequest;
import edu.yaksha.salesapp.GetSalespersonResponse;
import edu.yaksha.salesapp.SalesPerson;

@Endpoint
public class SalesCommissionEndpoint {
    @Autowired
    SalesCommissionService service;
	
    @PayloadRoot(namespace = "http://yaksha.edu/salesapp", localPart = "GetSalespersonRequest")
	@ResponsePayload
	public GetSalespersonResponse processSalesPersonRequest(@RequestPayload GetSalespersonRequest request)
	{
		SalesCommission salesCommission=new SalesCommission(request.getName(), request.getSalesValue());
		service.save(salesCommission);
		SalesCommission salesComm=service.findById(service.getLastId());
		SalesPerson salesPerson=salesPersonMapper(salesComm);
		  GetSalespersonResponse response=new GetSalespersonResponse();		
			response.setSalesperson(salesPerson);
		return response;
	}
	
    @PayloadRoot(namespace = "http://yaksha.edu/salesapp", localPart = "GetAllSalespersonRequest")
	@ResponsePayload
	public GetAllSalespersonResponse processAllSalesPersonRequest(@RequestPayload GetAllSalespersonRequest request)
	{
    	List<SalesCommission> salesCommList=service.findAll();
		GetAllSalespersonResponse response=new GetAllSalespersonResponse();	
		for(SalesCommission saleComm:salesCommList)
		{
			SalesPerson salesPerson=salesPersonMapper(saleComm);
			response.getSalesperson().add(salesPerson);
		}
		return response;
	}
	
	private SalesPerson salesPersonMapper(SalesCommission salesCommission)
	{
		SalesPerson salesPerson=new SalesPerson();
		long x=salesCommission.getId();
		int id=(int)x;
		salesPerson.setId(id);
		salesPerson.setName(salesCommission.getName());
		salesPerson.setSalesValue(salesCommission.getSalesValue());
		salesPerson.setCommissionValue(salesCommission.getCommissionValue());
		return salesPerson;
	}
}