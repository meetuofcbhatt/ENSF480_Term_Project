import FlightEntry from './FlightEntry';

function NoteList({ notes }) {
  return  (<>
    <ul>

        <FlightEntry   />

    </ul>
    <p id="no-note-yet">No Flight Yet</p>
    </>
  );
}

export default NoteList;