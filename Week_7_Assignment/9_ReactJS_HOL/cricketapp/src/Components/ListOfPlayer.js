import React from 'react';

function ListOfPlayers() {
  const players = [
    { name: "Virat Kohli", score: 85 },
    { name: "Rohit Sharma", score: 55 },
    { name: "KL Rahul", score: 72 },
    { name: "Shubman Gill", score: 66 },
    { name: "Hardik Pandya", score: 45 },
    { name: "Rishabh Pant", score: 91 },
    { name: "Jadeja", score: 34 },
    { name: "Bumrah", score: 78 },
    { name: "Shami", score: 60 },
    { name: "Ashwin", score: 80 },
    { name: "Surya Kumar", score: 67 }
  ];

  // Filter players with score < 70 using arrow function
  const filtered = players.filter(p => p.score < 70);

  return (
    <div>
      <h2>All Players</h2>
      <ul>
        {players.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>

      <h3>Players with score below 70</h3>
      <ul>
        {filtered.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>
    </div>
  );
}

export default ListOfPlayers;
