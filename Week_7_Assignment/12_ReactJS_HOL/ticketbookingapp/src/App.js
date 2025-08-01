import React, { useState } from 'react';
import './App.css';
import GuestPage from './Components/GuestPage';
import UserPage from './Components/UserPage';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLogin = () => {
    setIsLoggedIn(true);
    alert("Successfully logged in!");
  };

  const handleLogout = () => {
    setIsLoggedIn(false);
    alert("Successfully logged out!");
  };

  return (
    <div className="App" style={{ padding: '20px' }}>
      <h1>Ticket Booking App</h1>
      {isLoggedIn ? (
        <>
          <UserPage />
          <button onClick={handleLogout} style={{ marginTop: '20px' }}>Logout</button>
        </>
      ) : (
        <>
          <GuestPage />
          <button onClick={handleLogin} style={{ marginTop: '20px' }}>Login</button>
        </>
      )}
    </div>
  );
}

export default App;
