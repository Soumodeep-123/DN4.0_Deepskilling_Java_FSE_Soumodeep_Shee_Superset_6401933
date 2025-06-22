//package practise.Design_Pattern.Architectural_Patterns.Dependency Injection;

interface CustomerRepository {
    String findCustomerById(String id);
}

class CustomerRepositoryImpl implements CustomerRepository {
    public String findCustomerById(String id) {
        
        return "Customer[id=" + id + ", name=Soumodeep Shee]";
    }
}

class CustomerService {
    private CustomerRepository repository;

    // ✅ Constructor Injection (Dependency Injection)
    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public void showCustomer(String id) {
        String customer = repository.findCustomerById(id);
        System.out.println("the repository is : " + customer);
    }
}





public class DependencyInjectionExample {
    public static void main(String[] args) {
        // Manual injection
        CustomerRepository repository = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repository); 

        service.showCustomer("C101");
    }
}
