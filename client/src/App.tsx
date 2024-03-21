import './App.css'
import Mexico from './assets/vacation-images/mexico.jpg'
import { Link } from "react-router-dom";

// map vacations stored in database to be loaded when the app starts.


const App: React.FC = () => { // List of all vacation locations -> excursion for single vacation, mexico needs to link to own page
  return (
    <>
      <div>
        <h1> Hello World </h1>
      </div>

      <div id='mexico'>
        <Link to ="/vacation">
          <img id='mexico-image' src={Mexico}/>
          <h2>Mexico</h2>
        </Link>
      </div>
      
    </>
  )
}

export default App
