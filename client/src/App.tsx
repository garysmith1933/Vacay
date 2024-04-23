// @ts-ignore
import './App.css'
import Mexico from './assets/vacation-images/mexico.jpg'
import { Link } from "react-router-dom";
import { useEffect, useState } from 'react';
import axios from "axios";


const App: React.FC = () => { // List of all vacation locations -> excursion for single vacation, mexico needs to link to own page
    const [ vacation, setVacation ] = useState("")
    useEffect(() => {
        const getVacations = async() => {
            await axios.get("http://localhost:8080/vacations").then(response => {
                console.log(response)
                return response.data
            })
        }

        // @ts-ignore
        setVacation(getVacations())
    }, []);

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
