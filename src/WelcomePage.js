import './WelcomePage.css';
import React, { useState } from 'react';
import { BrowserRouter as Router, Route, Link, useNavigate } from 'react-router-dom';
import FlightUpdate from './FlightUpdate';






function WelcomePage() {
  const [profile, setProfile] = useState(null);
  const logOut = () => {
    setProfile(null);
  
  }
  const navigate = useNavigate();
  const login = () => {
    setProfile(null);
      navigate(`/`);
  
  };

  return (<>
    <header>
        <p>KVMC Airlines</p>
        {(profile) ? (
          <>
            <div >
              <p id="logout"> {profile.name} <button onClick={logOut}>Log out</button> </p>
            </div>
          </>
        ) :
        (
            <div className="buttoncont">
              <button  id="signinbutton" onClick={() => login()}>Sign in</button>
            </div>
        )}
    </header>
    <FlightUpdate/>
          </>
  );
}

export default WelcomePage;