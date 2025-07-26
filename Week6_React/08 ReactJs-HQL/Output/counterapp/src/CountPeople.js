import React from 'react';
import './CountPeople.css';

class CountPeople extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      entryCount: 0,
      exitCount: 0
    };
  }

  updateEntry = () => {
    this.setState(prevState => ({
      entryCount: prevState.entryCount + 1
    }));
  };

  updateExit = () => {
    this.setState(prevState => ({
      exitCount: prevState.exitCount + 1
    }));
  };

  render() {
    return (
      <div className="container">
        <h2>People Counter</h2>
        <div className="counter-box">
          <p><strong>People Entered!!!:</strong> {this.state.entryCount}</p>
          <p><strong>People Left!!!:</strong> {this.state.exitCount}</p>
        </div>
        <div className="button-group">
          <button onClick={this.updateEntry}>Login</button>
          <button onClick={this.updateExit}>Exit</button>
        </div>
      </div>
    );
  }
}

export default CountPeople;
