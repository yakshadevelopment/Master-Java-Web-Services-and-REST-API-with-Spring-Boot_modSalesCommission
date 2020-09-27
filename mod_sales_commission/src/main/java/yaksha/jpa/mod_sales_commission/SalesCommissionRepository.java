package yaksha.jpa.mod_sales_commission;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SalesCommissionRepository extends JpaRepository<SalesCommission,Long> {

	@Query(value="select max(id) from SalesCommission")
	 public Long getMaxId();

}
