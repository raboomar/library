import LandingPage from "./components/LandingPage";
import "./App.css";
import Navbar from "./components/navbar/Navbar.jsx";
function App() {
  return (
    <div className="grid-container">
      <div className="header">
        <Navbar />
      </div>
      <div className="side-bar"></div>
      <div className="main-area">
        {" "}
        <LandingPage />
      </div>

      <div className="footer">Footer</div>
    </div>
  );
}

export default App;
