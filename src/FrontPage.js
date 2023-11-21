import React, { useState } from 'react';
import { BrowserRouter as Router, Route, Link, useNavigate } from 'react-router-dom';


const FrontPage= () => {
  const [selectedRole, setSelectedRole] = useState('');

  const navigate = useNavigate();
  const handleClick = (role) => {
    navigate(`/${role}`);
    setSelectedRole(role);}



  return (
    <div>
      <h1>Welcome to the Login Portal</h1>
      <p>Please select your role:</p>
      <ul>
        <li>
          <button onClick={() => handleClick('user')}>User</button>
        </li>
        <li>
          <button onClick={() => handleClick('tourismAgent')}>Tourism Agent</button>
        </li>
        <li>
          <button onClick={() => handleClick('airlineAgent')}>Airline Agent</button>
        </li>
        <li>
          <button onClick={() => handleClick('flightAttendant')}>Flight Attendant</button>
        </li>
        <li>
          <button onClick={() => handleClick('systemAdmin')}>System Admin</button>
        </li>
      </ul>

    </div>
  );
};

export default FrontPage;
