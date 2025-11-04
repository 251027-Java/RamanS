package org.example.Repository;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import org.example.Expense;

public class TextRepository implements IRepository{
    // Fields
    private String fileName = "expenses.txt";

    // Constructors
    public TextRepository() {}

    // Methods
    public void saveExpenses(List<Expense> expenses) {
        try {
            FileWriter file = new FileWriter(fileName, false);
            PrintWriter writer = new PrintWriter(file, true);
            writer.println(expenses);
            System.out.println("File written successfully");
        } catch (Exception e) {
            System.out.println("Error writing file.");
        }
    }
}



