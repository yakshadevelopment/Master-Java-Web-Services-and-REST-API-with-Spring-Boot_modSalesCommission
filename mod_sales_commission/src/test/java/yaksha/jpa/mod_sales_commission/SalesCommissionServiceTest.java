package yaksha.jpa.mod_sales_commission;

import static org.junit.Assert.*;
import org.junit.Test;
import static yaksha.jpa.mod_sales_commission.TestUtils.*;

public class SalesCommissionServiceTest {

	@Test
	public void testCommissionCalculation() throws Exception{
		SalesCommission s1=new SalesCommission("x", 10000.00);
		SalesCommission s2=new SalesCommission("y", 200000.00);
		SalesCommission s3=new SalesCommission("z", 1200000.00);
		SalesCommission c1=new SalesCommissionService().commissionCalculation(s1);
		SalesCommission c2=new SalesCommissionService().commissionCalculation(s2);
		SalesCommission c3=new SalesCommissionService().commissionCalculation(s3);
		int ans1=c1.getCommissionValue().intValue();
		int ans2=c2.getCommissionValue().intValue();
		int ans3=c3.getCommissionValue().intValue();
		yakshaAssert(currentTest(),(ans1==0?"true":"false"),businessTestFile);
		yakshaAssert(currentTest(),(ans2==20000?"true":"false"),businessTestFile);
		yakshaAssert(currentTest(),(ans3==240000?"true":"false"),businessTestFile);
	}

	@Test
    public void testExceptionConditon() throws Exception{
	 yakshaAssert(currentTest(),true,boundaryTestFile);
      }

	@Test
	public void testBoundaryCondition() throws Exception {
	  yakshaAssert(currentTest(),true,exceptionTestFile);
   }

	
}
