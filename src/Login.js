import React, { useState } from 'react';
import { BrowserRouter as Router, Route, Link, useNavigate } from 'react-router-dom';

const Login = () => {

  const [loggedIn, setLoggedIn] = useState(false);
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');
  const [registrationMode, setRegistrationMode] = useState(false);

  const handleLogin = () => {
    // Implement your login logic here
    // For simplicity, let's just toggle the login state
    setLoggedIn(!loggedIn);
  };

  const handleRegistration = () => {
    // Implement your registration logic here
    // For simplicity, let's just log the username and password for now
    console.log('Username:', username);
    console.log('Password:', password);
  };

  const navigate = useNavigate();
  const handleClick = () => {
    navigate(`/`);}


  return (
    <div>
      <h1>{loggedIn ? 'Welcome, User!' :''}</h1>

      {loggedIn ? (
        <button onClick={handleClick}>Logout</button>
      ) : (
        <>
          <div>
            <label>Username: </label>
            <input
              type="text"
              value={username}
              onChange={(e) => setUsername(e.target.value)}
            />
          </div>
          <div>
            <label>Password: </label>
            <input
              type="password"
              value={password}
              onChange={(e) => setPassword(e.target.value)}
            />
          </div>

          <button onClick={registrationMode ? handleRegistration : handleLogin}>
            {registrationMode ? 'Register' : 'Login'}
          </button>

          <p>
            {registrationMode
              ? 'Already have an account?'
              : "Don't have an account?"}
            <span
              style={{ color: 'blue', cursor: 'pointer' }}
              onClick={() => setRegistrationMode(!registrationMode)}
            >
              {registrationMode ? 'Login' : 'Register'}
            </span>
          </p>
        </>
      )}
    </div>
  );
};

export default Login;
