package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;

import data.solr.ProductRepository;

@SpringBootApplication
@ComponentScan(basePackages = "data.solr")
@EnableSolrRepositories("data.solr.ProductRepository")
public class App implements CommandLineRunner {

	@Autowired
	private ProductRepository repository;

	public static void main(String[] args) throws Exception {

		SpringApplication.run(App.class, args);
	}

	SolrTemplate st;

	@Bean
	public String solrTemplate() {

		return null;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("juhuu!!!");
		
		//repository.toString();
	}
}