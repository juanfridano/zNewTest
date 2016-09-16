package controllers;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;

import data.solr.Product;
import data.solr.ProductRepository;

@SpringBootApplication
@ComponentScan(basePackages = "data.solr")
@EnableSolrRepositories("data.solr.ProductRepository")
public class App implements CommandLineRunner {

	// @Autowired
	private ProductRepository repository;

	public static void main(String[] args) throws Exception {

		SpringApplication.run(App.class, args);
	}


	@Bean
	public String solrTemplate() {

		return null;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("juhuu!!!");
		this.repository.deleteAll();

		// insert some products
		this.repository.save(new Product("1", "Nintendo Entertainment System"));
		this.repository.save(new Product("2", "Sega Megadrive"));
		this.repository.save(new Product("3", "Sony Playstation"));

		// fetch all
		System.out.println("Products found by findAll():");
		System.out.println("----------------------------");
		for (Product product : this.repository.findAll()) {
			System.out.println(product);
		}
		System.out.println();

		// fetch a single product
		System.out.println("Products found with findByNameStartingWith('So'):");
		System.out.println("--------------------------------");
		for (Product product : this.repository.findByNameStartingWith("So")) {
			System.out.println(product);
		}
		System.out.println();
	}
}