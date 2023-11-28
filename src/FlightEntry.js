import { NavLink } from "react-router-dom";

const max = 160;

const trimDescription = (description, maxLength = max) => {
  return description.length > maxLength
    ? `${description.substring(0, maxLength)}...`
    : description;
};

function FlightEntry({ note, index }) {
  return (
    <li className="note-item" key={`note-item-${index}`}>
      <NavLink to={`/notes/${index + 1}`}>
        <h3 className="note-title">{note.title}</h3>
        <FormattedDate date={note.when} />
        <p
          className="note-description"
          dangerouslySetInnerHTML={{ __html: trimDescription(note.body) }}
        />
      </NavLink>
    </li>
  );
}

export default FlightEntry;