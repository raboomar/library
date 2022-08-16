import React from "react";
import BookList from "../bookList/BookList";
import "./landingPage.css";
const LandingPage = () => {
  return (
    <div className="landing-container">
      <div className="add-book-container">
        <button className="add-book-btn">Add New Book</button>
      </div>
      <div className="books">
        <BookList />
      </div>
    </div>
  );
};

export default LandingPage;
