package org.example.Repository;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.example.Expense;
import org.example.Repository.IRepository;

import javax.swing.text.Document;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;

public class MongoRepository implements IRepository{
    // Fields
                                        // "[language]://[username]:[password]@[host]/[database]?[options]
    private final String connectionString = "mongodb://mongoadmin:asdfghjkllocalhost:27017";

    private final MongoCollection<Document> expensesCollection;

    // Constructor
    public MongoRepository() {
        MongoClient mongoclient = MongoClients.create(connectionString);
        MongoDatabase database = mongoclient.getDatabase("expensesdb");
        this.expensesCollection = database.getCollection("expenses");
        System.out.println("Connected to MongopDb!");
    }

    // Methods
    private Expense documentToExpense(Document doc) {
        return new Expense(id, date, value, merchant);
    }

    private Document expenseToDocument(Expense expense) {
        return new Document(id, date, value, merchant);
    }

    @Override
    public void createExpense(Expense expense) {=

    }

    @Override
    public Expense readExpense(int id) {
        return null;
    }

    @Override
    public void updateExpense(Expense expense) {

    }

    @Override
    public void deleteExpense(int id) {

    }

    @Override
    public List<Expense> loadExpenses() {
        return List.of();
    }

    @Override
    public void saveExpenses(List<Expense> expenses) {

    }
}
