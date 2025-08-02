// src/TrainerDetail.js
import React from 'react';
import { Link, useParams } from 'react-router-dom';
import trainers from './TrainersMock';

function TrainerDetail() {
  const { id } = useParams();

  // Safely find trainer using optional chaining
  const trainer = trainers.find((t) => t?.trainerId?.toString() === id);

  if (!trainer) {
    return <h3>Trainer not found!</h3>;
  }

  return (
    <div style={{ border: '1px solid black', width: '400px', padding: '20px', fontFamily: 'Arial' }}>
      <h1>My Academy Trainers App</h1>
      <nav>
        <Link to="/">Home</Link> | <Link to="/trainers">Show Trainers</Link>
      </nav>

      <h3 style={{ marginTop: '20px' }}>Trainer Details</h3>

      <p><strong>{trainer.name} ({trainer.technology})</strong></p>
      <p>{trainer.email}</p>
      <p>{trainer.phone}</p>

      <ul>
        {trainer.skills.map((skill, index) => (
          <li key={index}> {skill}</li>
        ))}
      </ul>
    </div>
  );
}

export default TrainerDetail;
