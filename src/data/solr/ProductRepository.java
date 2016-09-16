package data.solr;

import java.util.List;

import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface ProductRepository extends SolrCrudRepository<Product, String> {

	List<Product> findByNameStartingWith(String name);

}
