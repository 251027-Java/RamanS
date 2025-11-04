package org.example;

import org.example.Repository.CSVRepository;
import org.example.Repository.IRepository;
import org.example.Repository.JSONRepository;
import org.example.Repository.TextRepository;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

// As a user, I want to track my expenses so that I can build/submit an expense report at the end of the week.
// As a user, I need to include the date, value, and merchant to include on my expense report.

public class Main {
    // Fields

    // Methods
    public static void main(String[] args) {

        System.out.println("org.example.Expense Tracker Starting...");
        List<Expense> expenses = new ArrayList<Expense>();

        System.out.println("Creating a test expense:");

        expenses.add(new Expense(1, new Date(), 99.95, "Walmart"));
        expenses.add(new Expense(2, new Date(), 87.75, "Costco"));
        expenses.add(new Expense(3, new Date(), 10000, "Private Jet"));

        System.out.println(expenses);

        // THIS is where we switch our Repository from one to another
        IRepository repo = new TextRepository();
        //IRepository repo = new CSVRepository();
        //IRepository repo = new JSONRepository();

        repo.saveExpenses(expenses);

        System.out.println("org.example.Expense Tracking Closing...");
    }
}
