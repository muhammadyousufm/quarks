package org.acme.getting.started.repository;
import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class PersonRepository implements PanacheMongoRepository<Person> {
    // You can add custom methods here if needed
}
