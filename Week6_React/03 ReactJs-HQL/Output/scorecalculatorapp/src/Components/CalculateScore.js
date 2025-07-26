import React from 'react';
import '../Stylesheets/Style.css';

function CalculateScore(props) {
  const { name, school, total, goal } = props;
  const score = ((total / (goal * 100)) * 100).toFixed(2);

  return (
    <div className="score-box">
      <h2 className="heading">Student Details:</h2>
      <p><span className="label name">Name:</span> {name}</p>
      <p><span className="label school">School:</span> {school}</p>
      <p><span className="label total">Total:</span> {total}Marks</p>
      <p><span className="label score">Score:</span> {score}%</p>
    </div>
  );
}

export default CalculateScore;
