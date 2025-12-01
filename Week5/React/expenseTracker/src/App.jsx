import ExpenseList from "./components/ExpenseList";

function App() {
  const expenses = [
    {
      id: "e1",
      title: "Testing1",
      amount: "123",
      date: new Date(2023, 1, 1),
    },
    {
      id: "e2",
      title: "Testing2",
      amount: "234",
      date: new Date(2023, 5, 1),
    },
    {
      id: "e3",
      title: "Testing3",
      amount: "345",
      date: new Date(2023, 6, 1),
    },
    { 
      id: "e4",
      title: "Testing4",
      amount: "456",
      date: new Date(2023, 6, 1),
    },
  ];
  return (
    <div className = " min-h-screen bg-slate-900 px-4 font-sans">
        <h1 className = " text-3x1 text-slate-100 font-bold"> Testing testing, 123!</h1>
        <ExpenseList items = {expenses} />
      </div>
  )
}

export default App;
