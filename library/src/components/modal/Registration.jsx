import React, { useState } from "react";
const Registration = ({ setShowReg }) => {
  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");
  const exitModal = () => {
    setShowReg(false);
  };
  const handleTextInput = (e) => {
    let name = e.target.name;
    let value = e.target.value;
    name === "username" ? setUsername(value) : setPassword(value);
  };
  const handleSubmit = async (e) => {
    e.preventDefault();
    const res = await fetch("http://localhost:3004/api/register", {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify({
        username,
        password,
      }),
    }).then((res) => res.json());
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
        <h4>login/Register</h4>
        <div className="input-container">
          <form action="submit">
            <label htmlFor="username">Username </label>
            <br />
            <input
              type="text"
              name="username"
              value={username}
              onChange={(e) => {
                handleTextInput(e);
              }}
            />
            <br />
            <label htmlFor="password">Password</label>
            <br />
            <input
              name="password"
              type="password"
              value={password}
              onChange={(e) => {
                handleTextInput(e);
              }}
            />

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
              Submit
            </button>
          </form>
        </div>
      </div>
    </div>
  );
};

export default Registration;
