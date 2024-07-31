package DependencyInjectionExample;

public class DependencyInjectionDemo {
    public static void main(String[] args) {
        // Create the repository instance
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        // Inject the repository into the service using constructor injection
        CustomerService customerService = new CustomerService(customerRepository);

        // Use the service to find a customer
        Customer customer = customerService.findCustomerById("C123");
        System.out.println("Found customer: " + customer);
    }
}
