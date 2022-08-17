import React, { useState } from "react";
import "./modal.css";
const Modal = ({ setShowAddBook }) => {
  const [haveReadIt, setHaveReadIt] = useState(false);
  const [title, setTitle] = useState("");
  const [author, setAuthor] = useState("");
  const readIt = () => {
    haveReadIt ? setHaveReadIt(false) : setHaveReadIt(true);
  };
  const handleTextInput = (e) => {
    let name = e.target.name;
    let value = e.target.value;
    name === "title" ? setTitle(value) : setAuthor(value);
  };

  const exitModal = () => {
    setShowAddBook(false);
  };
  const handleSubmit = (e) => {
    e.preventDefault();
    console.log("in here");
  };
  return (
    <div className="modal-container">
      <div className="modal-content">
        <span
          onClick={() => {
            exitModal();
          }}
          className="close"
        >
          &times;
        </span>
        <h4>Add new Book</h4>
        <div className="input-container">
          <form action="submit">
            <label htmlFor="title">
              Title{" "}
              <input
                type="text"
                name="title"
                value={title}
                onChange={(e) => {
                  handleTextInput(e);
                }}
              />
            </label>
            <br />
            <label htmlFor="author">
              Author{" "}
              <input
                name="author"
                type="text"
                value={author}
                onChange={(e) => {
                  handleTextInput(e);
                }}
              />
            </label>

            <br />
            <input
              type="checkbox"
              name="readIt"
              id="readIt"
              checked={haveReadIt}
              onChange={readIt}
            />
            <label htmlFor="readIt"> have you read it?</label>
            <br />
            <p className="error-message">All fields must be filled out</p>
            <button
              type="submit"
              onClick={(e) => {
                handleSubmit(e);
              }}
            >
              Add Book
            </button>
          </form>
        </div>
      </div>
    </div>
  );
};

export default Modal;
