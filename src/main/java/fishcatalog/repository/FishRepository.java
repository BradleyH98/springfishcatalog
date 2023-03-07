package fishcatalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fishcatalog.beans.Fishes;

/**
 * @author Bradh 
 * CIS175 23290 Java II Spring 2023
 * Mar 6, 2023
 */

@Repository
public interface FishRepository extends JpaRepository<Fishes, Long>{

}
