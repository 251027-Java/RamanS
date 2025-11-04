package org.example.Repository;
import java.util.List;
import org.example.Expense;

public interface IRepository {
    public void saveExpenses(List<Expense> expenses);
}
