package Stream;
import java.util.Arrays;
import java.util.List;

record Transaction(String category, double amount) {
}

public class TotalAmountByCategoryExample {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction("grocery", 50.0),
                new Transaction("clothing", 80.0),
                new Transaction("grocery", 30.0),
                new Transaction("electronics", 120.0),
                new Transaction("clothing", 40.0)
        );

        String targetCategory = "grocery";

        double totalAmount = transactions.stream()
                .filter(transaction -> transaction.category().equals(targetCategory))
                .mapToDouble(Transaction::amount)
                .sum();

        System.out.println("Total amount for " + targetCategory + ": " + totalAmount);
    }
}

