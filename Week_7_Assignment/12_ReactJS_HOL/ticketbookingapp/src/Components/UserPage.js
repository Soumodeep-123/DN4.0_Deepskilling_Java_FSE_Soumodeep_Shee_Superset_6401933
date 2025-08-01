import React from 'react';

function UserPage() {
  return (
    <div style={{ padding: '20px' }}>
      <h2>Welcome Back, User!</h2>
      <p>You can now book your tickets.</p>
      <ul>
        <li>
          Flight A - Mumbai to Delhi - ₹5,000 
          <button style={{ marginLeft: '10px' }}>Book</button>
        </li>
        <li>
          Flight B - Kolkata to Bangalore - ₹6,800 
          <button style={{ marginLeft: '10px' }}>Book</button>
        </li>
        <li>
          Flight C - Chennai to Pune - ₹4,700 
          <button style={{ marginLeft: '10px' }}>Book</button>
        </li>
      </ul>
    </div>
  );
}

export default UserPage;
