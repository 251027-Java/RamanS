import ExpenseItem from "./ExpenseItem";

const ExpenseList = ({items}) => {
    return (
        <div className = "w-full mx-auto bg-slate-200 p-6 rounded-2xl shadow-inner">
            { items.map ((expense) => (
                <ExpenseItem 
                    key = {expense.id}
                    title = {expense.title}
                    amount = {expense.amount}
                    date = {expense.date}
                />
            )) }
        </div>
    );
};

export default ExpenseList;