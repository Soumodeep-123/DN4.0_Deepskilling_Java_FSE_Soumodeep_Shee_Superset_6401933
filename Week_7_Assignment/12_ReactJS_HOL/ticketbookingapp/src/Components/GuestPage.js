import React from 'react';

function GuestPage() {
  return (
    <div style={{ padding: '20px' }}>
      <h2>Welcome, Guest!</h2>
      <p>You can browse available flights but need to log in to book tickets.</p>
      <ul>
        <li>Flight A - Mumbai to Delhi - ₹5,000</li>
        <li>Flight B - Kolkata to Bangalore - ₹6,800</li>
        <li>Flight C - Chennai to Pune - ₹4,700</li>
      </ul>
    </div>
  );
}

export default GuestPage;
