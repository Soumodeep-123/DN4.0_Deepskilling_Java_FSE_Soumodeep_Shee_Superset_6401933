import React from 'react';

function OfficeList() {
  const office = {
    name: "Tech Park Office",
    rent: 75000,
    address: "3rd Floor, Tower B, IT Hub, Bangalore",
    image: "https://pixabay.com/photos/office-open-space-office-room-room-945348/"
  };

  const officeList = [
    {
      name: "Startup Zone",
      rent: 45000,
      address: "HSR Layout, Bangalore",
      image: "https://pixabay.com/photos/furniture-table-chairs-1840463/"
    },
    {
      name: "Corporate Tower",
      rent: 85000,
      address: "Whitefield, Bangalore",
      image: "https://pixabay.com/photos/office-space-office-sunny-coworking-1744805/"
    },
    {
      name: "Eco Space",
      rent: 60000,
      address: "ORR, Bangalore",
      image: "https://pixabay.com/photos/office-meeting-room-conference-room-6883509/"
    }
  ];

  return (
    <div style={{ padding: "20px" }}>
      <h1 style={{ color: "#003366" }}> Office Space Rental Portal</h1>

      {/* Featured Office */}
      <div style={{ border: "1px solid #ccc", marginBottom: "20px", padding: "10px" }}>
        <img src={office.image} alt="Office" style={{ width: "100%", height: "auto" }} />
        <h2>{office.name}</h2>
        <p><strong>Address:</strong> {office.address}</p>
        <p>
          <strong>Rent:</strong>{" "}
          <span style={{ color: office.rent < 60000 ? "red" : "green" }}>
            ₹{office.rent}
          </span>
        </p>
      </div>

      {/* List of Offices */}
      <h2>Other Available Spaces</h2>
      {officeList.map((item, index) => (
        <div key={index} style={{ border: "1px solid #aaa", marginBottom: "20px", padding: "10px" }}>
          <img src={item.image} alt={item.name} style={{ width: "100%", height: "auto" }} />
          <h3>{item.name}</h3>
          <p><strong>Address:</strong> {item.address}</p>
          <p>
            <strong>Rent:</strong>{" "}
            <span style={{ color: item.rent < 60000 ? "red" : "green" }}>
              ₹{item.rent}
            </span>
          </p>
        </div>
      ))}
    </div>
  );
}

export default OfficeList;
