package com.example.spring_jdbc;

import com.example.spring_jdbc.enity.Customer;
import com.example.spring_jdbc.service.CustomerServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SpringJdbcApplication  implements CommandLineRunner {
    private static Logger logger= LogManager.getLogger(SpringJdbcApplication.class);
    private static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        SpringApplication.run(SpringJdbcApplication.class, args);
    }

    @Autowired
    CustomerServiceImpl customerService;

    @Override
    public void run(String... args) throws Exception {
//        Customer customer1= new Customer(7022713722L, "Lucy", 27, "F", "INDIA", 3);
//        Customer customer2= new Customer(7022713723L, "Robert", 27, "F", "INDIA", 3);
//        Customer customer3= new Customer(7022713724L, "Robert", 27, "F", "INDIA", 3);
//        Customer customer4= new Customer(7022713725L, "Robert", 27, "F", "INDIA", 3);
//        Customer customer5= new Customer(7022713726L, "Robert", 27, "F", "INDIA", 3);
//        Customer[]custarray={customer1,customer2,customer3,customer4,customer5};
//        for(Customer i:custarray){
//            customerService.insert(i);
//        }
//        logger.info("Record inserted Successfully");



//        logger.info("Enter the phone number needs to be deleted:");
//        Long phoneNo = scanner.nextLong();
//
//        int result = customerService.remove(phoneNo);
//        if (result == 1) {
//            logger.info("Success : Record deleted successfully ");
//        } else {
//            logger.info("Error : No record found for the given phone number ");
//        }
//        scanner.close();


//        List<Customer> custList = customerService.getAll();
//
//        logger.info(" **** Records in the Table ****");
//        logger.info(" PhoneNo        Name    Age   Gender    Address       PlanID");
//        for (Customer list : custList) {
//            logger.info(list.getPhoneNumber() + "\t" + list.getName() + "\t" + list.getAge() + "\t" + list.getGender()
//                    + "\t" + list.getAddress() + "\t\t" + list.getPlanId());
//        }

//        logger.info("Number of records in the Employee Table are " + customerService.getCount());

//        logger.info("Enter the customer number to be updated ");
//        Long custNo = scanner.nextLong();
//        logger.info("Enter the new Address:  ");
//        String address = scanner.next();
//        int x1 = customerService.update(custNo, address);
//        if (x1 > 0) {
//            logger.info(" Record Updated ");
//        } else {
//            logger.info(" No records found for the empid given ");
//        }
//        logger.info("Enter the PhoneNo to be fetched ");
//        custNo = scanner.nextLong();
//        logger.info(customerService.get(custNo));

    }
}
