import React, { useState } from "react";
import BookList from "../bookList/BookList";
import Modal from "../modal/Modal";
import "./landingPage.css";
const LandingPage = () => {
  const [showAddBook, setShowAddBook] = useState(false);
  const addNewBook = () => {
    setShowAddBook(true);
  };
  return (
    <div className="landing-container">
      <div className="add-book-container">
        <button
          onClick={() => {
            addNewBook();
          }}
          className="add-book-btn"
        >
          Add New Book
        </button>
      </div>
      {showAddBook ? <Modal setShowAddBook={setShowAddBook} /> : null}
      <div className="books">
        <BookList />
      </div>
    </div>
  );
};

export default LandingPage;
