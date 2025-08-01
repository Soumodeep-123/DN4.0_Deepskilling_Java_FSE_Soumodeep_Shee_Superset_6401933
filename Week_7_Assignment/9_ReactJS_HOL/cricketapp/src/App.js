import React, { useState } from 'react';
import './App.css';
import ListOfPlayers from './Components/ListOfPlayer';
import IndianPlayers from './Components/IndianPlayers';

function App() {
  const [flag, setFlag] = useState(true);

  return (
    <div className="App">
      <h1>🏏 Welcome to Cricket App</h1>
      <button onClick={() => setFlag(!flag)}>
        Show {flag ? "Indian Players" : "All Players"}
      </button>
      <br /><br />
      {flag ? <ListOfPlayers /> : <IndianPlayers />}
    </div>
  );
}

export default App;
