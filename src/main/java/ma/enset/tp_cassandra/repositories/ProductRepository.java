package ma.enset.tp_cassandra.repositories;

import ma.enset.tp_cassandra.entities.Product;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

public interface ProductRepository extends CassandraRepository<Product,UUID> {

}
