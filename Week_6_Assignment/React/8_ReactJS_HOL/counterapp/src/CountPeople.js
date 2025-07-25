import React, { Component } from 'react';

class CountPeople extends Component {
  constructor() {
    super();
    this.state = {
      entrycount: 0,
      exitcount: 0,
      c: 0
    };
  }

  updateEntry() {
    this.setState((prevState, props) => {
      return { entrycount: prevState.entrycount + 1 };
    });
  }

  updateExit() {
    this.setState((prevState, props) => {
      return { exitcount: prevState.exitcount + 1 };
    });
  }

  render() {
    return (
      <div style={{ textAlign: 'center', padding: '20px' }}>
        <h1>People Counter</h1>
        <div style={{ margin: '20px 0' }}>
          <h2>People Entered: {this.state.entrycount}</h2>
          <h2>People Left: {this.state.exitcount}</h2>
        </div>
        <div style={{ margin: '20px 0' }}>
          <button 
            onClick={() => this.updateEntry()} 
            style={{ 
              padding: '10px 20px', 
              margin: '0 10px', 
              fontSize: '16px',
              backgroundColor: '#4CAF50',
              color: 'white',
              border: 'none',
              borderRadius: '5px',
              cursor: 'pointer'
            }}
          >
            Login
          </button>
          <button 
            onClick={() => this.updateExit()} 
            style={{ 
              padding: '10px 20px', 
              margin: '0 10px', 
              fontSize: '16px',
              backgroundColor: '#f44336',
              color: 'white',
              border: 'none',
              borderRadius: '5px',
              cursor: 'pointer'
            }}
          >
            Exit
          </button>
        </div>
      </div>
    );
  }
}

export default CountPeople;
