import LandingPage from "./components/landingPage/LandingPage.jsx";
import Navbar from "./components/navbar/Navbar.jsx";
import "./App.css";
function App() {
  return (
    <div className="grid-container">
      <div className="header">
        <Navbar />
      </div>

      <div className="main-area">
        <LandingPage />
      </div>

      <div className="footer">Footer</div>
    </div>
  );
}

export default App;
