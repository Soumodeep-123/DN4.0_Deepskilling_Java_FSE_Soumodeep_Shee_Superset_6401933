import React from 'react';

function IndianPlayers() {
  const team = [
    "Virat", "Rohit", "Rahul", "Pant", "Shami", "Jadeja", "Bumrah", "Surya", "Gill", "Ashwin", "Hardik"
  ];

  // Destructuring odd/even players
  const oddTeam = team.filter((_, idx) => idx % 2 !== 0);
  const evenTeam = team.filter((_, idx) => idx % 2 === 0);

  // Merge feature of ES6 using spread operator
  const T20players = ["Kohli", "Rohit", "Surya"];
  const RanjiTrophyPlayers = ["Pujara", "Rahane"];
  const allPlayers = [...T20players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h2>Indian Players</h2>

      <h3>Even Team Players</h3>
      <ul>
        {evenTeam.map((p, i) => (<li key={i}>{p}</li>))}
      </ul>

      <h3>Odd Team Players</h3>
      <ul>
        {oddTeam.map((p, i) =>  (<li key={i}>{p}</li>))}
      </ul>

      <h3>All Players (Merged from T20 and Ranji)</h3>
      <ul>
        {allPlayers.map((p, i) => <li key={i}>{p}</li>)}
      </ul>
    </div>
  );
}

export default IndianPlayers;
