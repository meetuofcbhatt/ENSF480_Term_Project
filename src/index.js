import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import reportWebVitals from './reportWebVitals';
import FrontPage from './FrontPage';
import Login from './Login';

import { BrowserRouter, Route, Routes } from "react-router-dom";

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
<BrowserRouter>
    <Routes>
        <Route exact path="/"element={<FrontPage/>} />
        <Route path="/user" element={<Login/>} />
        <Route path="/tourismAgent" element={<Login/>} />
        <Route path="/airlineAgent"element={<Login/>} />
        <Route path="/flightAttendant" element={<Login/>} />
        <Route path="/systemAdmin" element={<Login/>} />

    </Routes>
 </BrowserRouter>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
