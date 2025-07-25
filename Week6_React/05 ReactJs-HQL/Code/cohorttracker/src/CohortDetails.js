import React from 'react';
import styles from './CohortDetails.module.css';

function CohortDetails({ cohort }) {
  const titleClass =
    cohort.status.toLowerCase() === 'ongoing' ? styles.titleGreen : styles.titleBlue;

  return (
    <div className={styles.box}>
      <h3 className={titleClass}>{cohort.name}</h3>
      <dl>
        <dt>Started On</dt>
        <dd>{cohort.startDate}</dd>

        <dt>Current Status</dt>
        <dd>{cohort.status}</dd>

        <dt>Coach</dt>
        <dd>{cohort.coach}</dd>

        <dt>Trainer</dt>
        <dd>{cohort.trainer}</dd>
      </dl>
    </div>
  );
}

export default CohortDetails;
