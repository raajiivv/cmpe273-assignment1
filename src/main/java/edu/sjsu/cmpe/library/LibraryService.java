package edu.sjsu.cmpe.library;

import java.util.concurrent.ConcurrentHashMap;

import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

import edu.sjsu.cmpe.library.api.resources.BookResource;
import edu.sjsu.cmpe.library.api.resources.ReviewResourse;
import edu.sjsu.cmpe.library.api.resources.RootResource;
import edu.sjsu.cmpe.library.config.LibraryServiceConfiguration;
import edu.sjsu.cmpe.library.domain.Book;
import edu.sjsu.cmpe.library.repository.AuthorRepository;
import edu.sjsu.cmpe.library.repository.AuthorRepositoryInterface;
import edu.sjsu.cmpe.library.repository.BookRepository;
import edu.sjsu.cmpe.library.repository.BookRepositoryInterface;
import edu.sjsu.cmpe.library.repository.ReviewRepository;
import edu.sjsu.cmpe.library.repository.ReviewRepositoryInterface;

public class LibraryService extends Service<LibraryServiceConfiguration> {

    public static void main(String[] args) throws Exception {
	new LibraryService().run(args);
    }

    @Override
    public void initialize(Bootstrap<LibraryServiceConfiguration> bootstrap) {
	bootstrap.setName("library-service");
    }

    @Override
    public void run(LibraryServiceConfiguration configuration,
	    Environment environment) throws Exception {
	/** Root API */
	environment.addResource(RootResource.class);
	/** Books APIs */
	AuthorRepositoryInterface authorRepository = new AuthorRepository();
	ReviewRepositoryInterface reviewRepostory = new ReviewRepository();
	BookRepositoryInterface bookRepository = new BookRepository(
		new ConcurrentHashMap<Long, Book>(), authorRepository, reviewRepostory);
	environment.addResource(new BookResource(bookRepository));
	environment.addResource(new ReviewResourse(bookRepository));
	/** Add new resources here */
    }
}
