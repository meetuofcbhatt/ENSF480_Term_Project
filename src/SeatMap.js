import React from 'react';
import Seatmap from 'react-seatmap';
React.render(
    <Seatmap rows={30} maxReservableSeats={3} alpha />,
    document.getElementById('app')
);