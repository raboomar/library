import React from "react";
import "./bookList.css";
const BookList = () => {
  let books = [
    { title: "test1", author: "test1" },
    { title: "test2", author: "test2" },
    { title: "test2", author: "test2" },
    { title: "test2", author: "test2" },
    { title: "test2", author: "test2" },
    { title: "test2", author: "test2" },
    { title: "test2", author: "test2" },
    { title: "test2", author: "test2" },
    { title: "test2", author: "test2" },
    { title: "test2", author: "test2" },
    { title: "test2", author: "test2" },
    { title: "test2", author: "test2" },
  ];
  return (
    <>
      {books.map((book) => (
        <div className="card">
          <div className="container">
            <h4 className="book-name">{book.title}</h4>
            <h5 className="book-author">{book.author}</h5>
            <button className="read-it"> Read</button>
            <button className="remove-book">Remove</button>
          </div>
        </div>
      ))}
    </>
  );
};

export default BookList;
