package org.example.Repository;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;
import org.example.Expense;

public class CSVRepository implements IRepository {
    // Fields
    private String fileName = "expenses.csv";
    // Constructors
    public CSVRepository() {}
    // Methods

    public void saveExpenses(List<Expense> expenses){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            //Write the header line...
            writer.write("id, date, value, merchant");
            writer.newLine();

            for (Expense ex: expenses) {
                writer.write(ex.toCSV());
                writer.newLine();
            }
            writer.flush();
            writer.close();
            System.out.println("File written successfully");
        } catch (Exception e) {
            System.out.println("Error writing file.");
        }
    }
}
