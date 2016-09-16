package data.solr;

import java.util.List;

import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service 
@Transactional
public interface ProductRepository extends SolrCrudRepository<Product, String> {

	List<Product> findByNameStartingWith(String name);

}
