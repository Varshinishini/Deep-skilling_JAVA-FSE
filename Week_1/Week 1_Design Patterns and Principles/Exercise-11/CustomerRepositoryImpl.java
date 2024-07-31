package DependencyInjectionExample;

public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer findCustomerById(String id) {
        // Simulate database access, returning a dummy customer for the sake of example
        return new Customer(id, "John Doe");
    }
}
