import React, { useState } from "react";
import Registration from "../modal/Registration";
import "./navbar.css";
const Navbar = () => {
  const [showRed, setShowReg] = useState(false);
  const handleRegModal = () => {
    showRed ? setShowReg(false) : setShowReg(true);
  };
  return (
    <nav>
      <ul>
        <li>Your Library</li>
        <li className="login-container">
          <button
            onClick={() => {
              handleRegModal();
            }}
            className="login-btn"
          >
            Login
          </button>
        </li>
      </ul>
      {showRed ? <Registration setShowReg={setShowReg} /> : null}
    </nav>
  );
};

export default Navbar;
