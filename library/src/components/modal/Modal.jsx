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
    if (title.length === 0 || author.length === 0) {
      document.querySelector(".error-message").style.visibility = "visible";
    } else {
      setShowAddBook(false);
    }
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
            <label htmlFor="title">Title </label>
            <br />
            <input
              type="text"
              name="title"
              value={title}
              onChange={(e) => {
                handleTextInput(e);
              }}
            />
            <br />
            <label htmlFor="author">Author </label>
            <br />
            <input
              name="author"
              type="text"
              value={author}
              onChange={(e) => {
                handleTextInput(e);
              }}
            />
            <br />
            <input
              type="checkbox"
              name="readIt"
              id="readIt"
              checked={haveReadIt}
              onChange={readIt}
            />

            <label htmlFor="readIt"> Have you read it?</label>
            <br />
            <p className="error-message">
              {" "}
              <b>All fields must be filled out</b>{" "}
            </p>
            <button
              className="add-book-btn"
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
