package org.example.Repository;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.util.List;
import org.example.Expense;

public class JSONRepository implements IRepository {
    // Fields
    private String fileName = "expenses.json";
    private Gson gson = new Gson();

    // Constructors
    public JSONRepository() {}

    // Methods
    public void saveExpenses(List<Expense> expenses){
        try {
            FileWriter file = new FileWriter(fileName, false);
            gson.toJson(expenses, file);
            file.close();
            System.out.println("File written successfully");
        } catch (Exception e) {
            System.out.println("Error writing file.");
        }
    }
}
