import React from "react";
import "./navbar.css";
const Navbar = () => {
  return (
    <nav>
      <ul>
        <li>Your Library</li>
        <li className="login-container">
          <button
            onClick={() => {
              console.log("hiii");
            }}
            className="login-btn"
          >
            {" "}
            Login{" "}
          </button>
        </li>
      </ul>
    </nav>
  );
};

export default Navbar;
