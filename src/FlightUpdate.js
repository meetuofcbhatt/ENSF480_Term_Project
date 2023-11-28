import FlightEntry from "./FlightEntry ";

function NoteList({ notes }) {
  return notes.length > 0 ? (
    <ul>
      {notes.map((note, index) => (
        <FlightEntry  note={note} index={index} key={`node-item-${index}`} />
      ))}
    </ul>
  ) : (
    <p id="no-note-yet">No Flight Yet</p>
  );
}

export default NoteList;