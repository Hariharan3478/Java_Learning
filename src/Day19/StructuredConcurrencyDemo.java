package Day19;

import java.util.concurrent.StructuredTaskScope;

public class StructuredConcurrencyDemo {

    public static void main(String[] args)
            throws InterruptedException {

        try (var scope = StructuredTaskScope.open()) {

            var customer = scope.fork(() -> {
                Thread.sleep(1000);
                return "Customer Details Fetched";
            });

            var orders = scope.fork(() -> {
                Thread.sleep(1500);
                return "Orders Fetched";
            });

            var payment = scope.fork(() -> {
                Thread.sleep(500);
                return "Payment Successful";
            });

            scope.join();

            System.out.println(customer.get());
            System.out.println(orders.get());
            System.out.println(payment.get());
        }
    }
}
