import React, { Component } from 'react';

class EventExamples extends Component {
  constructor(props) {
    super(props);
    this.state = {
      counter: 0,
      message: '',
      rupees: '',
      euro: ''
    };
  }

  // Increments the counter
  increment = () => {
    this.setState(prevState => ({ counter: prevState.counter + 1 }));
    alert("Counter incremented");
  };

  // Decrements the counter
  decrement = () => {
    this.setState(prevState => ({ counter: prevState.counter - 1 }));
    alert("Counter decremented");
  };

  // Say Hello method
  sayHello = () => {
    this.setState({ message: "Hello! Welcome to React Events" });
    alert("Hello Member");
  };

  // Method chaining: Call multiple methods
  handleIncrease = () => {
    this.increment();
    this.sayHello();
  };

  // Method with argument
  sayWelcome = (msg) => {
    this.setState({ message: msg });
     alert(msg); 
  };

  // Synthetic Event
  handleSyntheticEvent = (event) => {
    this.setState({ message: "I was clicked (Synthetic Event)" });
    alert("I was clicked (Synthetic Event)");
  };

  // Currency Conversion (INR → EUR)
  handleSubmit = () => {
    const inr = parseFloat(this.state.rupees);
    if (!isNaN(inr)) {
      const euro = (inr / 89.42).toFixed(2); // Assume 1 Euro = ₹89.42
      this.setState({ euro });
      alert(`Converted ₹${inr} to €${euro}`);
    } else {
      this.setState({ euro: "Invalid input" });
      alert("Please enter a valid INR amount.");
    }
  };

  handleChange = (event) => {
    this.setState({ rupees: event.target.value });
  };

  render() {
    return (
      <div style={{ padding: "20px" }}>
        <h2>React Event Handling Examples</h2>

        <h3>Counter: {this.state.counter}</h3>
        <button onClick={this.increment}>Increment</button>
        <button onClick={this.decrement}>Decrement</button>
        <button onClick={this.handleIncrease}>Increase + Hello</button>

        <br /><br />

        <button onClick={() => this.sayWelcome("Welcome, Developer!")}>Say Welcome</button>
        <br /><br />

        <button onClick={this.handleSyntheticEvent}>Synthetic Event Button</button>

        <br /><br />
        <h3>{this.state.message}</h3>

        <hr />

        <h3>Currency Converter (₹ → €)</h3>
        <input
          type="number"
          placeholder="Enter amount in INR"
          value={this.state.rupees}
          onChange={this.handleChange}
        />
        <button onClick={this.handleSubmit}>Convert</button>
        <p>Converted Amount in Euro: €{this.state.euro}</p>
      </div>
    );
  }
}

export default EventExamples;
